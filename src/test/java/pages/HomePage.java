package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BasePage{

    WebDriver driver;


    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(css =  ".shopping_cart_container")
    WebElement shoppingCartButton;
    @FindBy(css= ".inventory_list")
    WebElement inventoryList;

    public void clickShoppingCartButton(){
            clickElement(shoppingCartButton);

    }
    public void inventoryListIsVissible(){
        Assert.assertTrue(inventoryList.isDisplayed());
    }
    public void openItem(String itemName){
        driver.findElement(By.xpath("//div[text()='"+itemName+"']")).click();
    }
}
