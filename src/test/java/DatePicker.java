import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class DatePicker {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/date-picker");
    }
    // reusable helper
    private void setInputValueByJs(WebElement el, String value) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
                "arguments[0].value = arguments[1];" +
                        "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));" +
                        "arguments[0].dispatchEvent(new Event('change', { bubbles: true }));" +
                        "arguments[0].blur();",
                el, value);
    }

    @Test
    public void datePickerTest() {
        WebElement dateInput = driver.findElement(By.id("datePickerMonthYearInput"));
        setInputValueByJs(dateInput, "08/15/2025");            // MM/DD/YYYY
        // verify
        System.out.println("date value = " + dateInput.getAttribute("value"));

        WebElement dateTimeInput = driver.findElement(By.id("dateAndTimePickerInput"));
        setInputValueByJs(dateTimeInput, "August 15, 2025 10:30 AM");
        System.out.println("dateTime value = " + dateTimeInput.getAttribute("value"));
    }



 }


