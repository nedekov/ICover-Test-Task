package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;


public class Base {

    public WebDriver getDriver() {
        if (driver == null) {
            setUp();
        }
        return driver;
    }

    private static WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void setUpTest() {
        driver.get("https://www.amazon.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
