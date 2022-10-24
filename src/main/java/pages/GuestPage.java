package pages;

import driver.Driver;
import methods.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static constant.GuestConstant.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuestPage extends Driver{
    Actions actions=new Actions(driver);
    Methods methods;
    public GuestPage(){methods = new Methods();}
    public void controlGuestPage() throws InterruptedException {
        assertTrue(methods.isElementVisible(MYACCOUNT_CONTROL, 20));
        assertTrue(methods.isElementVisible(LOGO_CONTROL, 20));
        assertTrue(methods.isElementVisible(SEARCHTEXT_CONTROL, 20));
        methods.waitBySeconds(1);
    }
    public void controlHover() throws InterruptedException {
        WebElement LoginHover = driver.findElement(MYACCOUNT_CONTROL);
        methods.waitBySeconds(1);
        actions.moveToElement(LoginHover).perform();
        methods.waitBySeconds(1);
        WebElement LoginClick = driver.findElement(LOGINBUTTON_CONTROL);
        methods.waitBySeconds(1);
        actions.moveToElement(LoginClick).click().perform();
        System.out.println("Login tıklandı");
        methods.waitBySeconds(1);
    }
}
