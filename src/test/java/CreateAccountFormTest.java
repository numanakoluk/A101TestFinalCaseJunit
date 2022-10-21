import PageObject.Account;
import PageObject.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Utils;

import java.io.IOException;

public class CreateAccountFormTest {

    public WebDriver driver;

    private HomePage homepage;


    private Account account;

    @BeforeClass
    public void setup() throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Github\\chromedriver.exe");

        //Object creation

        driver = new ChromeDriver();
        String baseUrl = "http://automationpractice.com/index.php";

        // Maximize the window
        driver.manage().window().maximize();

        driver.get(baseUrl);

    }

    @AfterClass


    public void closeAll() throws IOException {
        account.getAccountLogout().click();
        driver.quit();
    }
    @Test(priority = 1)
    public void authenticationPage() throws IOException {
        homepage.getSignInBtn().click();


    }

}
