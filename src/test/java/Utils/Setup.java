package Utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Setup {


         public  AndroidDriver driver;
        @BeforeTest
        public AndroidDriver setup () throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "13.0");
            caps.setCapability("appPackage", "com.nopstation.nopcommerce.nopstationcart");
            caps.setCapability("appActivity", "com.bs.ecommerce.main.SplashScreenActivity");
            caps.setCapability("app", "C:\\Users\\user\\Downloads\\nopstationCart_4.40 1.apk");

            URL url = new URL ( "http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver(url, caps);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            return  driver;
        }

        @AfterTest
        public void closeApp(){
            driver.quit();
        }


}
