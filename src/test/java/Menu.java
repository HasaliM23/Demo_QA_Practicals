import Screenshots.FullScreenScreenshots;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Menu {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/menu");
    }

    @Test
    public void menuTests() throws InterruptedException {

        WebElement subMenu = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(subMenu).perform();
        Thread.sleep(2000);

        WebElement subMenuClick = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
        subMenuClick.click();
    }
}
