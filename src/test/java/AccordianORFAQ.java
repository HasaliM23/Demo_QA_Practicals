import Screenshots.FullScreenScreenshots;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccordianORFAQ {
    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/accordian");
    }

    @Test
    public void accordianTests() throws InterruptedException {
        WebElement sectionHeader = driver.findElement(By.id("section1Heading"));
        sectionHeader.click();
        Thread.sleep(2000);


        WebElement section2Header = driver.findElement(By.id("section2Heading"));
        section2Header.click();
        Thread.sleep(2000);

        FullScreenScreenshots.takeFullScreenShot("Accordian or FAQ");




    }
}
