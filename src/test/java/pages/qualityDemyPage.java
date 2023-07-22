package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserDriver;
import utilities.Driver;

import java.time.Duration;

public class qualityDemyPage {
    public qualityDemyPage() {
        PageFactory.initElements((WebDriver) BrowserDriver.getBrowserDriver(), this);
    }

    @FindBy(xpath = "//a[@onclick='cookieAccept();']")
    public WebElement cookiesAcceptButonu;

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement logInButonu;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement eMailBox;

    //
    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;
     @FindBy(xpath = "(//button[@type='submit'])[2]")
     public WebElement submitLoginButon;
    @FindBy(xpath = "//*[@id=\"toast-container\"]")
    public WebElement toastMessage;
    @FindBy(xpath = "//*[text()='https://www.qualitydemy.com/menu']")
    public WebElement menu;
}
