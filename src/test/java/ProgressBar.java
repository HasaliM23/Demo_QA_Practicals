import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProgressBar {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/progress-bar");
    }

    @Test
    public void progressTest() throws InterruptedException {
        //start button
        WebElement progressBar = driver.findElement(By.xpath("//*[@id='startStopButton']"));
        progressBar.click();
        Thread.sleep(3000);
        //Stop
        progressBar.click();



    }


}
