package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepTwoPage extends BasePage{
    WebDriver driver;



    public CheckoutStepTwoPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(css = ".btn.btn_action.btn_medium")
    WebElement finishButton;

    public void finishCheckout(){
        finishButton.click();
    }
}
