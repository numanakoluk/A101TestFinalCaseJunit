
import static org.junit.Assert.assertTrue;

import driver.Driver;
import log.Log;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.GuestPage;
import pages.LoginPage;
import pages.MainPage;
import pages.ProductsPage;

import java.util.logging.Logger;

/**
 * Unit test for simple App.
 */

public class AllTest extends Driver {

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
    @Order(1)
    public void LoginScenerio() throws InterruptedException {
        Init();
        //Çerezler Kabul Edilir.
        mainPage.startPopUpCookies();

        //Hepsiburada Olduğu Doğrulanır
        guestPage.controlGuestPage();

        //Login Butonuna Tıklanır
        guestPage.controlHoverandLogin();

        //Login Sayfasi Kontrol Edilir
        loginPage.controlEmailPage();

        //Facebook ile giriş için tıklanır
        loginPage.loginFacebook();

        //Facebook ile giriş sayfası doğrulanır
        loginPage.controlFacebookPage();

        //Email Texte Girilir
        loginPage.loginFacebookPage();

        //Şifre Texte Girilir
        loginPage.loginPassword();

        //Kullanıcı Girişi Doğrulanır
        loginPage.controlLoginPassword();

        //Arama Yapılan Ürün ile Yeni Sekmede Devam Edilir
        mainPage.searchBoxClick();

        //Ürün için Filtreleme Yapılır
        mainPage.controlSelectFilter();

        //Ürün ilk satıdıcıdan sepete eklenir
        productsPage.controlSelectProducts();

        //Birinci Ürün Sepete Eklenir
        productsPage.controlAddToCart();

        //Ikinci Ürün Sepete Eklenir
        productsPage.otherProduct();

        //Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanır.
        productsPage.controlBasketProducts();

        //AlışVeriş Tamamlanır.
        productsPage.controlShoppingDone();
    }

    @Test
    @Order(2)
    public void LoginOutScenerio() throws InterruptedException {

        Init();
        //Çerezler Kabul Edilir.
        mainPage.startPopUpCookies();

        //Hepsiburada Olduğu Doğrulanır
        guestPage.controlGuestPage();

        //AnaSayfa Doğrulanır.
        mainPage.controlMainPage();

        //Arama Yapılan Ürün ile Yeni Sekmede Devam Edilir
        mainPage.searchBoxClick();

        //Ürün için Filtreleme Yapılır
        mainPage.controlSelectFilter();

        //Ürün ilk satıdıcıdan sepete eklenir
        productsPage.controlSelectProducts();

        //Birinci Ürün Sepete Eklenir
        productsPage.controlAddToCart();

        //Ikinci Ürün Sepete Eklenir
        productsPage.otherProduct();

        //Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanır.
        productsPage.controlBasketProducts();

        //AlışVeriş Tamamlanır.
        productsPage.controlShoppingDone();


    }
}
