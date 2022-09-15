package tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.HomePage;

import java.io.IOException;

public class loginTest extends  BaseTest{

    @BeforeMethod
    public void setup() throws Exception{

        init("CHROME");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void validLogin() throws IOException{
        BasePage basePage = new BasePage(driver);
        HomePage homePage = new HomePage(driver);

        basePage.openBasePage();
        basePage.login("standard_user","secret_sauce");
        homePage.clickShoppingCartButton();


    }
    @Test
    public void wrongCredentialsLogin() throws IOException{
        BasePage basePage = new BasePage(driver);
        HomePage homePage = new HomePage(driver);
        basePage.openBasePage();
        basePage.login("standard_user","x");
        basePage.wrongCredentialsWarning();
        basePage.login("standard_user","");
        basePage.wrongCredentialsWarning();




    }

}
