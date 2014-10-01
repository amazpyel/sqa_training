import os

parentdir = os.path.dirname(os.path.realpath(__file__))
testcases = [parentdir + "/tc/" + x for x in os.listdir(parentdir + "/tc") if x.endswith(".py")]

for testcase in testcases:
    tc = testcase.split("/")
    print "Current TC is " + tc[-1] + " (" + str(testcases.index(testcase) + 1) + " from " + str(len(testcases)) + ")"
    os.system("/home/amazpyel/android-sdk-linux/tools/monkeyrunner " + testcase)
