package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NutritionAndDrinks {
    WebDriver driver;
    private By nutritionAndDrinksLink =By.xpath("//span[normalize-space()='Nutrition and drinks']");
    By nutritionAndDrinksBanner = By.xpath("//img[@alt='cat_banner']");

    public NutritionAndDrinks(WebDriver driver) {
        this.driver = driver;

    }
    public void NutritionAndDrinksItems(){
        driver.findElement(nutritionAndDrinksLink).click();

    }

    public boolean VerifyNutritionAndDrinksButton(){
        return driver.findElement(nutritionAndDrinksBanner).isDisplayed();
    }


}
