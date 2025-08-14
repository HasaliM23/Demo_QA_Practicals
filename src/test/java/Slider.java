import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class Slider {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/slider");
    }

    @Test

    public void sliderTest() throws InterruptedException {
        WebElement slider = driver.findElement(By.xpath("//*[@id='sliderContainer']/div[1]/span/input"));

        Actions action = new Actions(driver);

        //move slider 50 units

        action.clickAndHold(slider)
                .moveByOffset(50,0)
                .release()
                .perform();

        Thread.sleep(2000);


        // Move slider back 30 units to the left
        action.clickAndHold(slider)
                .moveByOffset(-30, 0)
                .release()
                .perform();

    }
}
