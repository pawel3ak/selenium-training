package selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class MainPageTests extends SdaBaseTest {

    private MainPage mainPage;

    @BeforeEach
    public void setup() {
        super.setup();
        mainPage = new MainPage(driver);
        mainPage.visit();
    }

    @Test
    public void doesMenMenuOptionExists() {
        Assertions.assertTrue(false, "This functionality is not implemented yet");
    }

//    @Test
//    public void isRemovingOfItemPossibleFromShoppingCard(){
//        mainPage.hover(MainPage.shortPlaceholder);
//        mainPage.click(MainPage.addToCardButton);
//        mainPage.click(MainPage.checkoutOrderButton);
//        mainPage.click(MainPage.trashButton);
//        //.alert-warning (visible + text validation)
//    }

    @Test
    public void isRemovingOfItemPossibleFromShoppingCardVar2(){
        mainPage.hoverDressPlaceholder();
        mainPage.clickAddToCard();
        mainPage.clickCheckoutOrder();
        mainPage.removeElementFromCard();
        mainPage.waitForRemovingShopingList();
        Assertions.assertTrue(mainPage.isAlertVisible());
        Assertions.assertEquals("Your shopping cart is empty.", mainPage.getAlertText());
    }

    // doAllMenuOptionsExists()
    // isTheContentOfWomenSubMenuOK()
    // isTheContentOfDressesSubMenuOK()
    // isTheContentOfTshirtsSubMenuOK()
    // areAll23AdverbsVisible()

    //addToCartItemsFromMainPage()
    //isNewsletterWorking()

    //doesSearchWorkWithCorrectData()

}
