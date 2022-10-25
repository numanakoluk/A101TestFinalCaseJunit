package pages;

import driver.Driver;
import log.Log;
import methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static constant.GuestConstant.*;
import static constant.LoginConstant.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage extends Driver {
    Actions actions=new Actions(driver);
    Methods methods;
    public LoginPage(){methods = new Methods();}
    public void controlEmailPage() throws InterruptedException {
        assertTrue(methods.isElementVisible(ACCOUNTTEXT_CONTROL, 20));
        Thread.sleep(2000);
        assertTrue(methods.isElementVisible(LOGIN_BUTTON,20));
        Thread.sleep(2000);
        assertTrue(methods.isElementVisible(FACEBOOKLOGIN_BUTTON,20));
        Thread.sleep(2000);
    }
    public void loginGoogle() throws InterruptedException{


        methods.scrollElement(FACEBOOKLOGIN_BUTTON);
        methods.clickElement(FACEBOOKLOGIN_BUTTON);
        methods.waitBySeconds(2);
    }
    public void controlFacebookPage()throws InterruptedException{
        assertTrue(methods.isElementVisible(FACEBOOK_EMAIL, 20));
        methods.waitBySeconds(1);

    }
    public void loginFacebookPage() throws InterruptedException{
        WebElement sendText = driver.findElement(FACEBOOK_EMAIL);
        sendText.sendKeys(EMAIL);
        Log.logger.info("EMAIL Girildi:"+ EMAIL);
        methods.waitBySeconds(1);
    }
    public void loginPassword()throws InterruptedException{
        assertTrue(methods.isElementVisible(FACEBOOK_PASSWORD, 20));
        methods.waitBySeconds(1);
    }
    public void controlLoginPassword()throws InterruptedException{
        WebElement passwordText = driver.findElement(FACEBOOK_PASSWORD);
        passwordText.sendKeys(PASSWORD);
        Log.logger.info("Şifre Girildi:"+ PASSWORD);
        assertTrue(methods.isElementClickable(FACEBOOK_NEXT, 20));
        methods.clickElement(FACEBOOK_NEXT);
        //Login Control
        Log.logger.info("Giriş Sağlandı:"+ FACEBOOK_NEXT);
        methods.waitBySeconds(1);

        String value = methods.getValue(By.cssSelector("a[data-test-id='account']"));
        assertEquals("Hesabım",value);
        Log.logger.info("Doğrulanma sağlandı: " + value);
    }
}
