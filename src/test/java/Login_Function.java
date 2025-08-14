import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_Function {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/login");
    }

    @Test
    public void loginUser() throws InterruptedException {

        WebElement userName = driver.findElement(By.xpath("//*[@id='userName']"));
        userName.sendKeys("viratK18");

        WebElement psw = driver.findElement(By.xpath("//*[@id='password']"));
        psw.sendKeys("virat@123K18");


        WebElement login = driver.findElement(By.xpath("//*[@id='login']"));
        login.click();
    }
}
