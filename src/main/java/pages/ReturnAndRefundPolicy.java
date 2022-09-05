package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReturnAndRefundPolicy {
    WebDriver driver;

    private By returnAndRefundPolicyLink =By.xpath("//a[normalize-space()='Return and Refund Policy']");


    public ReturnAndRefundPolicy (WebDriver driver) {
        this.driver = driver;

    }

    public void Return(){
        driver.findElement(returnAndRefundPolicyLink).click();

    }

}
