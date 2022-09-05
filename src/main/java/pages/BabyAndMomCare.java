package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BabyAndMomCare {
    WebDriver driver;
    private By BabyAndMomCareLink =By.xpath("//*[@id=\"__next\"]/main/div/div[1]/div/ul/li[5]/a");
    By BabyAndMomCareBanner = By.xpath("//img[@alt='cat_banner']");

    public BabyAndMomCare(WebDriver driver) {
        this.driver = driver;

    }
    public void BabyAndMomCareItems(){
        driver.findElement(BabyAndMomCareLink).click();

    }

    public boolean VerifyBabyAndMomCareButton(){
        return driver.findElement(BabyAndMomCareBanner).isDisplayed();
    }
}
