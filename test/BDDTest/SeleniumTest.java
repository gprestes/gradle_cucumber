package BDDTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class SeleniumTest {
    private WebDriver driver;
    private String baseUrl;
    private String browserName;
    private String browserVersion;

    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://www.dunelm-mill.com/";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
        browserName = caps.getBrowserName();
        browserVersion = caps.getVersion();
        System.out.println("Automated test run. We're running on: " + browserName + " - " + browserVersion);
    }

    public void tearDown() {
        driver.quit();
    }

    public void goToHomePage() {
        driver.get(baseUrl);
    }

    public void searchForValue(String searchValue) {
        driver.findElement(By.id("searchbox")).clear();
        driver.findElement(By.id("searchbox")).sendKeys(searchValue);
        driver.findElement(By.cssSelector("button.buttonSearch.color1")).click();
    }

    public void checkPageTitle(String expectedTitle) {
        assertEquals(expectedTitle, driver.getTitle());
    }
}