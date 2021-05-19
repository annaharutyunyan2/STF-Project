package com.wellsFargo.tests;

import com.wellsfargo.pages.ContanctingBankPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class ContactingBankPageTest {
    private static String Fname = "First Name";

    public static String getFname() {
        return Fname;
    }

    @Test
    public void fillingForm(){
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicefinance.wellsfargo.com/sf/campaign-input/7013g0000000rlj-139");

        ContanctingBankPage contacting = new ContanctingBankPage(driver);
        contacting.setFName(Fname);
        contacting.setLName("Last Name");
        contacting.setStreet("Street 1");
        contacting.setCity("City 1");
        WebElement state = driver.findElement(By.id("state"));
        Select select = new Select(state);
        select.selectByValue("AL");
        contacting.setZip("90210");
        contacting.setEmail("email@example.com");
        contacting.setPhone("5551111111");
        contacting.setSchool("School 1");
        contacting.setGradYear("2022");
        contacting.clickPersonalFinance();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("personalFinance")));
        driver.navigate().to("https://wellsfargo.com");
        assertEquals(ContanctingBankPage.getFName(), ContactingBankPageTest.getFname());
    }
}
