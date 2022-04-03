# Google_Calculator_App_Automation_Appium

## Prerequisite
1. Need to install jdk 8 or 11 or any LTS version
2. Set up Java Home
3. Need to install Android Studio
4. Set up Android Studio Home & configure it to the environment path
5. Need to install Appium

## How to Run the Project
1. Install the appium server
2. Connect a phone with your pc
3. Make sure the phone is in developer mode and the screen should never sleep
4. Open the appium server and start
5. Open the inspector tool & set the desired capabilities & save it
6. Select the saved desired capabilites and click the start session
7. Clone the repo
8. Open terminal
9. Hit the following command

```
gradle clean test
```

## Attachment
#### Desired Capabilities

```
{
  "appium:deviceName": "My Device",
  "appium:uuid": "adb phone id from cmd",
  "platformName": "Android",
  "appium:platformVersion": "Your Phone Version",
  "appium:appPackage": "com.google.android.calculator",
  "appium:appActivity": "com.android.calculator2.Calculator"
 } 
 
 ```
