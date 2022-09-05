package stepDefination;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ReturnAndRefundPolicy;
import pages.TermsAndConditions;

public class ReturnAndRefundPolicyStep {
    private WebDriver driver;
    ReturnAndRefundPolicy returnAndRefundPolicy;
    utils.baseTests baseTests;

    public ReturnAndRefundPolicyStep(utils.baseTests baseTests) {
        this.baseTests = baseTests;
        this.driver = this.baseTests.getDriver();
        returnAndRefundPolicy= new ReturnAndRefundPolicy(driver);
    }

    @When("User Clicked on Return And Refund Policy Button")
    public void user_clicked_on_return_and_refund_policy_button() throws InterruptedException {
        Thread.sleep(4000);
        returnAndRefundPolicy.Return();
        Thread.sleep(2000);

    }

}
