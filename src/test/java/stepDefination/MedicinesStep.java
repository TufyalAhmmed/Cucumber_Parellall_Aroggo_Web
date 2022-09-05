package stepDefination;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.FAQ;
import pages.Medicines;

public class MedicinesStep {
    private WebDriver driver;
    Medicines medicines;
    utils.baseTests baseTests;

    public MedicinesStep(utils.baseTests baseTests) {
        this.baseTests = baseTests;
        this.driver = this.baseTests.getDriver();
        medicines= new Medicines(driver);
    }


    @When("User Clicked on Medicines")
    public void user_clicked_on_medicines() throws InterruptedException {
        Thread.sleep(1000);
        medicines.ClickOnmedicine();
        Thread.sleep(2000);


    }

}
