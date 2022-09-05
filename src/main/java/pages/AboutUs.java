package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AboutUs {
    public WebDriver driver;

    private By aboutUsParagraph = By.xpath("//div[@class='jss54']");
    private By aboutUsButton = By.xpath("//a[normalize-space()='About Us']");
    private By pressCoverageParagraph = By.xpath("//h2[normalize-space()='Press Coverage']");

    public AboutUs(WebDriver driver) {
        this.driver = driver;

    }



        public void ScrollTillAboutUs(int index) {

            String script = "window.scrollTo(0, document.body.scrollHeight)";
            var jsExecutor = (JavascriptExecutor) driver;
//        while (getNumberOfParagraphsPresent() < index) {
//            jsExecutor.executeScript(script);
//        }
            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)", driver.findElement(aboutUsParagraph));

        }

//        private int getNumberOfParagraphsPresent() {
//            return driver.findElements(aboutUsParagraph).size();
//        }



    public void VerifyClicked() {

//        driver.findElement(aboutUsButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.elementToBeClickable(aboutUsButton));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(aboutUsButton));
//        driver.findElement(DeliveryLink).click();

    }


    public void scrollToMediaCoverage(int index) {

        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor) driver;
//        while (getNumberOfParagraphsPresent() < index) {
//            jsExecutor.executeScript(script);
//        }
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)", driver.findElement(pressCoverageParagraph));

    }

}
