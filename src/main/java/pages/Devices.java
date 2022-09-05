package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Devices {
    WebDriver driver;
    private By devicesLink =By.xpath("//span[normalize-space()='Devices']");
    By devicesBanner = By.xpath("//img[@alt='cat_banner']");

    public Devices(WebDriver driver) {
        this.driver = driver;

    }
    public void DeviceItems(){

        driver.findElement(devicesLink).click();

    }

    public boolean VerifyDevicesButton(){

        return driver.findElement(devicesBanner).isDisplayed();
    }

}


