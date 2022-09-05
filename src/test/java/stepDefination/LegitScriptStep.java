package stepDefination;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AboutUs;
import pages.LegitScript;

public class LegitScriptStep {
    private WebDriver driver;
    LegitScript legitScript;
    utils.baseTests baseTests;

    public LegitScriptStep(utils.baseTests baseTests) {
        this.baseTests = baseTests;
        this.driver = this.baseTests.getDriver();
      legitScript = new LegitScript(driver);
    }
    @When("User Scroll till Legit Script Paragraph")
    public void user_scroll_till_legit_script_paragraph() throws InterruptedException {
        Thread.sleep(1000);
        legitScript.ScrollTillLegitScript(12);
        Thread.sleep(5000);

    }


    @When("Click on Legit Script Button")
    public void click_on_legit_script_button() throws InterruptedException {
        Thread.sleep(1000);
        legitScript.VerifyLegitScriptClicked();


    }
}
