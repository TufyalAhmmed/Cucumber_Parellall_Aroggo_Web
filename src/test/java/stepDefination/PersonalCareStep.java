package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HerbalAndHomeopathy;
import pages.PersonalCare;

public class PersonalCareStep {
    private WebDriver driver;
     PersonalCare personalCare;
    utils.baseTests baseTests;

    public PersonalCareStep(utils.baseTests baseTests) {
        this.baseTests = baseTests;
        this.driver = this.baseTests.getDriver();
        personalCare = new PersonalCare(driver);
    }

    @When("User clicked on Personal Care Button")
    public void user_clicked_on_personal_care_button() {
       personalCare.PersonalCareItems();
    }
    @Given("Verify Personal Care Banner Displays on Top of the page")
    public void verify_personal_care_banner_displays_on_top_of_the_page() throws InterruptedException {
       Thread.sleep(2000);
       personalCare.VerifyPersonalCareButton();
       Thread.sleep(5000);

    }


}
