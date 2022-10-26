import log.Log;
import org.junit.jupiter.api.Test;

import driver.Driver;
import pages.GuestPage;
import pages.LoginPage;
import pages.MainPage;
import pages.ProductsPage;


    public class WithLoginTest  extends Driver {

        GuestPage guestPage;
        LoginPage loginPage;
        MainPage mainPage;
        ProductsPage productsPage;


        public void Init(){

            Log.logger.info("Test Started");
            guestPage=new GuestPage();
            loginPage=new LoginPage();
            mainPage =new MainPage();
            productsPage=new ProductsPage();
        }
    @Test
    public void LoginScenerio() throws InterruptedException {
        Init();

        guestPage.controlGuestPage();
        guestPage.controlHover();
        loginPage.controlEmailPage();
        loginPage.loginGoogle();
        loginPage.controlFacebookPage();
        loginPage.loginFacebookPage();
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
    }

