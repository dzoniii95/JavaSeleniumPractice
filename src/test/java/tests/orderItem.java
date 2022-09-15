package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

public class orderItem extends BaseTest {




    @BeforeMethod
    public void setup( )throws Exception{
        init("CHROME");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    public void addToCartAndCheckout(){
        BasePage basePage = new BasePage(driver);
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage(driver);

        basePage.openBasePage();
        basePage.login("standard_user","secret_sauce");
        homePage.inventoryListIsVissible();
        homePage.openItem("Sauce Labs Backpack");
        cartPage.addToCart();
        cartPage.navigateBack();
        homePage.openItem("Sauce Labs Fleece Jacket");
        cartPage.addToCart();
        homePage.clickShoppingCartButton();
        cartPage.isItemAddedVissible("Sauce Labs Backpack");
        cartPage.isItemAddedVissible("Sauce Labs Fleece Jacket");
        cartPage.goToCheckout();
        checkoutPage.enterCheckoutInfo("Nikola","Stojkovic","11333344");
        checkoutPage.clickContinue();
        checkoutStepTwoPage.finishCheckout();










    }
}
