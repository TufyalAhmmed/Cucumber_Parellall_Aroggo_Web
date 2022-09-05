package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LegitScript {
    public WebDriver driver;
    private By legitParagraph = By.xpath("//*[@id=\"__next\"]/main/div/div[2]/footer/div[2]");

    private By legit = By.xpath("//body//div//div//div//div//*[name()='svg']");

    public LegitScript(WebDriver driver) {
        this.driver = driver;

    }
    public void ScrollTillLegitScript(int index) {

        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor) driver;
//        while (getNumberOfParagraphsPresent() < index) {
//            jsExecutor.executeScript(script);
//        }
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)", driver.findElement(legitParagraph));

    }
    public void VerifyLegitScriptClicked() throws InterruptedException {

////        driver.findElement(aboutUsButton).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
//        wait.until(ExpectedConditions.elementToBeClickable(legit));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", driver.findElement(legit));
        driver.findElement(legit).click();
        Thread.sleep(4000);

    }
}
