package tests;

import org.openqa.selenium.WebDriver;
import selenium_core.DriverManager;
import selenium_core.DriverManagerFactory;


public class BaseTest {


    WebDriver driver;
    DriverManager driverManager;

    public void init(String browser)throws Exception{
        driverManager = DriverManagerFactory.getDriverManager(browser);
        driver = driverManager.getWebDriver();
        driver.manage().window().maximize();

    }
}



