package bg.pragmatic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

/**
 * javadoc za class Zamunda
 */
public class TestZamunda {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://zamunda.net/");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    /**
     * This is a test that find login element
     */
    @Test
    public void findLogin() {
        driver.findElement(By.cssSelector("td.navigation:nth-of-type(4)>a"));
    }
}
