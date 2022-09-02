package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SexualWellness {
    WebDriver driver;
    private By sexualWellnessLink =By.xpath("//span[normalize-space()='Sexual Wellness']");
    By sexualWellnessBanner = By.xpath("//img[@alt='cat_banner']");

    public SexualWellness(WebDriver driver) {
        this.driver = driver;

    }
    public void SexualWellnessItems(){
        driver.findElement(sexualWellnessLink).click();

    }

    public boolean VerifySexualWellnessButton(){
        return driver.findElement(sexualWellnessBanner).isDisplayed();
    }


}
