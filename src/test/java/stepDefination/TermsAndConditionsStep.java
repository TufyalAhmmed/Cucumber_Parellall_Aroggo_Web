package stepDefination;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.PrivacyPolicy;
import pages.TermsAndConditions;

public class TermsAndConditionsStep {
    private WebDriver driver;
    TermsAndConditions termsAndConditions;
    utils.baseTests baseTests;

    public TermsAndConditionsStep(utils.baseTests baseTests) {
        this.baseTests = baseTests;
        this.driver = this.baseTests.getDriver();
        termsAndConditions= new TermsAndConditions(driver);
    }

    @When("User Clicked on Terms and Conditions Button")
    public void user_clicked_on_terms_and_conditions_button() throws InterruptedException {
        Thread.sleep(2000);
        termsAndConditions.TermsAndConditionsButton();
      Thread.sleep(2000);

    }

}
