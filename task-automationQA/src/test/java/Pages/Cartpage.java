package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {

    @FindBy( id = "com.nopstation.nopcommerce.nopstationcart:id/counterIcon")
    WebElement cartIconID;

    @FindBy (id = "com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut")
    WebElement checkOutBtn;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout")
    WebElement asGuest;

    public Cartpage(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public void gotoCheckout() throws InterruptedException {
        cartIconID.click();
        //Thread.sleep(000);
        checkOutBtn.click();
        Thread.sleep(1000);
        asGuest.click();
    }



}
