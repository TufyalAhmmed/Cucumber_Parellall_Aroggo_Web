package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalCare {
    WebDriver driver;
    private By PersonalCareLink =By.xpath("//span[normalize-space()='Personal care']");
    By PersonalCareBanner = By.xpath("//img[@alt='cat_banner']");

    public PersonalCare(WebDriver driver) {
        this.driver = driver;

    }
    public void PersonalCareItems(){
        driver.findElement(PersonalCareLink).click();

    }

    public boolean VerifyPersonalCareButton(){
        return driver.findElement(PersonalCareBanner).isDisplayed();
    }

}
