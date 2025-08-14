import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Auto_Complete {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/auto-complete");
    }

    @Test
    public void testAutoComplete() throws InterruptedException {
        WebElement input = driver.findElement(By.id("autoCompleteMultipleInput"));
        input.sendKeys("Y");
        Thread.sleep(1000); // wait for dropdown to load
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ENTER);
        input.sendKeys("B");
        Thread.sleep(1000);
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ENTER);
    }

//    @Test
//    public void testAutoComplete2ndMethod() throws InterruptedException {
//        WebElement multiInput = driver.findElement(By.id("autoCompleteMultipleInput"));
//        String[] colors= {"Y", "B","W"};
//
//        for (String AutoColor : colors){
//            multiInput.sendKeys(colors);
//            Thread.sleep(2000);
//            multiInput.sendKeys(Keys.ARROW_DOWN);
//            multiInput.sendKeys(Keys.ENTER);
//        }
//    }





}
