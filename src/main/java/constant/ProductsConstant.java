package constant;

import org.openqa.selenium.By;

public class ProductsConstant {
    public static final By PRODUCTS_ELEMENTS = By.cssSelector("li[type=\"comfort\"]");

    public static final By ADD_TO_CART = By.cssSelector("button[id=\"addToCart\"]");

    public static final By POPUP = By.cssSelector("button > svg[class='sc-bwzfXH hDrfMZ']");

    //PopUp Sepete Ekle
    public static final By POPUP2 = By.cssSelector("a[class=\"checkoutui-Modal-2iZXl\"]");

    public static final By OtherProduct = By.cssSelector("button[class=\"add-to-basket button small\"]");

    public static final By OtherProduct2 = By.xpath("//*[@class='add-to-basket button small'][1]");

    public static final By OtherProduct3= By.xpath("/html/body/div[2]/main/div[3]/section[1]/div[4]/div/div[4]/div[2]/div[3]/div/div[2]/table/tbody/tr[2]/td[3]/div/form/button");

    public static final By SHOPPING_CART = By.cssSelector("span[id=\"shoppingCart\"]");

    public static final By PRODUCT_INCREASE = By.cssSelector("a[aria-label=\"Ürünü Arttır\"]");
    public static final By SHOPPING_DONE_BUTTON = By.cssSelector("button[id=\"continue_step_btn\"]");
}
