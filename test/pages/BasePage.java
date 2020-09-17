package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public abstract class BasePage {

    private String url;
    private WebDriver driver;

    public BasePage(WebDriver driver, String url) {
        this.driver = driver;
        this.url = url;
    }

    public void visit() {
        this.driver.get(url);
    }

    protected void click(By locator) {
        find(locator);
    }

    protected WebElement find(By locator) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator);
    }

    public <T> T waitFor(ExpectedCondition<T> expectedCondition) {
        return new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(500L))
                .withTimeout(Duration.ofSeconds(10L))
                .until(expectedCondition);
    }

}
