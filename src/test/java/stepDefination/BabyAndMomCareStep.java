package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BabyAndMomCare;


public class BabyAndMomCareStep {
    private WebDriver driver;
    BabyAndMomCare babyAndMomCare;
    utils.baseTests baseTests;

    public BabyAndMomCareStep(utils.baseTests baseTests) {
        this.baseTests = baseTests;
        this.driver = this.baseTests.getDriver();
        babyAndMomCare= new BabyAndMomCare(driver);
    }

    @When("User clicked on Baby & Mom Care  Button")
    public void user_clicked_on_baby_mom_care_button() {
        babyAndMomCare.BabyAndMomCareItems();
    }

    @Given("Verify Herbal and Baby & Mom Care  Displays on Top of the page")
    public void verify_herbal_and_baby_mom_care_displays_on_top_of_the_page() throws InterruptedException {
        Thread.sleep(2000);
        babyAndMomCare.VerifyBabyAndMomCareButton();
        Thread.sleep(5000);
    }
}
