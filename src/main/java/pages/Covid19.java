package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Covid19 {
    WebDriver driver;
    private By covidLink =By.xpath("//li[1]//a[1]");
    By covidBanner = By.xpath("//img[@alt='cat_banner']");

    public Covid19(WebDriver driver) {
        this.driver = driver;

    }
    public void CovidItems(){
        driver.findElement(covidLink).click();

    }

    public boolean VerifyCovidButton(){
        return driver.findElement(covidBanner).isDisplayed();
    }

}
