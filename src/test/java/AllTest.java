
import static org.junit.Assert.assertTrue;

import driver.Driver;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.GuestPage;
import pages.LoginPage;
import pages.MainPage;
import pages.ProductsPage;

/**
 * Unit test for simple App.
 */

public class AllTest extends Driver {

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
    @Order(1)
    public void loginScenerio() throws InterruptedException {
        Init();

        guestPage.controlGuestPage();
        guestPage.controlHover();
        loginPage.controlEmailPage();
        loginPage.loginGoogle();
        loginPage.controlGooglePage();
        loginPage.loginGooglePage();
        loginPage.loginPassword();
        loginPage.controlLoginPassword();
        mainPage.controlMainPage();
        mainPage.searchBoxClick();
        mainPage.controlSelectFilter();
        productsPage.controlSelectProducts();
        productsPage.controlAddToCart();
        productsPage.controlShoppingCart();
        productsPage.otherProduct();
        productsPage.controlShoppingDone();


    }

    @Test
    @Order(2)
    public void loginOutScenerio() throws InterruptedException {

        Init();
        mainPage.controlMainPage();
        mainPage.searchBoxClick();
        mainPage.controlSelectFilter();
        productsPage.controlSelectProducts();
        productsPage.controlAddToCart();
        productsPage.controlShoppingCart();
        productsPage.otherProduct();
        productsPage.controlShoppingDone();


    }
}