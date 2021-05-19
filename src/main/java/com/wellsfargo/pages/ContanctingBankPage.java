package com.wellsfargo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContanctingBankPage {

    private static WebDriver driver;
    private static By fname = By.id("fname");
    private By lname = By.id("lname");
    private By street = By.id("street");
    private By city = By.id("city");
    private By zip = By.id("zip");
    private By email = By.id("email");
    private By phone = By.id("phone");
    private By school = By.id("sname");
    private By gradYear = By.id("gclass");
    private By personalFinance = By.id("personalFinance");

    public ContanctingBankPage(WebDriver driver) {
        this.driver = driver;
    }
    public static void setFName(String fName){
        driver.findElement(fname).sendKeys(fName);
    }
    public void setLName(String LName){
        driver.findElement(lname).sendKeys(LName);
    }
    public void setStreet(String Street){
        driver.findElement(street).sendKeys(Street);
    }
    public void setCity(String City){
        driver.findElement(city).sendKeys(City);
    }
    public void setZip(String Zip){
        driver.findElement(zip).sendKeys(Zip);
    }
    public void setEmail(String Email){
        driver.findElement(email).sendKeys(Email);
    }
    public void setPhone(String Phone){
        driver.findElement(phone).sendKeys(Phone);
    }
    public void setSchool(String School){
        driver.findElement(school).sendKeys(School);
    }
    public void setGradYear(String GradYear){
        driver.findElement(gradYear).sendKeys(GradYear);
    }
    public void clickPersonalFinance(){
        driver.findElement(personalFinance).click();
    }
    public static Object getFName() {
        return fname;
    }

}
