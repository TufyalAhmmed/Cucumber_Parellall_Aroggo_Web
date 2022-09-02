package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Devices;
import pages.WomenCare;
import utils.baseTests;

public class DevicesStep {
    private WebDriver driver;
    Devices devices;
    utils.baseTests baseTests;

    public DevicesStep(utils.baseTests baseTests) {
        this.baseTests = baseTests;
        this.driver = this.baseTests.getDriver();
        devices = new Devices(driver);
    }

    @When("User Clicked on Devices Button")
    public void user_clicked_on_devices_button() {
      devices.DeviceItems();
    }

    @Then("Verify Devices Banner Displays on Top of the page")
    public void verify_devices_banner_displays_on_top_of_the_page() throws InterruptedException {
        Thread.sleep(2000);
       devices.VerifyDevicesButton();
       Thread.sleep(5000);
    }

}
