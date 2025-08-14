package WebTableExamples;

import Screenshots.FullScreenScreenshots;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchandFilterExamples {

    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");
    }

    @Test
    public void searchTest(){

        WebElement searchTheDetails = driver.findElement(By.xpath("//*[@id='searchBox']"));
        searchTheDetails.sendKeys("Alden" + Keys.ENTER);

        FullScreenScreenshots.takeFullScreenShot("Search_the_details");

    }
}
