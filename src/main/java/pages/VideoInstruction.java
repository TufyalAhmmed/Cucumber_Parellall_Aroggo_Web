package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VideoInstruction {
    WebDriver driver;
    private By videoLink =By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[3]/div/div[2]/div/div/div/img");
    By videoBanner = By.xpath("//a[@class='ytp-title-link yt-uix-sessionlink']");

    public VideoInstruction(WebDriver driver) {
        this.driver = driver;

    }
    public void VideoItems(){
        driver.findElement(videoLink).click();

    }

    public boolean VerifyVideobanner(){
        return driver.findElement(videoBanner).isDisplayed();
    }

}
