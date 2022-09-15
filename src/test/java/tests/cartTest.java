package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CartPage;
import pages.HomePage;

public class cartTest extends BaseTest {


    @BeforeMethod
    public void setup() throws Exception{

        init("CHROME");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


    @Test (description = "Adds Item to Cart and then Removes it ")
    public void addAndRemoveFromCart(){

        BasePage basePage = new BasePage(driver);
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = new CartPage(driver);

        basePage.openBasePage();
        basePage.login("standard_user","secret_sauce");
        homePage.inventoryListIsVissible();
        homePage.openItem("Sauce Labs Backpack");
        cartPage.addToCart();
        homePage.clickShoppingCartButton();
        cartPage.isItemAddedVissible("Sauce Labs Backpack");
        cartPage.removeFromCart();
        cartPage.navigateBack();







    }
}
