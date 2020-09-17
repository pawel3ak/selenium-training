package selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends SdaBaseTest {

    @Test
    public void loginAutomationPageTest() {
        driver.get("http://automationpractice.com/");
        driver.findElement(By.cssSelector(".login")).click();
        final WebElement inputEmail = driver.findElement(By.cssSelector("#email_create"));
        inputEmail.sendKeys("xxx@gmail.com");
        final WebElement createAccountButton = driver.findElement(By.cssSelector("#SubmitCreate"));
    }

    @Test
    public void loginWithNonExistingUser() {

    }

}
