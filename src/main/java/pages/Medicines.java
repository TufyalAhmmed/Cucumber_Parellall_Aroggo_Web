package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Medicines {

    private WebDriver driver;

    private By medicineButton = By.xpath("//a[normalize-space()='Medicines']");

    public Medicines(WebDriver driver) {
        this.driver = driver;

    }
    public void ClickOnmedicine() {
//        driver.findElement(medicineButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.elementToBeClickable(medicineButton));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(medicineButton));
//        driver.findElement(DeliveryLink).click();

    }

}
