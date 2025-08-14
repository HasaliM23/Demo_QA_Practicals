import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Sortable {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/sortable");
    }

    @Test
    public void sortableTest() throws InterruptedException {

        WebElement dragOne = driver.findElement(By.xpath("//*[@id='demo-tabpane-list']/div/div[1]"));
        WebElement dragTwo = driver.findElement(By.xpath("//*[@id='demo-tabpane-list']/div/div[2]"));
        Actions actions = new Actions(driver);

        // Drag "One" element and drop it onto "Two" element
        actions.clickAndHold(dragOne)
                .moveToElement(dragTwo) // kothantada drag krnne kiyala eka (location)
                .moveByOffset(0, 10)  // small offset to ensure drop occurs between items
                .release()
                .perform();

        Thread.sleep(2000); // just to see the result before test ends

        WebElement dragSix = driver.findElement(By.xpath("//*[@id='demo-tabpane-list']/div/div[6]"));
        WebElement dragFour = driver.findElement(By.xpath("//*[@id='demo-tabpane-list']/div/div[4]"));

        actions.clickAndHold(dragSix)
                .moveToElement(dragFour)
                .moveByOffset(0,10)
                .release()
                .perform();

        Thread.sleep(2000);

    }

}
