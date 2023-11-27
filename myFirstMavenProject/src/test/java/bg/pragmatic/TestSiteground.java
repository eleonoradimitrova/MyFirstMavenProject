package bg.pragmatic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

/**
 * javadoc za class TestSiteground
 */
public class TestSiteground {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.siteground.com/");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    /**
     * This is a test that find second card element - втората колона за WordPress Hosting
     */
    @Test
    public void findSecondCardElement() {
        driver.findElement(By.cssSelector("div.card:nth-of-type(2) div.flex a"));
    }
}
