package bg.pragmatic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

/**
 * javadoc za class TestAbv
 */
public class TestAbv {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.abv.bg/");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    /**
     * This is a test that find Astro element - "Месечен"
     */
    @Test
    public void findAstroElement() {
        driver.findElement(By.cssSelector("article#astroContent a.fr"));
    }
}

