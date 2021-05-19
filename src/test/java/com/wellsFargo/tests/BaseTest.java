package com.wellsFargo.tests;
import com.wellsfargo.pages.HomePage;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    private EventFiringWebDriver driver;
    HomePage homePage;


    @BeforeMethod
    public void goHome(){
        driver.get("https://wellsfargo.com");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        return options;
    }
}
