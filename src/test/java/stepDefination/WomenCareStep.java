package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.WomenCare;
import utils.baseTests;

public class WomenCareStep {
    private WebDriver driver;
    WomenCare womenCare;
    utils.baseTests baseTests;

    public WomenCareStep(baseTests baseTests) {
        this.baseTests = baseTests;
        this.driver = this.baseTests.getDriver();
        womenCare = new WomenCare(driver);
    }
    @When("User Clicked on WomenCare Button")
    public void user_clicked_on_women_care_button() {
       womenCare.WomenCareItems();
    }
    @Then("Verify  Female Banner Displays on Top of the page")
    public void verify_female_banner_displays_on_top_of_the_page() throws InterruptedException {

        Thread.sleep(5000);
        womenCare.VerifyWomenCareButton();
        Thread.sleep(2000);

    }


}