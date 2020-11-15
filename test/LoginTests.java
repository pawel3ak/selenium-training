import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    protected WebDriver driver;
    private Wait<WebDriver> wait;

    @BeforeAll
    public static void setUpEnv() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-training\\chromedriver.exe");
    }

    @BeforeEach
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        wait = new FluentWait<>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(2, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
    }

    @AfterEach
    public void cleanUp() {
        driver.quit();
    }

    @Test
    public void loginAutomationPageTest() {
        driver.get("http://automationpractice.com/");
        driver.findElement(By.cssSelector(".login")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        final WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys("xxx@gmail.com");
        final WebElement createAccountButton = driver.findElement(By.cssSelector("#SubmitCreate"));
    }
}
