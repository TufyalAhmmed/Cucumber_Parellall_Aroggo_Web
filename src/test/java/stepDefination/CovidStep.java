package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.Covid19;
import utils.baseTests;

public class CovidStep  {
    private WebDriver driver;
    Covid19 covid;
    baseTests baseTests;

    public CovidStep(baseTests baseTests) {
        this.baseTests = baseTests;
        this.driver = this.baseTests.getDriver();
        covid = new Covid19(driver);
    }

    @Given("User on Homepage")
    public void user_on_homepage() {
//        System.setProperty("webdriver.chrome.driver", "resources/Chromedriver.exe");
//        driver = new ChromeDriver();
        driver.get("https://arogga.com");

    }
    @When("User Clicked on Covid Nineteen Button")
    public void user_clicked_on_covid_nineteen_button() throws InterruptedException {
        Thread.sleep(1000);
      covid.CovidItems();
      Thread.sleep(1000);

        //  Assert.assertTrue(covid.CovidItems());

    }
    @Then("Verify Covid Nineteen Banner  Displays on Top of the page")
    public void verify_covid_nineteen_banner_displays_on_top_of_the_page() throws InterruptedException {
        Thread.sleep(2000);
        covid.VerifyCovidButton();
        //Assert.assertTrue(covid.VerifyCovidButton());
        Thread.sleep(5000);

    }
}
