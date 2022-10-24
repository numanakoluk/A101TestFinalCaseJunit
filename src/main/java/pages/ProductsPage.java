package pages;

import driver.Driver;
import methods.Methods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import java.util.Random;

import static constant.LoginConstant.FACEBOOKLOGIN_BUTTON;
import static constant.LoginConstant.FACEBOOK_NEXT;
import static constant.ProductsConstant.*;
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
        productElems.get(0).click();
    }

    public void otherProduct()throws InterruptedException{


        /*WebElement closePopUpA = driver.findElement(POPUP);
        closePopUpA.click();
        Thread.sleep(2000);
*/
        methods.scrollElement(OtherProduct);
        methods.waitBySeconds(2);
        List<WebElement> productElems = driver.findElements(OtherProduct);
        if (productElems != null)
        {
            int maxProducts = productElems.size();
            System.out.println(maxProducts);
            Random random = new Random();
            int randomProduct = random.nextInt(maxProducts);
            productElems.get(randomProduct).click();
            methods.waitBySeconds(3);
            assertTrue(methods.isElementClickable(OtherProduct, 20));
        }
        System.out.println("Diğer Ürün Sepete eklendi");
        methods.waitBySeconds(2);

    }
    public void controlAddToCart()throws InterruptedException{
        String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);}

        methods.scrollElement(ADD_TO_CART);
        methods.waitBySeconds(2);

        /*WebElement closePopUp=driver.findElement(POPUPCustomer);
        closePopUp.click();
        Thread.sleep(2000);
*/
        methods.clickElement(ADD_TO_CART);
        assertTrue(methods.isElementClickable(ADD_TO_CART, 20));
        System.out.println("Ürün sepete eklendi");
        methods.waitBySeconds(2);
    }
    public void controlShoppingCart()throws InterruptedException{
        methods.clickElement(POPUP2);
        System.out.println("Pop UP kapandı");
        methods.waitBySeconds(2);
        methods.scrollElement(ADD_TO_CART);
        methods.waitBySeconds(2);
    }


    public void controlShoppingDone()throws InterruptedException{
        driver.getWindowHandle();
        methods.clickElement(POPUP2);
        System.out.println("Pop2 Kapandı.");

        methods.clickElement(SHOPPING_CART);
        System.out.println("Devam Et");
        methods.waitBySeconds(2);



        methods.clickElement(SHOPPING_DONE_BUTTON);
        System.out.println("Alışveriş tamamlandı");
        methods.waitBySeconds(2);
    }

}
