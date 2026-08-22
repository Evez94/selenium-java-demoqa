package com.demoqa.pages.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.JavaScriptUtility;

import java.time.Duration;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage {

    private By femaleRadioLabel = By.cssSelector("label[for='gender-radio-2']");
    private By femaleRadioInput = By.id("gender-radio-2");
    private By readingCheckbox = By.id("hobbies-checkbox-2");


    public void clickFemaleRadioButton() {
        // Element DOM-da görünənə qədər maksimum 10 saniyə gözləyirik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(femaleRadioLabel));

        scrollToElementJS(femaleRadioLabel);
        JavaScriptUtility.clickJS(femaleRadioLabel);
    }

    public boolean isFemaleSelected() {
        return find(femaleRadioInput).isSelected();
    }

    public void clickReadingCheckBox(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(readingCheckbox));
        if(!find(readingCheckbox).isSelected()){
            scrollToElementJS(readingCheckbox);
            JavaScriptUtility.clickJS(readingCheckbox);
        }
    }
    public void unClickReadingCheckBox(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(readingCheckbox));
        if(find(readingCheckbox).isSelected()){
            scrollToElementJS(readingCheckbox);
            JavaScriptUtility.clickJS(readingCheckbox);
        }
    }

    public boolean isReadingSelected(){
        return find(readingCheckbox).isSelected();
    }
}