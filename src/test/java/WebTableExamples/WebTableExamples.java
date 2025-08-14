package WebTableExamples;

import Screenshots.FullScreenScreenshots;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTableExamples {
    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");
    }

    @Test
    public void webTableTest() throws InterruptedException {
        WebElement addDetails = driver.findElement(By.xpath("//*[@id='addNewRecordButton']"));
        addDetails.click();

        WebElement firstName = driver.findElement(By.xpath("//*[@id='firstName']"));
        firstName.sendKeys("David");

        WebElement lastName = driver.findElement(By.xpath("//*[@id='lastName']"));
        lastName.sendKeys("Warner");

        WebElement emailAddress = driver.findElement(By.xpath("//*[@id='userEmail']"));
        emailAddress.sendKeys("davidW@gmail.com");

        WebElement age = driver.findElement(By.xpath("//*[@id='age']"));
        age.sendKeys("25");

        WebElement salary = driver.findElement(By.xpath("//*[@id='salary']"));
        salary.sendKeys("120000");

        WebElement department = driver.findElement(By.xpath("//*[@id='department']"));
        department.sendKeys("IT");

        Thread.sleep(2000);

        FullScreenScreenshots.takeFullScreenShot("Before_Submit_Form");



        WebElement submitBtn = driver.findElement(By.xpath("//*[@id='submit']"));
        submitBtn.click();

        Thread.sleep(2000);

        FullScreenScreenshots.takeFullScreenShot("Submit_Form");









    }
}
