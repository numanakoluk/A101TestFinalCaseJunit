package pages;

import driver.Driver;
import methods.Methods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static constant.LoginConstant.*;
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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,500)");
        methods.clickElement(FACEBOOKLOGIN_BUTTON);
        Thread.sleep(2000);
    }
    public void controlGooglePage()throws InterruptedException{
        assertTrue(methods.isElementVisible(FACEBOOK_EMAIL, 20));
        Thread.sleep(2000);

    }
    public void loginGooglePage() throws InterruptedException{
        WebElement sendText = driver.findElement(FACEBOOK_EMAIL);
        sendText.sendKeys(EMAIL);
        System.out.println("Email girildi");
        Thread.sleep(2000);
    }
    public void loginPassword()throws InterruptedException{
        assertTrue(methods.isElementVisible(FACEBOOK_PASSWORD, 20));
        Thread.sleep(2000);
    }
    public void controlLoginPassword()throws InterruptedException{
        WebElement passwordText = driver.findElement(FACEBOOK_PASSWORD);
        passwordText.sendKeys(PASSWORD);
        methods.clickElement(GOOGLE_PASSWORD_NEXT);
        System.out.println("Şifre girildi");
        Thread.sleep(2000);
    }
}
