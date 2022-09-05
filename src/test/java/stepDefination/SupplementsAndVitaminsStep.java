package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.PersonalCare;
import pages.SupplementsAndVitamins;

public class SupplementsAndVitaminsStep {
    private WebDriver driver;
    SupplementsAndVitamins supplementsAndVitamins;
    utils.baseTests baseTests;

    public SupplementsAndVitaminsStep(utils.baseTests baseTests) {
        this.baseTests = baseTests;
        this.driver = this.baseTests.getDriver();
        supplementsAndVitamins = new SupplementsAndVitamins(driver);
    }


    @When("User clicked on Supplements and Vitamins Button")
    public void user_clicked_on_supplements_and_vitamins_button() {
        supplementsAndVitamins.SupplementsAndVitaminsItems();
    }
    @Given("Verify Supplements and Vitamins Banner Displays on Top of the page")
    public void verify_supplements_and_vitamins_banner_displays_on_top_of_the_page() throws InterruptedException {
        Thread.sleep(1000);
        supplementsAndVitamins.VerifyPersonalCareButton();
        Thread.sleep(5000);

    }


}
