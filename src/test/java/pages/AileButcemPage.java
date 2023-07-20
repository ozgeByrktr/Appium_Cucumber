package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;
import java.util.logging.XMLFormatter;

public class AileButcemPage {

    public AileButcemPage(){
      PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)),this);
    }

    @FindBy(xpath = "//*[@text='Giriş Yap']")
    public MobileElement girisYapButonu;

    @FindBy(xpath = "//*[@text='E-mail Adresi']")
    public MobileElement emailBox;

    @FindBy(xpath = "//*[@text='Şifre']")
    public MobileElement passwordBox;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    public MobileElement basariliGirisText;

    @FindBy(xpath = "(//*[@index='0'])[17]")
    public MobileElement nameBox;

    @FindBy(xpath = "(//*[@index='1'])[5]")
    public MobileElement surnameBox;

    @FindBy(xpath = "(//*[@index='2'])[2]")
    public MobileElement cityBox;

    @FindBy(xpath = "//*[@index='4']")
    public MobileElement ageBox;

    @FindBy(xpath = "//*[@index='5']")
    public MobileElement jobBox;


}
