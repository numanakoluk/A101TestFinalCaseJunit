package constant;

import org.openqa.selenium.By;

public class MainConstant {

    public static final String  SEARCH_KEYWORD="Telefon";
    public static final String  SEARCH_KEYWORD_MARK="SAMSUNG";
    public static final By SEARCHBOX = By.cssSelector("input[aria-autocomplete=\"list\"]");
    public static final By SEARCHBOX_SEARCHBUTTON = By.cssSelector("div[class='SearchBoxOld-cHxjyU99nxdIaAbGyX7F']");
    public static final By SEARCH_Mark = By.xpath("//div[@id = 'markalar']//div/div/div/div/input");
    public static final By SEARCH_Mark_SELECT = By.xpath("//input[@value=\"samsung\"]");
}
