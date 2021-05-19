package com.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;

public class ScreenshotFunctionality {

    public static void takeScreenshot(WebDriver driver, String screenshotName) throws Exception{
        try{
            TakesScreenshot screenshot = (TakesScreenshot)driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            FileHandler.copy(source, new File("./Screenshots/" + screenshotName + ".png"));
            System.out.println("Screenshot has been taken successfully");
        }catch(Exception e){
            System.out.println("Error while taking screenshot");
        }
    }
}
