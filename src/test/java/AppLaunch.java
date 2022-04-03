import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class AppLaunch {
    AndroidDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","My device");
        cap.setCapability("uuid","EUC4C16620016398");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","7.0");
        cap.setCapability("appPackage","com.google.android.calculator");
        cap.setCapability("appActivity","com.android.calculator2.Calculator");
        cap.setCapability("autoGrantPermissions","true");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url,cap);

    }

    @AfterTest
    public void closeApp() {
        //driver.quit();
    }

}
