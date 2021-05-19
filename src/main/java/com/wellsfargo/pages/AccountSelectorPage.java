package com.wellsfargo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountSelectorPage {
    private WebDriver driver;
    private By Q1 = By.xpath("helpForm.1_CHK_Q1_A1");
    private By Q2 = By.id("helpForm.2_CHK_Q2_A1");
    private By Q3 = By.id("helpForm.3_CHK_Q2_A2");
    private By Q4 = By.id("helpForm.4_CHK_Q4_A3");
    private By Q5 = By.id("helpForm.5_CHK_Q5_A1");
    private By nextButton = By.id("next-btn");
    private By getResults = By.xpath("/html/body/div[1]/div/div/div/div[3]/section/div[1]/div[3]/div/div/div[2]/form/div/div/div[6]/button");

    public AccountSelectorPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickQ1(){
        driver.findElement(Q1).click();
    }
    public void clickQ2(){
        driver.findElement(Q2).click();
    }
    public void clickQ3(){
        driver.findElement(Q3).click();
    }
    public void clickQ4(){
        driver.findElement(Q4).click();
    }
    public void clickQ5(){
        driver.findElement(Q5).click();
    }
    public void clickNext(){
        driver.findElement(nextButton).click();
    }
    public void clickGetResults(){
        driver.findElement(getResults).click();
    }
}
