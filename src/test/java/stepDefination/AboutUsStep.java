package stepDefination;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AboutUs;
import pages.HealthCareAndProduct;

public class AboutUsStep {
    private WebDriver driver;
    AboutUs aboutUs;
    utils.baseTests baseTests;

    public AboutUsStep(utils.baseTests baseTests) {
        this.baseTests = baseTests;
        this.driver = this.baseTests.getDriver();
        aboutUs= new AboutUs(driver);
    }
    @When("User Scroll till Bottom of the page")
    public void user_scroll_till_bottom_of_the_page() throws InterruptedException {
        aboutUs.ScrollTillAboutUs(12);
        Thread.sleep(8000);

    }
    @When("Click on About Us Button")
    public void click_on_about_us_button() throws InterruptedException {
        aboutUs.VerifyClicked();
        Thread.sleep(8000);


    }
    @When("Scroll About Us Page for finding press coverage")
    public void scroll_about_us_page_for_finding_press_coverage() throws InterruptedException {
        aboutUs.scrollToMediaCoverage(12);
        Thread.sleep(4000);


    }

}
