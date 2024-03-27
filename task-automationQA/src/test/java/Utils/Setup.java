package Utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Setup {


         public  AndroidDriver driver;
        @BeforeTest
        public AndroidDriver setup () throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            String apkFilePath = System.getProperty("user.dir") + "/resources/nopstationCart_4.40 1";
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "13.0");
            caps.setCapability("appPackage", "com.nopstation.nopcommerce.nopstationcart");
            caps.setCapability("appActivity", "com.bs.ecommerce.main.SplashScreenActivity");
            caps.setCapability("app", new File(apkFilePath).getAbsolutePath());

            URL url = new URL ( "http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver(url, caps);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            return  driver;
        }

        @AfterTest
        public void closeApp(){
            driver.close();
            int a = 0;
            int b = 5;
            System.out.println(a+b);
            driver.quit();
        }


}
