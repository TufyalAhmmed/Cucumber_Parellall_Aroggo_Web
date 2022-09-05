package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Messenger;


public class MessengerStep {
    private WebDriver driver;
    Messenger messenger;
    utils.baseTests baseTests;

    public MessengerStep(utils.baseTests baseTests) {
        this.baseTests = baseTests;
        this.driver = this.baseTests.getDriver();
        messenger= new Messenger(driver);
    }


    @When("User Clicked on Messenger Button")
    public void user_clicked_on_messenger_button() throws InterruptedException {
        Thread.sleep(1000);
        messenger.MessengerPopUp(2);
        Thread.sleep(2000);
    }

    @When("Continue as Guest")
    public void continue_as_guest() throws InterruptedException {
        Thread.sleep(2000);
        messenger.ClickOnConinueAsGuestButton();
        Thread.sleep(2000);
    }

    @Then("Minimize Button")
    public void minimize_button() throws InterruptedException {
        Thread.sleep(2000);
        messenger.ClickOnMinimizeButton();
        Thread.sleep(2000);
    }

}
