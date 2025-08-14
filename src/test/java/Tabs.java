import Screenshots.FullScreenScreenshots;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tabs {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/tabs");
    }

    @Test
    public void tabTest() throws InterruptedException {
        // Wait for 2 seconds to let page load
        Thread.sleep(2000);

        // Click first tab
        driver.findElement(By.id("demo-tab-origin")).click();

        FullScreenScreenshots.takeFullScreenShot("First Tab");

        // Wait for 2 seconds before clicking next tab
        Thread.sleep(2000);

        // Click second tab
        driver.findElement(By.id("demo-tab-use")).click();
        FullScreenScreenshots.takeFullScreenShot("Second Tab");
    }
}
