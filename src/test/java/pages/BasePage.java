package pages;

import helpers.CommonActions;
import io.qameta.allure.Step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class BasePage extends CommonActions {

    WebDriver driver;

    public BasePage (WebDriver driver){

        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy (id = "user-name")
    WebElement emailInput;
    @FindBy (name = "password")
    WebElement passwordInput;

    @FindBy(css = ".submit-button")
    WebElement submitButton;
    @FindBy(css = ".error-button")
    WebElement credentialsError;

    @Step("User logs in")
    public void login(String email, String password){
        inputText(emailInput, email);
        inputText(passwordInput, password);
        clickElement(submitButton);
            }

    public void openBasePage(){
        driver.get("https://www.saucedemo.com/");

    }

    public void wrongCredentialsWarning(){

        Assert.assertTrue(credentialsError.isDisplayed());
    }

}
