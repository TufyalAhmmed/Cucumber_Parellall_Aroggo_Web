package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Covid19 {

    WebDriver driver;
    private By covidLink =By.xpath("//span[normalize-space()='Covid-19 Special']");
    By covidBanner = By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[1]/img");

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