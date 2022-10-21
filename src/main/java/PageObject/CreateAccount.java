package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Utils;

import java.io.IOException;

public class CreateAccount {

    public WebDriver driver;

    public CreateAccount(WebDriver driver) throws IOException {
        this.driver = driver;
    }

    public WebElement getCreateAccountForm() {
        return Utils.waitForElementPresence(driver, By.id("create-account_form"), 50);
    }

    public WebElement getCreatAccountEmailField() {
        return Utils.waitForElementPresence(driver, By.id("email_create"), 50);
    }

    public WebElement getCreateAccountBtn() {
        return Utils.waitToBeClickable(driver, By.xpath("//button[@id=\"SubmitCreate\"]"), 50);
    }

    public void setCreateAccountEmailField(String email) {
        WebElement element = this.getCreatAccountEmailField();
        element.clear();
        element.sendKeys(email);
    }

    /****** ERRORS ******/

    public WebElement getEmailFieldHighlightedRed() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@class=\"form-group form-error\"]"), 30);
    }

    public WebElement getEmailErrorMessage() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \"Invalid email address.\")]"), 30);
    }

    public WebElement getEmailBeenRegistered() {
        return Utils.waitForElementPresence(driver, By.xpath("//li[contains(text(), \"An account using this email\")]"), 30);
    }
}
