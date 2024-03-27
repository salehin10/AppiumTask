package Runner;

import Pages.*;
import Utils.Setup;
import org.testng.annotations.Test;



public class TestRunner extends Setup {

    @Test(priority = 1)
    public void addItem() throws InterruptedException {
        Home home = new Home(driver);
        home.addItem();
    }
    @Test (priority = 2)
    public void goToCheckOut() throws InterruptedException {
        Cartpage cart = new Cartpage(driver);
        cart.gotoCheckout();
    }
    @Test (priority = 3)
    public void addBillingInfo() throws InterruptedException {
        BillingPage billingPage = new BillingPage(driver);
        billingPage.addBilligInfo();
    }
    @Test(priority = 4)
    public void goToShipping() throws InterruptedException {
        Shipping shipping = new Shipping(driver);
        shipping.shippingInfo();
    }
    @Test(priority = 5)
    public void goToPayment() throws InterruptedException {
        Payment payment = new Payment(driver);
        payment.choosePaymentInfo();
    }

    @Test(priority = 6)
    public  void paymentConfirmation() throws InterruptedException {
        PaymentConfirmationPage paymentConfirmationPage  =new PaymentConfirmationPage(driver);
        paymentConfirmationPage.paymentConfirmation();
    }

    @Test(priority = 7)
    public void orderConfirmation() throws InterruptedException {
        OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);
        orderConfirmationPage.oderConfirmation();
    }
}
