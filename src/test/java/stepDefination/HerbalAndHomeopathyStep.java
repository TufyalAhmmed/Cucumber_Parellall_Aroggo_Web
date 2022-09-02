package stepDefination;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Devices;
import pages.HerbalAndHomeopathy;

public class HerbalAndHomeopathyStep {
    private WebDriver driver;
    HerbalAndHomeopathy herbalAndHomeopathy;
    utils.baseTests baseTests;

    public HerbalAndHomeopathyStep(utils.baseTests baseTests) {
        this.baseTests = baseTests;
        this.driver = this.baseTests.getDriver();
        herbalAndHomeopathy = new HerbalAndHomeopathy(driver);
    }


    @When("User clicked on Herbal and Homeopathy Button")
    public void user_clicked_on_herbal_and_homeopathy_button() {

        herbalAndHomeopathy.HerbalAndHomeopathyItems();
    }

    @Given("Verify Herbal and Homeopathy Banner Displays on Top of the page")
    public void verify_herbal_and_homeopathy_banner_displays_on_top_of_the_page() throws InterruptedException {
        Thread.sleep(2000);
        herbalAndHomeopathy.VerifyHerbalAndHomeopathyButton();
        Thread.sleep(5000);
    }

}
