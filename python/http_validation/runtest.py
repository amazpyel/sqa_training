import os
from xml.dom import minidom

from sendemail import send_email


os.system('python http_checker.py')

reports_dir = 'test-reports' # path to your log directory

reports = sorted([ f for f in os.listdir(reports_dir)])

print "Last test report = %s" % (reports[-1],)

xmldoc = minidom.parse(reports_dir + "/" + reports[-1])
testsuites = xmldoc.getElementsByTagName('testsuite')
# print len(testsuites)
errors_count = int(testsuites[0].attributes['errors'].value)
failures_count = int(testsuites[0].attributes['failures'].value)

if errors_count == 0 and failures_count == 0:
    send_email(reports_dir + "/" + reports[-1], "[Test Report]All tests passed!")
else:
    send_email(reports_dir + "/" + reports[-1], "[Test Report]Test run failed!")
