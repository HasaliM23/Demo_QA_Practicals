import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Select_Menu {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
    }

    @Test
    public void selectMenu() throws InterruptedException {

        WebElement selectValue = driver.findElement(By.xpath("//*[@id='withOptGroup']/div/div[2]/div"));
        selectValue.click();

        WebElement inputBox = driver.findElement(By.id("react-select-2-input"));
        inputBox.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        inputBox.sendKeys(Keys.ENTER);


        WebElement selectOne = driver.findElement(By.xpath("//*[@id='selectOne']/div/div[2]/div"));
        selectOne.click();

        WebElement inputBox1 = driver.findElement(By.id("react-select-3-input")); // correct hidden input ID
        inputBox1.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        inputBox1.sendKeys(Keys.ENTER);


        WebElement selectColor = driver.findElement(By.xpath("//*[@id='oldSelectMenu']"));
        Select colorDropdown = new Select(selectColor);
        colorDropdown.selectByIndex(6);




    }






}
