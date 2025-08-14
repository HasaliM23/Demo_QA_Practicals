package WebTableExamples;

import Screenshots.FullScreenScreenshots;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteDetails {
    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");
    }

    @Test
    public void deleteItems() throws InterruptedException {

        WebElement deleteItem = driver.findElement(By.xpath("//*[@id='delete-record-3']"));
        deleteItem.click();

    }





}
