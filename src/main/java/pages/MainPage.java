package pages;

import driver.Driver;
import log.Log;
import methods.Methods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static constant.GuestConstant.*;
import static constant.MainConstant.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPage extends Driver {
    Actions actions=new Actions(driver);
    Methods methods;
    public MainPage(){
        methods = new Methods();
    }

    public void startPopUpCookies()throws InterruptedException{
        methods.waitBySeconds(3);
        methods.clickElement(POPUPNotifications);
        Log.logger.info("Çerezler Kabul Edildi:"+ POPUPNotifications);
    }
    public void controlMainPage()throws InterruptedException{
        assertTrue(methods.isElementVisible(SEARCHTEXT_CONTROL, 20));
        Thread.sleep(2000);
    }
    public void searchBoxClick()throws InterruptedException{
        WebElement text = driver.findElement(SEARCHBOX);
        text.sendKeys(SEARCH_KEYWORD);
        Log.logger.info("Kelime arandı:"+ SEARCH_KEYWORD);
        methods.clickElement(SEARCHBOX_SEARCHBUTTON);
        Thread.sleep(2000);
    }
    public void controlSelectFilter()throws InterruptedException{
        methods.scrollElement(SEARCH_Mark_SELECT);
        WebElement searchCheckbox=driver.findElement(SEARCH_Mark);
        searchCheckbox.click();
        methods.waitBySeconds(3);
        searchCheckbox.sendKeys(SEARCH_KEYWORD_MARK);
        methods.waitBySeconds(4);
        WebElement checkBox=driver.findElement(SEARCH_Mark_SELECT);
        actions.doubleClick(checkBox).perform();
        methods.waitBySeconds(2);
        driver.navigate().refresh();
        methods.waitBySeconds(2);
    }

}
