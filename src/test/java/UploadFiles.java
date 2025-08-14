import Screenshots.FullScreenScreenshots;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadFiles {
    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/upload-download");
    }

    @Test
    public void uploadFiles() {
        // Provide the full absolute path to your file
        String filePath = "C:\\Users\\INTEL\\Downloads\\TestLeaf Logo.png";

        // Find the file upload input
        WebElement uploadInput = driver.findElement(By.id("uploadFile"));

        // Upload the file using sendKeys only
        uploadInput.sendKeys(filePath);

        FullScreenScreenshots.takeFullScreenShot("Upload_File");
    }
}
