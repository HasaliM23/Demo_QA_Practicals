import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login_Book_Store {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/login");
    }

    @Test
    public void createNewUser() throws InterruptedException {
        // Click New User
        driver.findElement(By.id("newUser")).click();

        // Fill the form
        driver.findElement(By.id("firstname")).sendKeys("Virat");
        driver.findElement(By.id("lastname")).sendKeys("Kholi");
        driver.findElement(By.id("userName")).sendKeys("viratK18");
        driver.findElement(By.id("password")).sendKeys("virat@123K18");

        // Pause to solve captcha manually
        System.out.println("Please solve the captcha manually within 20 seconds...");
        Thread.sleep(20000); // wait 20 seconds

        // Scroll to Register button and click
        WebElement register = driver.findElement(By.id("register"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", register);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", register);

        System.out.println("User registration attempted.");
    }
}
