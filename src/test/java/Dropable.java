import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Dropable {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable");
    }

    @Test
    public void dropableTest() throws InterruptedException {

        WebElement dragMe = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement droped = driver.findElement(By.xpath("//*[@id='droppable']"));

        Actions actions = new Actions(driver);

        actions.clickAndHold(dragMe)
                .moveToElement(droped)
                .moveByOffset(20,0)
                .release()
                .perform();

        Thread.sleep(2000);

        // Click Accept tab
        WebElement acceptTab = driver.findElement(By.id("droppableExample-tab-accept"));
        acceptTab.click();

        Thread.sleep(1000); // Wait for tab content to load

        // Re-locate draggable "acceptable" and droppable elements after tab switch
        WebElement acceptable = driver.findElement(By.id("acceptable"));
        WebElement dropHere = driver.findElement(By.cssSelector("#acceptDropContainer #droppable"));

        // Drag and drop in Accept tab
        actions.dragAndDrop(acceptable, dropHere).perform();

        Thread.sleep(2000);




    }
}
