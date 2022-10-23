package constant;

import org.openqa.selenium.By;

public class ProductsConstant {
    public static final By PRODUCTS_ELEMENTS = By.cssSelector("li[type=\"comfort\"]");

    public static final By ADD_TO_CART = By.cssSelector("button[id=\"addToCart\"]");

    public static final By POPUP = By.cssSelector("button > svg[class='sc-bwzfXH hDrfMZ']");

    //PopUp Sepete Ekle
    public static final By POPUP2 = By.cssSelector("a[class=\"checkoutui-Modal-2iZXl\"]");

    public static final By POPUPCustomer = By.cssSelector("div[id=\"zendeskCustomLauncherClose\"]");


    public static final By OtherProduct = By.cssSelector("button[class=\"add-to-basket button small\"]");

    public static final By SHOPPING_CART = By.cssSelector("span[id=\"shoppingCart\"]");

    public static final By PRODUCT_INCREASE = By.cssSelector("a[aria-label=\"Ürünü Arttır\"]");
    public static final By SHOPPING_DONE_BUTTON = By.cssSelector("button[id=\"continue_step_btn\"]");
}
