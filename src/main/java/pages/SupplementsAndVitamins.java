package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SupplementsAndVitamins {
    WebDriver driver;
    private By SupplementsAndVitaminsLink =By.xpath("//span[normalize-space()='Supplements and Vitamins']");
    By SupplementsAndVitaminsBanner = By.xpath("//img[@alt='cat_banner']");

    public SupplementsAndVitamins(WebDriver driver) {
        this.driver = driver;

    }
    public void SupplementsAndVitaminsItems(){
        driver.findElement(SupplementsAndVitaminsLink).click();

    }

    public boolean VerifyPersonalCareButton(){
        return driver.findElement(SupplementsAndVitaminsBanner).isDisplayed();
    }

}
