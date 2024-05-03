package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillingPage {
    AndroidDriver driver;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etFirstName")
    WebElement firstName;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etLastName")
    WebElement lastName;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etEmail")
    WebElement email;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/countrySpinner")
    WebElement countrylist;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/stateSpinner")
    WebElement state;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etCompanyName")
    WebElement company;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etCity")
    WebElement city;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress")
    WebElement streeAddress1;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etZipCode")
    WebElement zipCode;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnContinue")
    WebElement continueBtn;

    public BillingPage(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;

    }

    public void addBilligInfo() throws InterruptedException{
        Thread.sleep(1000);
        firstName.sendKeys("Jon");
        lastName.sendKeys("Doe");
        email.sendKeys("johnDoe@gmail.com");

        countrylist.click();
        Thread.sleep(1000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"United States of America\")")).click();
        state.click();
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Alabama\")")).click();

       company.sendKeys("Test Company");
       city.sendKeys("Troy");
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector())" +
                ".scrollIntoView(new UiSelector().text(\"" +"Zip / postal code"+ "\"));"));
       streeAddress1.sendKeys("Test Address");
       zipCode.sendKeys("8200");
       continueBtn.click();




    }
}
