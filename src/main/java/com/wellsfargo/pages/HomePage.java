package com.wellsfargo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    /*for the search bar, the website requires you to click on a small search bar first
    (which works very problematically, will only open after a couple clicks)
    and then it opens another search bar, where you have to type, that's why there's two search bar variables
    */
    private By searchBar1 = By.xpath("//*[@id=\"nxgSearchButton\"]/span[1]");
    private By searchBar2 = By.id("autosuggest_list-search-field");
    private By searchButton = By.className("SearchButton__searchButton___318vg");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickSearchBar(){
        driver.findElement(searchBar1).click();
    }
    public void clickSearchBar2(){
        driver.findElement(searchBar2).click();
    }
    public void writeSearch(String search){
        driver.findElement(searchBar2).sendKeys(search);
    }
    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }

}