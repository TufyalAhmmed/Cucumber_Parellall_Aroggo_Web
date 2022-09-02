package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.baseTests;

public class HomeStep extends baseTests {

  private WebDriver driver;
   @BeforeClass
    @Given("Open Chrome Browser")
    public void open_chrome_browser() {

            System.setProperty("webdriver.chrome.driver", "resources/Chromedriver.exe");
          driver = new ChromeDriver();

        }

    @BeforeMethod
        @When("Put the Correct URL and hit enter")
    public void put_the_correct_uel_and_hit_enter() {
        driver.get("https://arogga.com");
    }
    @Then("User should be into the homepage")
    public void user_should_be_into_the_homepage() throws InterruptedException {
        Thread.sleep(5000);
    }

}
