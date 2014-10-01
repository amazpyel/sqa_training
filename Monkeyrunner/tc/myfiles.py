from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice
device = MonkeyRunner.waitForConnection()

package = 'com.sec.android.app.myfiles'
activity = 'com.sec.android.app.myfiles.MainActivity'
runComponent = package + '/' + activity

device.startActivity(component=runComponent)
MonkeyRunner.sleep(2.0)

MonkeyRunner.sleep(1.0)

device.takeSnapshot().writeToFile('/tmp/monkeyshot.png','png')
