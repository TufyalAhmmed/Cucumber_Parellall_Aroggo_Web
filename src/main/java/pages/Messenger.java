package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Messenger {
    private WebDriver driver;

    private By messengerButton= By.xpath("//body/div[@id='__next']/main/div/div[2]");
    private By continueAsGuestButton = By.xpath("//body//div//div//div//div//*[name()='svg']");
    private By minimizeButton = By.xpath("//body//div//div//div//div//*[name()='svg']");


    public Messenger(WebDriver driver) {
        this.driver = driver;

    }

    public void MessengerPopUp(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor) driver;
//        while (getNumberOfParagraphsPresent() < index) {
//            jsExecutor.executeScript(script);
//        }
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)", driver.findElement(messengerButton));
        driver.findElement(minimizeButton).click();
    }




    public void ClickOnConinueAsGuestButton() {
////        driver.findElement(FAQLink).click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", driver.findElement(continueAsGuestButton));
//        driver.findElement(continueAsGuestButton).click();


            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
            wait.until(ExpectedConditions.elementToBeClickable(continueAsGuestButton));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", driver.findElement(continueAsGuestButton));

    }

    public void ClickOnMinimizeButton() {
//        driver.findElement(FAQLink).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(minimizeButton));
        driver.findElement(minimizeButton).click();
    }


}
