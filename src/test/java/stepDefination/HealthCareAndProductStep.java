package stepDefination;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HealthCareAndProduct;
import pages.PersonalCare;

public class HealthCareAndProductStep {

    private WebDriver driver;
    HealthCareAndProduct healthCareAndProduct;
    utils.baseTests baseTests;

    public HealthCareAndProductStep(utils.baseTests baseTests) {
        this.baseTests = baseTests;
        this.driver = this.baseTests.getDriver();
        healthCareAndProduct= new HealthCareAndProduct(driver);
    }




    @When("User Clicked on Healthcare product on Top MenuBar Button")
    public void user_clicked_on_healthcare_product_on_top_menu_bar_button() throws InterruptedException {

        healthCareAndProduct.HealthCareAndProductButton();
        Thread.sleep(2000);
    }

    @When("Choose a product and click to Buy")
    public void choose_a_product_and_click_to_buy() throws InterruptedException {

        healthCareAndProduct.VerifyPersonalCareProductChoose();
        Thread.sleep(2000);

    }

    @When("Scroll to see Product Description")
    public void scroll_to_see_product_description() throws InterruptedException {

            healthCareAndProduct.scrollToParagraph(8);
            Thread.sleep(4000);

    }

}
