package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FAQ {

    private WebDriver driver;

    private By bottomPage = By.xpath("//*[@id=\"__next\"]/main/div/div[2]/footer");
    private By FAQLink = By.xpath("//a[@href='/faq']");
    private By MAHOLink = By.xpath("//div[@id='medicineAndHealthcareOrders']");
    private By DeliveryLink = By.xpath("//div[@id=\"delivery\"]");
    private By PaymentsLink = By.xpath("//div[@id='payments']");
    private By ReferralsLink = By.xpath("//div[@id='referrals']");
    private By AroggoCashLink = By.xpath("//div[@id='AroggaCash']");
    private By PromotionsLink = By.xpath("//div[@id='promotions']");
    private By ReturnLink = By.xpath("//div[@id='return']");


    public FAQ(WebDriver driver) {
        this.driver = driver;

    }

    public void BottomPage(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor) driver;
//        while (getNumberOfParagraphsPresent() < index) {
//            jsExecutor.executeScript(script);
//        }
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)", driver.findElement(bottomPage));

    }



    public void FAQs() {
//        driver.findElement(FAQLink).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(FAQLink));
    }

    public void MAHOs() {
        driver.findElement(MAHOLink).click();

    }

    public void Deliveryss() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.elementToBeClickable(DeliveryLink));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(DeliveryLink));
//        driver.findElement(DeliveryLink).click();

    }

    public void Payments() {
        driver.findElement(PaymentsLink).click();

    }

    public void Referrals() {
        driver.findElement(ReferralsLink).click();

    }

    public void AroggoCashs() {
        driver.findElement(AroggoCashLink).click();

    }

    public void Promotions() {
        driver.findElement(PromotionsLink).click();

    }

    public void Returnss() {
        driver.findElement(ReturnLink).click();

    }

}
