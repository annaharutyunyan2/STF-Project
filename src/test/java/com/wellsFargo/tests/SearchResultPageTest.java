package com.wellsFargo.tests;
import com.wellsfargo.pages.ContanctingBankPage;
import com.wellsfargo.pages.SearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class SearchResultPageTest {
    @Test
    public void validResults(){
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wellsfargo.com/search/search?q=cards");
        SearchResultPage searching = new SearchResultPage(driver);
        searching.clickCheckBox();
        WebElement text1 = driver.findElement(By.xpath("//*[@id=\"nxgSearchRoot\"]/div/div/div/div[3]/div[3]/div[1]/div[3]/ul/li[1]/p[1]"));
        WebElement text2 = driver.findElement(By.xpath("//*[@id=\"nxgSearchRoot\"]/div/div/div/div[3]/div[3]/div[1]/div[3]/ul/li[1]/h3/a"));
        WebElement text3 = driver.findElement(By.xpath("//*[@id=\"nxgSearchRoot\"]/div/div/div/div[3]/div[3]/div[1]/div[3]/ul/li[1]/p[2]"));

//        Should fail because we're comparing an xpath to the word "personal"
        assertEquals(text1, "Personal");

    }


}
