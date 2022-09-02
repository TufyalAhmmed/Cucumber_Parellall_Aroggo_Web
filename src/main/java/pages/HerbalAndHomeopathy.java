package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerbalAndHomeopathy {
    WebDriver driver;
    private By HerbalAndHomeopathyLink =By.xpath("//span[normalize-space()='Herbal and Homeopathy']");
    By HerbalAndHomeopathsBanner = By.xpath("//img[@alt='cat_banner']");

    public HerbalAndHomeopathy(WebDriver driver) {
        this.driver = driver;

    }
    public void HerbalAndHomeopathyItems(){
        driver.findElement(HerbalAndHomeopathyLink).click();

    }

    public boolean VerifyHerbalAndHomeopathyButton(){
        return driver.findElement(HerbalAndHomeopathsBanner).isDisplayed();
    }

}
