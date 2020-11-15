package pages;

import helpers.StringHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {

    private static final String url = "http://automationpractice.com/index.php";

    public static final By shortPlaceholder = By.cssSelector("#center_column #homefeatured > li a[title='Faded Short Sleeve T-shirts']");
    public static final By addToCardButton = By.cssSelector("#homefeatured .right-block .button-container a[data-id-product='1']");
    public static final By checkoutOrderButton = By.cssSelector(".layer_cart_cart .button-medium");
    public static final By trashButton = By.cssSelector(".icon-trash");
    public static final By alertLocator = By.className("alert-warning");
    private static final By shoppingListLocator = By.id("cart_summary");

    public MainPage(WebDriver driver) {
        super(driver, url);
    }

    public void hoverDressPlaceholder() {
        this.hover(shortPlaceholder);
    }

    public void clickAddToCard() {
        this.click(addToCardButton);
    }

    public void clickCheckoutOrder() {
        this.click(checkoutOrderButton);
    }

    public void removeElementFromCard() {
        this.click(trashButton);
    }

    public String getAlertText() {
        return getText(alertLocator);
    }

    public boolean isAlertVisible() {
        return isVisible(alertLocator);
    }

    public void waitForRemovingShopingList() {
        waitFor(ExpectedConditions.invisibilityOfElementLocated(shoppingListLocator));
    }
//    example, do not use this!!!
//    public void fillUpEmail(){
//        find(emailInput).sendKeys(StringHelper.generateRandomEmail());
//    }
}
