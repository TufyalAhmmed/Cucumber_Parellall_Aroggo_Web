package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Covid19;
import pages.NutritionAndDrinks;
import utils.baseTests;

public class NutritionAndDrinksStep {
 private WebDriver driver;
 NutritionAndDrinks nutritionAndDrinks;
 utils.baseTests baseTests;

 public NutritionAndDrinksStep(baseTests baseTests) {
  this.baseTests = baseTests;
  this.driver = this.baseTests.getDriver();
  nutritionAndDrinks = new NutritionAndDrinks(driver);
 }
  @When("User clicked on Nutrition and Drinks Button")
  public void user_clicked_on_nutrition_and_drinks_button() {
   nutritionAndDrinks.NutritionAndDrinksItems();

  }
  @Given("Verify Nutrition and Drinks banner Displays on Top of the page")
  public void verify_nutrition_and_drinks_banner_displays_on_top_of_the_page() throws InterruptedException {
    Thread.sleep(2000);
   nutritionAndDrinks.VerifyNutritionAndDrinksButton();
     Thread.sleep(5000);
  }


 }