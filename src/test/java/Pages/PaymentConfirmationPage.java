package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentConfirmationPage {

    @FindBy(className = "android.widget.Button")
    WebElement nextBtn;

    public PaymentConfirmationPage(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void paymentConfirmation() throws InterruptedException {
        Thread.sleep(2500);
        nextBtn.click();
    }
}
