package com.demoqa.pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public static WebDriver driver;

    public static void setDriver(WebDriver driver) {  BasePage.driver = driver;  }

    // BasePage daxilində find metodunu bu şəkildə yazmağınız tövsiyə olunur:
    protected WebElement find(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected void set(By locator , String text){
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    protected void click(By locator){ find(locator).click(); }

    public static void delay(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        }catch (InterruptedException exc)   {
            exc.printStackTrace();
        }
        // This is Base page
    }

}
