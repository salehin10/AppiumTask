package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home {
    AndroidDriver driver;
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Category\"]/android.widget.FrameLayout/android.widget.ImageView")
    WebElement ourCategory;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[7]/android.widget.TextView")
    WebElement electronicsItem;

    @FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Placeholder\"])[9]")
    WebElement mattressItem;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart")
    WebElement addtoCart;

    @FindBy (id = "com.nopstation.nopcommerce.nopstationcart:id/btnAccept")
    WebElement popUp;

    public Home(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }

    public void addItem() throws InterruptedException {
        popUp.click();
        Thread.sleep(1000);
        ourCategory.click();
        Thread.sleep(1000);
        electronicsItem.click();
        Thread.sleep(1000);
        // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0))").click();
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector())" +
                ".scrollIntoView(new UiSelector().text(\"" +"Mattress Bedroom"+ "\"));")).click();

        //Thread.sleep(000);
        int click = 0;
        for (int i =0; i<2; i++){
            addtoCart.click();
            Thread.sleep(2000);
            click++;
        }


    }















}
