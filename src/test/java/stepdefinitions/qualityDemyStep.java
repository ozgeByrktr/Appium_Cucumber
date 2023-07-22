package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.qualityDemyPage;
import utilities.BrowserDriver;
import utilities.ConfigReader;

public class qualityDemyStep {
    AndroidDriver driver = BrowserDriver.getBrowserDriver();
    qualityDemyPage qualityDemyPage=new qualityDemyPage();

    @Given("Kullanıcı \"qaUrl\"ye gider")
    public void kullanıcı_qa_url_ye_gider() {
       BrowserDriver.getBrowserDriver().get(ConfigReader.getProperty("qaUrl"));
    }

    @Given("cookies'i kabul eder")
    public void cookies_i_kabul_eder() throws InterruptedException {
        if(qualityDemyPage.cookiesAcceptButonu.isDisplayed()){
            qualityDemyPage.cookiesAcceptButonu.click();
        }else{
            qualityDemyPage.menu.click();
        }

    }
    @Given("Login butonuna tiklar")
    public void login_butonuna_tiklar() throws InterruptedException {
        if(!qualityDemyPage.logInButonu.isDisplayed()){
            qualityDemyPage.menu.click();
        }
        Thread.sleep(500);
        qualityDemyPage.logInButonu.click();
    }
    @Given("Kullanici Siteye yanlis {string} ve {string} ile giris yapilamadigini dogrular")
    public void kullanici_siteye_yanlis_ve_ile_giris_yapilamadigini_dogrular(String mail, String password) {
        qualityDemyPage.eMailBox.sendKeys(ConfigReader.getProperty(mail));
        qualityDemyPage.passwordBox.sendKeys(ConfigReader.getProperty(password));
        driver.hideKeyboard();
        qualityDemyPage.submitLoginButon.click();
        Assert.assertEquals("Invalid login credentials",qualityDemyPage.toastMessage.getText());
    }
    @Given("Kullanici driveri kapatir")
    public void kullanici_driveri_kapatir() {
        BrowserDriver.quitAppiumDriver();
    }



}