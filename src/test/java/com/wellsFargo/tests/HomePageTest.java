package com.wellsFargo.tests;
import com.wellsfargo.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HomePageTest {

        @Test
        public void searching(){
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.wellsfargo.com/");

            HomePage searching = new HomePage(driver);
            searching.clickSearchBar();
            WebElement search1 = driver.findElement(By.xpath("//*[@id=\"nxgSearchButton\"]/span[1]"));
            WebDriverWait wait = new WebDriverWait(driver, 40);
            wait.until(ExpectedConditions.visibilityOf(search1));
            /* the program is unable to recognize the path of the second search bar,
            because of the problematic nature of the website's search property.
            That's why it throws an error, even though it opens the second search bar AFTER throwing the error.
            I tried implementing a wait strategy, for it to be able to load comfortably, but the error says
            it just can't find the element, even though I've tried with every locator
            */
//           searching.clickSearchBar2();
            searching.writeSearch("cards");
            searching.clickSearchButton();
        }

}
