import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTests {

    protected WebDriver driver;

    @BeforeAll
    public static void setUpEnv() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-training\\chromedriver.exe");
    }

    @BeforeEach
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }

    @AfterEach
    public void cleanUp() {
        driver.quit();
    }

    @Test
    public void loginAutomationPageTest() {
        driver.get("http://automationpractice.com/");
        driver.findElement(By.cssSelector(".login"));
        final WebElement inputEmail = driver.findElement(By.cssSelector("#email_create"));
        inputEmail.sendKeys("xxx@gmail.com");
        final WebElement createAccountButton = driver.findElement(By.cssSelector("#SubmitCreate"));
    }
}
