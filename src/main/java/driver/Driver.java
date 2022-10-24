package driver;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import testResultMethods.TestResultLogger;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@ExtendWith(TestResultLogger.class)
public class Driver {
    private static final Logger logger = LogManager.getLogger(Driver.class);
    public static WebDriver driver;
    @BeforeAll
    public static void beforeAll() {

        logger.info("****** Before All ******");

    }
    @BeforeEach
    public void beforeEach() {

        logger.info("========= Before =========");
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();
        options.merge(desiredCapabilities);
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.hepsiburada.com/");
    }

    @AfterEach
    public void afterEach() {

        if (driver != null) {
            driver.quit();
        }

        logger.info("========= After =========");
    }

    @AfterAll
    public static void afterAll() {

        logger.info("****** After All ******");
    }
}
