package bg.pragmatic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

/**
 * javadoc za class TestVesti
 */
public class TestVesti {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.vesti.bg/");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    /**
     * This is a test that find search element - иконката с лупа
     */
    @Test
    public void findElement() {
        driver.findElement(By.cssSelector("input#searchSubmit"));
    }
}
