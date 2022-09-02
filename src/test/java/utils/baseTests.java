package utils;

import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class baseTests {
    private WebDriver driver;

    public baseTests() {
        System.setProperty("webdriver.chrome.driver", "resources/Chromedriver.exe");
        driver = new ChromeDriver();
//        driver = new ChromeDriver();
//        driver.get("https://arogga.com");
    }

    public WebDriver getDriver(){
        return this.driver;
    }
}
