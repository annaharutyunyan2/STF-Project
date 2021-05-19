package com.wellsfargo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountSelectorResultsPage {
    private WebDriver driver;
    private static By result1 = By.xpath("/html/body/div[1]/div/div/div/div[3]/section/div[1]/div[4]/div[1]/div/div[1]/h2/span");
    private static By result2 = By.xpath("/html/body/div[1]/div/div/div/div[3]/section/div[1]/div[4]/div[1]/div/div[2]/h2/span");

    public AccountSelectorResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public static Object getResult1() {
        return result1;
    }

    public static Object getResult2() {
        return result2;
    }
}
