package Screenshots;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FullScreenScreenshots {

    public static void takeFullScreenShot(String filenamePrefix) {
        try {
            Robot robot = new Robot();
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);

            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String fileName = "./screenshots/" + filenamePrefix + "_FULL_" + timestamp + ".png";

            File outputFile = new File(fileName);
            outputFile.getParentFile().mkdirs(); // Create directories if they don't exist

            ImageIO.write(screenFullImage, "png", outputFile);
            System.out.println("📸 Full Screen Screenshot saved: " + fileName);

        } catch (Exception e) {
            System.out.println("❌ Failed to capture full screen: " + e.getMessage());
        }
    }
}

