package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HealthCareAndProduct {

    public WebDriver driver;

    private By HealthCareAndProductLink = By.xpath("//a[normalize-space()='Healthcare Product']");
    private By HealthCareAndProductButton = By.xpath("//p[normalize-space()='Vigogel']");
    private By Scroll = By.xpath("//span[contains(text(), 'Description')]");

    public HealthCareAndProduct(WebDriver driver) {
        this.driver = driver;

    }

    public void HealthCareAndProductButton() {

        driver.findElement(HealthCareAndProductLink).click();

    }

    public void VerifyPersonalCareProductChoose() {

        driver.findElement(HealthCareAndProductButton).click();
    }


    public void scrollToParagraph(int index) {

        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor) driver;
//        while (getNumberOfParagraphsPresent() < index) {
//            jsExecutor.executeScript(script);
//        }
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)", driver.findElement(Scroll));

    }

    private int getNumberOfParagraphsPresent() {
        return driver.findElements(Scroll).size();
    }



}
