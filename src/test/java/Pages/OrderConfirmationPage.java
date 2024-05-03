package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderConfirmationPage {
    AndroidDriver driver;
    WebDriverWait wait;
    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnContinue")
    WebElement confirmBtn;

    public OrderConfirmationPage(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
        wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void oderConfirmation() throws InterruptedException {
        Thread.sleep(1000);
//        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector())" +
//                ".scrollIntoView(new UiSelector().text(\"" +"Mattress Bedroom"+ "\"));"));
        confirmBtn.click();

        WebElement confirmationMessage= wait.until(ExpectedConditions.visibilityOf(driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/md_text_message"))));
        String actual = confirmationMessage.getText();
        System.out.println(actual);
        Assert.assertTrue(actual.contains("Your order has been successfully processed!"));
    }
}
