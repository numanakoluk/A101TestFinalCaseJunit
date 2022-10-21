package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Utils;

import java.io.IOException;

public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver driver) throws IOException {
        this.driver = driver;

    }
    public WebElement getSignInBtn() {
        //return driver.findElement(By.xpath("//a[contains(text(), \"Sign in\")]"));
        return Utils.waitToBeClickable(driver, By.xpath("//a[contains(text(), \"Sign in\")]"), 30);
    }
}
