package com.wellsfargo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;

public class SearchResultPage {
    private WebDriver driver;
    private By checkbox = By.id("personal");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickCheckBox(){
        driver.findElement(checkbox).click();
    }

}
