package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WomenCare {
    WebDriver driver;
    private By womencareLink =By.xpath("//span[normalize-space()='Women Care']");
    By womencareBanner = By.xpath("//img[@alt='cat_banner']");

    public WomenCare(WebDriver driver) {
        this.driver = driver;

    }
    public void WomenCareItems(){
        driver.findElement(womencareLink).click();

    }

    public boolean VerifyWomenCareButton(){
        return driver.findElement(womencareBanner).isDisplayed();
    }

}


