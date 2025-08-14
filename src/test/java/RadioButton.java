import Screenshots.FullScreenScreenshots;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButton {
    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");
    }

    @Test
    public void radioButtonTest() throws InterruptedException {
        // Fix: Click the label instead of input
        WebElement label = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        label.click();

        // Wait for result to appear (optional)
        Thread.sleep(1000);

        // Take full-screen screenshot (not just browser)
        FullScreenScreenshots.takeFullScreenShot("Radio_Button_Selected");


        //click Impressive

        WebElement label1 = driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
        label1.click();

        FullScreenScreenshots.takeFullScreenShot("Radio_Button_Impressive_Selected");


    }





}
