import Screenshots.FullScreenScreenshots;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonExamples {
    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");
    }
    @Test
    public void doubleClick(){

        //double click

        WebElement doubleClickButton = driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));

        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickButton).perform();

        //right click

        WebElement rightClickButton = driver.findElement(By.xpath("//*[@id='rightClickBtn']"));

        Actions rightClickAction = new Actions(driver);
        actions.contextClick(rightClickButton).perform();

        FullScreenScreenshots.takeFullScreenShot("Click_Buttons");

    }
}
