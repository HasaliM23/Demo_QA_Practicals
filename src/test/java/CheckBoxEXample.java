import Screenshots.FullScreenScreenshots;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxEXample {

    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/checkbox");
    }

    @Test
    public void checkBoxTest(){

        WebElement checkbox = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/span/label/span[1]"));
        checkbox.click();
        FullScreenScreenshots.takeFullScreenShot("AfterSubmit");
    }
}
