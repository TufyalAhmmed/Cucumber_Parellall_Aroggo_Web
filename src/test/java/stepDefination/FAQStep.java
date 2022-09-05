package stepDefination;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.FAQ;
import pages.ReturnAndRefundPolicy;

public class FAQStep {
    private WebDriver driver;
    FAQ faq;
    utils.baseTests baseTests;

    public FAQStep(utils.baseTests baseTests) {
        this.baseTests = baseTests;
        this.driver = this.baseTests.getDriver();
        faq = new FAQ(driver);
    }


    @When("User Scroll till Bottom of HomePage")
    public void user_scroll_till_bottom_of_home_page() throws InterruptedException {
       faq.BottomPage(12);
       Thread.sleep(3000);

    }


    @When("User Clicked on FAQ")
    public void user_clicked_on_faq() throws InterruptedException {
        Thread.sleep(1000);
        faq.FAQs();
        Thread.sleep(3000);

    }

    @When("User Clicked on Medicine and HealthCare Order Button")
    public void user_clicked_on_medicine_and_health_care_order_button() throws InterruptedException {
        faq.MAHOs();
        Thread.sleep(3000);
    }

    @When("User Clicked on Delivery Button")
    public void user_clicked_on_delivery_button() throws InterruptedException {
        faq.Deliveryss();
        Thread.sleep(3000);

    }

    @When("User Clicked on Referrals")
    public void user_clicked_on_referrals() throws InterruptedException {
        faq.Referrals();
        Thread.sleep(3000);

    }

    @When("User Clicked on Arogga Cash")
    public void user_clicked_on_arogga_cash() throws InterruptedException {
        faq.AroggoCashs();
        Thread.sleep(3000);

    }

    @When("User Clicked on Promotions Button")
    public void user_clicked_on_promotions_button() throws InterruptedException {
        faq.Promotions();
        Thread.sleep(3000);

    }

    @When("User Clicked on Return Button")
    public void user_clicked_on_return_button() throws InterruptedException {
        Thread.sleep(3000);
        faq.Returnss();

    }

}
