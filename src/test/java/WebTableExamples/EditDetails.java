package WebTableExamples;



import Screenshots.FullScreenScreenshots;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EditDetails {
    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");
    }


    @Test
    public void editItems() throws InterruptedException {

        WebElement editItem = driver.findElement(By.xpath("//*[@id='edit-record-2']"));
        editItem.click();

        //edit name
        WebElement editName = driver.findElement(By.xpath("//*[@id='firstName']"));
        editName.clear();

        editName.sendKeys("Frank");

        //edit department
        WebElement editDep = driver.findElement(By.xpath("//*[@id='department']"));
        editDep.clear();
        editDep.sendKeys("Financial");

        Thread.sleep(2000);

        FullScreenScreenshots.takeFullScreenShot("Before_The_Submit_Edited_Info");

        WebElement submitBtn = driver.findElement(By.xpath("//*[@id='submit']"));
        submitBtn.click();

        Thread.sleep(2000);

        FullScreenScreenshots.takeFullScreenShot("Edited_Submit_Form");


    }
}
