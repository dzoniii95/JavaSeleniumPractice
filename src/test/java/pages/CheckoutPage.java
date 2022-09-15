package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = ".checkout_info>:nth-child(1)")
    WebElement firstNameInput;
    @FindBy(css = ".checkout_info>:nth-child(2)")
    WebElement lastNameInput;
    @FindBy(css = ".checkout_info>:nth-child(3)")
    WebElement postalCodeInput;
    @FindBy(css = ".submit-button")
    WebElement continueButton;

    @FindBy(css = ".btn.btn_secondary.back")
    WebElement backButton;


    public void enterCheckoutInfo(String firstName, String lastName, String postalCode){

        inputText(firstNameInput,firstName );
        inputText(firstNameInput,lastName );
        inputText(firstNameInput,postalCode );

    }

    public void clickContinue(){

        clickElement(continueButton);
    }
    public void clickGoBack(){

        clickElement(backButton);
    }

}
