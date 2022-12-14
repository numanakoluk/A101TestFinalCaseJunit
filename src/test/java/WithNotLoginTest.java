import log.Log;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import driver.Driver;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.GuestPage;
import pages.LoginPage;
import pages.MainPage;
import pages.ProductsPage;

import java.util.logging.Logger;

public class WithNotLoginTest extends Driver {



        GuestPage guestPage;
        LoginPage loginPage;
        MainPage mainPage;
        ProductsPage productsPage;


        public void Init(){
            guestPage=new GuestPage();
            loginPage=new LoginPage();
            mainPage =new MainPage();
            productsPage=new ProductsPage();
        }
    @Test
    public void LoginOutScenerio() throws InterruptedException {

        Init();
        mainPage.startPopUpCookies();
        mainPage.controlMainPage();
        mainPage.searchBoxClick();
        mainPage.controlSelectFilter();
        productsPage.controlSelectProducts();
        productsPage.controlAddToCart();
        productsPage.otherProduct();
        productsPage.continueClickProducts();
        productsPage.controlBasketProducts();
        productsPage.controlShoppingDone();


    }


}
