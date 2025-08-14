import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Resizable {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/resizable");
    }
    @Test
    public void resizableTest(){

        WebElement resizaBox = driver.findElement(By.xpath("//*[@id='resizableBoxWithRestriction']/span"));
        Actions actions = new Actions(driver);

        actions.clickAndHold(resizaBox)
                .moveByOffset(100,100)
                .release()
                .perform();

    }
}
