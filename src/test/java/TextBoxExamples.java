import Screenshots.CommonScreenshots;
import Screenshots.FullScreenScreenshots;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxExamples {

    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
    }

    @Test
    public void textBoxTests() {

        WebElement textName = driver.findElement(By.id("userName"));
        textName.sendKeys("Hasali Medya");

        WebElement textemail = driver.findElement(By.id("userEmail"));
        textemail.sendKeys("hasali@gmail.com");

        WebElement textAddress = driver.findElement(By.id("currentAddress"));
        textAddress.sendKeys("Flower Road, 2nd Street Road, Colombo");

        WebElement textPermanentAddress = driver.findElement(By.id("permanentAddress"));
        textPermanentAddress.sendKeys("20/14 Main Street Nugegoda");

        // Take screenshot before submit
        FullScreenScreenshots.takeFullScreenShot("BeforeSubmit");


        // Scroll and click submit button safely
        WebElement submitBtn = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);

        // Optionally wait for any ads to disappear
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(submitBtn));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);

        // Take screenshot after submit
        FullScreenScreenshots.takeFullScreenShot("AfterSubmit");

        // Optionally: assert or print success
    }
}
