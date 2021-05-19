package com.wellsFargo.tests;
import com.wellsfargo.pages.AccountSelectorFirstPage;
import com.wellsfargo.pages.AccountSelectorPage;
import com.wellsfargo.pages.AccountSelectorResultsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AccountSelectorPageTest {
    @Test
    public void validSelectorSearch() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //i had to change the initial address for the account selector functionality and go a page back because the driver could only read it that way, it didn't recognize the page itself for some reason
        driver.get("https://www.wellsfargo.com/checking");
        WebElement zipCode = driver.findElement(By.id("zipCode"));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(zipCode));
        driver.findElement(By.id("zipCode")).sendKeys("90210");
        driver.findElement(By.id("c28lastFocusable")).click();
        //I think the "finf the right account" button is a dynamic element and whatever I tried I couldn't get it to recognize the element that's why it fails the test
        WebElement findTheRightAccountBttn = driver.findElement(By.xpath("//button[@class = 'c93 secondarybtn secondarybtn_body_selector']"));
        AccountSelectorFirstPage accountSelectorForFirstPage = new AccountSelectorFirstPage(driver);
        WebDriverWait wait2 = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(findTheRightAccountBttn));
        accountSelectorForFirstPage.clickFindTheRightAccountBttn();
        AccountSelectorPage accountSelector = new AccountSelectorPage(driver);
        accountSelector.clickQ1();
        accountSelector.clickNext();
        accountSelector.clickQ2();
        accountSelector.clickNext();
        accountSelector.clickQ3();
        accountSelector.clickNext();
        accountSelector.clickQ4();
        accountSelector.clickNext();
        accountSelector.clickQ5();
        accountSelector.clickGetResults();
        assertEquals(AccountSelectorResultsPage.getResult1(), "Everyday Checking");
        assertEquals(AccountSelectorResultsPage.getResult2(), "Clear Access Banking");
}
    }