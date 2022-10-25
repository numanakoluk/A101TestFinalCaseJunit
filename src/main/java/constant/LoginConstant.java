package constant;

import org.openqa.selenium.By;

public class LoginConstant {

    public static final String  EMAIL="nakoluk";

    public static final String  PASSWORD="0013700Na";

    public static final By ACCOUNTTEXT_CONTROL = By.cssSelector("input[id=\"txtUserName\"]");

    public static final By LOGIN_BUTTON = By.cssSelector("button[id=\"btnLogin\"]");

    public static final By FACEBOOKLOGIN_BUTTON = By.cssSelector("button[id=\"btnFacebook\"]");

    public static final By FACEBOOK_EMAIL = By.cssSelector("input[id=\"email\"]");

    public static final By FACEBOOK_PASSWORD = By.cssSelector("input[id=\"pass\"]");

    public static final By FACEBOOK_NEXT= By.cssSelector("button[id=\"loginbutton\"]");

    public static final By FACEBOOK_LOGIN_VERIFATION= By.xpath("a[data-test-id='account']");





}
