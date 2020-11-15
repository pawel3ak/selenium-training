package selenium;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.dresses.DressesPage;

public class ShoppingTests extends SdaBaseTest {
    //isPossibleToCompareTwoProducts()

    //isPossibleToOrderChoosenItems()
    private DressesPage dressesPage;

    @BeforeEach
    public void setup() {
        super.setup();
        dressesPage = new DressesPage(driver);
        dressesPage.visit();
    }

    @Test
    public void isRemovingOfItemPossibleFromShoppingCard(){
        //#center_column #homefeatured > li a[title="Faded Short Sleeve T-shirts"] hover
        //#homefeatured .right-block .button-container a[data-id-product="1"] click
        //.layer_cart_cart .button-medium click
        //.icon-trash click
        //.alert-warning (visible + text validation)

    }

    @Test
    public void isSizeSFilterWorkFine() throws InterruptedException {
        dressesPage.setSizeFilter("S");
        Assert.assertTrue(driver.findElement(By.cssSelector("span.checked")).isDisplayed());
    }
}
