package stepDefination;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Devices;
import pages.SexualWellness;

public class SexualWellnessStep {

    private WebDriver driver;
    SexualWellness SWN;
    utils.baseTests baseTests;

    public SexualWellnessStep(utils.baseTests baseTests) {
        this.baseTests = baseTests;
        this.driver = this.baseTests.getDriver();
        SWN= new SexualWellness(driver);
    }

    @When("User Clicked on Sexual Wellness Button")
    public void user_clicked_on_sexual_wellness_button() {
        SWN.SexualWellnessItems();

    }
    @Then("Verify Sexual Wellness Banner Displays on Top of the")
    public void verify_sexual_wellness_banner_displays_on_top_of_the() throws InterruptedException {
        Thread.sleep(2000);
        SWN.VerifySexualWellnessButton();
        Thread.sleep(5000);

    }

    }

