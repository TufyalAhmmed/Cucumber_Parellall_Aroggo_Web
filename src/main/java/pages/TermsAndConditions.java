package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TermsAndConditions {
    private WebDriver driver;
    private By termsAndConditionsLink =By.xpath("//a[normalize-space()='Terms and Conditions']");


    public TermsAndConditions(WebDriver driver) {
        this.driver = driver;

    }
    public void TermsAndConditionsButton(){
//        driver.findElement(termsAndConditionsLink).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.elementToBeClickable(termsAndConditionsLink));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(termsAndConditionsLink));
//        driver.findElement(DeliveryLink).click();

    }
}
