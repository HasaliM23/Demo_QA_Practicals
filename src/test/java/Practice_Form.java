import Screenshots.FullScreenScreenshots;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice_Form {
    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
    }

    @Test
    public void practiceForm() throws InterruptedException {
        //First name

        WebElement fName = driver.findElement(By.id("firstName"));
        fName.sendKeys("Joe");

        //Last name

        WebElement lName = driver.findElement(By.id("lastName"));
        lName.sendKeys("Root");

        //User Email

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("RootJoe@gmail.com");

        //Gender
        WebElement gender = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
        gender.click();

        //User Number

        WebElement number = driver.findElement(By.id("userNumber"));
        number.sendKeys("0452234800");

        //BirthDay

        WebElement datePicker = driver.findElement(By.id("dateOfBirthInput"));
        datePicker.sendKeys(Keys.CONTROL + "a");
        datePicker.sendKeys("08 Feb 1990", Keys.ENTER);


        //Hobby
        WebElement hobbyLabel = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hobbyLabel);
        hobbyLabel.click();



        //upload Picture

        String filePath = "C:\\Users\\INTEL\\Downloads\\TestLeaf Logo.png";

        // Find the file upload input
        WebElement uploadInput = driver.findElement(By.id("uploadPicture"));

        // Upload the file using sendKeys only
        uploadInput.sendKeys(filePath);


        //Current Address

        WebElement currentAdd = driver.findElement(By.id("currentAddress"));
        currentAdd.sendKeys("New Walls, UK");

        WebElement state = driver.findElement(By.id("react-select-3-input"));
        state.sendKeys("Haryana");
        state.sendKeys(Keys.ENTER);

        WebElement city = driver.findElement(By.id("react-select-4-input"));
        city.sendKeys("Karnal");
        city.sendKeys(Keys.ENTER);


        WebElement submitBtn = driver.findElement(By.id("submit"));
        submitBtn.click();

        Thread.sleep(2000);

        FullScreenScreenshots.takeFullScreenShot("Submit_Form_After");












    }






}
