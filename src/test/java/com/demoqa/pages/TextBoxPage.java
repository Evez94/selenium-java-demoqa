//package com.demoqa.pages;
//
//import com.demoqa.pages.base.BasePage;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
////
////public class TextBoxPage extends BasePage {
////
////    // Locators
////    private final By fullNameInput = By.id("userName");
////    private final By emailInput = By.id("userEmail");
////    private final By submitButton = By.id("submit");
////    private final By nameOutput = By.id("name");
////
////    // Constructor: super(driver) vasitəsilə driver-i BasePage-ə ötürürük
////    public TextBoxPage(WebDriver driver) {
////        super(driver);
////    }
////
////    // Actions
////    public void fillForm(String name, String email) {
////        driver.findElement(fullNameInput).sendKeys(name);
////        driver.findElement(emailInput).sendKeys(email);
////    }
//
//    public void clickSubmit() {
//        WebElement btn = driver.findElement(submitButton);
//        // BasePage-dən gələn scrollToElement metodundan istifadə edirik
//        scrollToElement(btn);
//        btn.click();
//    }
//
//    public String getSubmittedNameText() {
//        return driver.findElement(nameOutput).getText();
//    }
//}