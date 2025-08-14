package Screenshots;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonScreenshots {

    public static void takeWebPageScreenshot(WebDriver driver, String filenamePrefix) {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String destPath = "./screenshots/" + filenamePrefix + "_" + timestamp + ".png";

        try {
            Files.createDirectories(Paths.get("./screenshots"));
            Files.copy(srcFile.toPath(), Paths.get(destPath));
            System.out.println("📷 Screenshot saved: " + destPath);
        } catch (IOException e) {
            System.out.println("❌ Failed to save screenshot: " + e.getMessage());
        }
    }
}

