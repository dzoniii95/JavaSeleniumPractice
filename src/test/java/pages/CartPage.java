package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage extends BasePage {

    WebDriver driver;

    public CartPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy (css = "//*[@id=\"continue-shopping\"]")
    WebElement continueShoppingButton;


    @FindBy(css = ".btn.btn_primary.btn_small")
    WebElement addToCartButton;
    @FindBy(css = ".btn.btn_secondary.btn_small.cart_button")
    WebElement removeFromCartButton;

    @FindBy(css = ".btn.btn_secondary.back")
    WebElement backButton;

    @FindBy(css = ".btn.btn_action")
    WebElement checkoutButton;

    public void addToCart(){
        clickElement(addToCartButton);
    }
    public void removeFromCart(){
        clickElement(removeFromCartButton);
    }
    public void isItemAddedVissible(String itemName){
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='"+itemName+"']")).isDisplayed());
    }
    public void navigateBack(){
        backButton.click();
    }
    public void goToCheckout(){
        checkoutButton.click();

    }
}
