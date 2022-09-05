package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Covid19;
import pages.VideoInstruction;
import utils.baseTests;

public class VideoInstructionStep {
    private WebDriver driver;
    VideoInstruction videoinstruction;
    utils.baseTests baseTests;

    public VideoInstructionStep(baseTests baseTests) {
        this.baseTests = baseTests;
        this.driver = this.baseTests.getDriver();
      videoinstruction = new VideoInstruction(driver);
    }
    @When("User Clicked on Stream Button")
    public void user_clicked_on_stream_button() throws InterruptedException {
        Thread.sleep(1000);
        videoinstruction.VideoItems();

    }
    @Then("Verify video play's")
    public void verify_video_play_s() throws InterruptedException {
        Thread.sleep(1000);
        videoinstruction.VerifyVideobanner();


    }

}
