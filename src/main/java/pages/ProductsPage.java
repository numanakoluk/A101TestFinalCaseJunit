package pages;

import driver.Driver;
import log.Log;
import methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import static constant.GuestConstant.POPUPNotifications;
import static constant.LoginConstant.FACEBOOKLOGIN_BUTTON;
import static constant.LoginConstant.FACEBOOK_NEXT;
import static constant.ProductsConstant.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductsPage extends Driver {
    Actions actions=new Actions(driver);
    Methods methods;
    JavascriptExecutor js;


    public ProductsPage(){
        methods = new Methods();
    }
    public void controlSelectProducts()throws InterruptedException{
        methods.scrollElement(PRODUCTS_ELEMENTS);
        methods.waitBySeconds(2);
        List<WebElement> productElems = driver.findElements(PRODUCTS_ELEMENTS);
        //First Element Click.
        productElems.get(0).click();
    }
    public void startPopUpCookies()throws InterruptedException{
        methods.waitBySeconds(3);
        methods.clickElement(POPUPNotifications);
        Log.logger.info("Çerezler Kabul Edildi:"+ POPUPNotifications);
    }
    public void popUpClose()throws InterruptedException{
        methods.waitBySeconds(3);
        methods.clickElement(POPUP2);
        Log.logger.info("Pop Up Kapandı:"+ POPUP2);
    }
    public void controlAddToCart()throws InterruptedException{
        String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);}
        methods.scrollElement(OtherProduct);
        methods.waitBySeconds(2);
        methods.clickElement(OtherProduct2);
        /*WebElement closePopUp=driver.findElement(POPUPCustomer);
        closePopUp.click();
        Thread.sleep(2000);
*/
        methods.clickElement(ADD_TO_CART);
        assertTrue(methods.isElementClickable(ADD_TO_CART, 20));
        Log.logger.info("Ürün Sepete Eklendi:"+ ADD_TO_CART);
        methods.waitBySeconds(3);

        popUpClose();
        methods.waitBySeconds(2);
        methods.scrollElement(ADD_TO_CART);
        methods.waitBySeconds(2);
    }
    public void otherProduct()throws InterruptedException{


        /*WebElement closePopUpA = driver.findElement(POPUP);
        closePopUpA.click();
        Thread.sleep(2000);
*/

        methods.scrollElement(ADD_TO_CART);
        methods.waitBySeconds(2);
        methods.clickElement(OtherProduct3);
        methods.waitBySeconds(3);
        Log.logger.info("Diğer Ürün Sepete Eklendi:"+ OtherProduct3);
        methods.waitBySeconds(2);

        driver.getWindowHandle();
        popUpClose();

    }



    public void continueClickProducts() throws  InterruptedException{

        methods.clickElement(SHOPPING_CART);
        Log.logger.info("Devam Et Butonu:"+ SHOPPING_CART);
        methods.waitBySeconds(2);


    }

public void controlBasketProducts() throws  InterruptedException{



    String value1 = methods.getValue2(By.xpath("//*[contains(text(),'han mobile')]"));
    String valueLangueage = value1.toLowerCase(Locale.ENGLISH);
    assertEquals("han mobile",valueLangueage);
    Log.logger.info("Diğer Satıcı Doğrulama: " + valueLangueage);
    methods.waitBySeconds(3);

    String value2 = methods.getValue3(By.xpath("//*[contains(text(),'rüzgar gsm')]"));
    String valueLangueage2 = value2.toLowerCase(Locale.ENGLISH);
    assertEquals("rüzgar gsm",valueLangueage2);
    Log.logger.info("Ana Satıcı Doğrulama: " + valueLangueage2);
}

    public void controlShoppingDone()throws InterruptedException{

        methods.clickElement(SHOPPING_DONE_BUTTON);
        Log.logger.info("Alışveriş Tamamlandı:"+ SHOPPING_DONE_BUTTON);
        methods.waitBySeconds(2);
    }

}
