package com.wellsfargo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountSelectorFirstPage {
    private WebDriver driver;
    public By findTheRightAccount = By.linkText("/wst_transfer?dest=PSCHK");

    public AccountSelectorFirstPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickFindTheRightAccountBttn(){
        driver.findElement(findTheRightAccount).click();
    }
}
