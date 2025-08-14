import Screenshots.FullScreenScreenshots;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class ToolTips {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/tool-tips");
    }

    @Test
    public void toolTipsTest() throws InterruptedException {
        WebElement toolTipsButton = driver.findElement(By.xpath("//*[@id='toolTipButton']"));
        Actions actions = new Actions(driver);

        // Move to the element to hover
        actions.moveToElement(toolTipsButton).perform();

        Thread.sleep(3000);

        FullScreenScreenshots.takeFullScreenShot("Tool Tips 1");


        WebElement toolTips2 = driver.findElement(By.xpath("//*[@id='toolTipTextField']"));
        actions.moveToElement(toolTips2).perform();

        Thread.sleep(3000);

        FullScreenScreenshots.takeFullScreenShot("Tool Tips 2");

        WebElement toolTips3 = driver.findElement(By.xpath("//*[@id='texToolTopContainer']/a[1]"));
        actions.moveToElement(toolTips3).perform();

        Thread.sleep(3000);

        FullScreenScreenshots.takeFullScreenShot("Tool Tips 3");


        WebElement toolTips4 = driver.findElement(By.xpath("//*[@id='texToolTopContainer']/a[2]"));
        actions.moveToElement(toolTips4).perform();

        Thread.sleep(3000);

        FullScreenScreenshots.takeFullScreenShot("Tool Tips 4");





    }




}
