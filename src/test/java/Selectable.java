import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selectable {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/selectable");
    }

    @Test
    public void selectableTest() throws InterruptedException {

        WebElement selectItem1 = driver.findElement(By.xpath("//*[@id='verticalListContainer']/li[1]"));
        Actions actions = new Actions(driver);

        // select items
        actions.moveToElement(selectItem1).click().perform();

        Thread.sleep(2000);

        // unselect items

        actions.moveToElement(selectItem1).click().perform();


    }
}
