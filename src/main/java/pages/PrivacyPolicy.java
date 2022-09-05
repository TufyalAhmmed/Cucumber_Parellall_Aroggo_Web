package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PrivacyPolicy {
    WebDriver driver;
    private By privacyPolicyLink =By.xpath("//a[normalize-space()='Privacy Policy']");


    public PrivacyPolicy(WebDriver driver) {
        this.driver = driver;

    }
    public void privacy(){
//        driver.findElement(privacyPolicyLink).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.elementToBeClickable(privacyPolicyLink));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(privacyPolicyLink));
//        driver.findElement(DeliveryLink).click();

    }
}
