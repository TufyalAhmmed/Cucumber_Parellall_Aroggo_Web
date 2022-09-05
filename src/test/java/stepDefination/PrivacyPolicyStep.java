package stepDefination;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HealthCareAndProduct;
import pages.PrivacyPolicy;

public class PrivacyPolicyStep {
    private WebDriver driver;
    PrivacyPolicy privacyPolicy;
    utils.baseTests baseTests;

    public PrivacyPolicyStep(utils.baseTests baseTests) {
        this.baseTests = baseTests;
        this.driver = this.baseTests.getDriver();
        privacyPolicy= new PrivacyPolicy(driver);
    }

    @When("User Clicked on privacy Policy Button")
    public void user_clicked_on_privacy_policy_button() throws InterruptedException {
        privacyPolicy.privacy();
        Thread.sleep(2000);
    }

}
