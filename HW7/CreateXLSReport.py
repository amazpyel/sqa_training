__author__ = 'pylkevych'

from xlwt import Workbook, easyxf
import os
import time

pass_cell = easyxf(
    'pattern: pattern solid, fore_colour green;'
    'border: right thin, bottom thin, left thin, top thin;'
    'align: vertical center, horizontal center;'
)
fail_cell = easyxf(
    'pattern: pattern solid, fore_colour red;'
    'border: right thin, bottom thin, left thin, top thin;'
    'align: vertical center, horizontal center;'
    'font: bold True;'
)

header_style = easyxf(
    'border: right thin, bottom thin, left thin, top thin;'
    'align: vertical center, horizontal center;'
    'font: italic True, bold True;'
)

testcase_cell = easyxf('border: right thin, bottom thin, left thin, top thin')

parentdir = os.path.dirname(os.path.realpath(__file__))
reports = [parentdir + "/reports/" + x for x in os.listdir(parentdir + "/reports")]
book = Workbook()
sheet1 = book.add_sheet('Report')
sheet1.col(0).width = 4000

#############################
# HEADER           #
sheet1.write(0, 0, 'TEST', header_style)
sheet1.write(0, 1, 'RESULT', header_style)
#############################

fail_res = '<td bgcolor="#FF0000">fail</td>'
pass_res = '<td bgcolor="#00CC00">true</td>'
row = 1
for testcase in reports:
    tc = testcase.split("/")
    print tc[-1]
    sheet1.write(row, 0, tc[-1], testcase_cell)
    report = open(testcase, 'r')
    count_pass = 0
    count_fail = 0
    column1 = 3
    for line in report:
        if pass_res in line:
            count_pass += 1
        if fail_res in line:
            count_fail += 1
    print("fail count = " + str(count_fail) + "\t" + "pass count = " + str(count_pass))
    if count_fail > 0:
        sheet1.write(row, 1, 'FAIL', fail_cell)
    else:
        sheet1.write(row, 1, 'PASS', pass_cell)
    report.close()
    row += 1

book.save( time.strftime("%d%m%Y") + 'results.xls')
