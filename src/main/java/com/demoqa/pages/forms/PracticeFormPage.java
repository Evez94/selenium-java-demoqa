package com.demoqa.pages.forms;

import org.openqa.selenium.By;
import utilities.JavaScriptUtility;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage {

    private By femaleRadioButton = By.cssSelector("label[for='gender-radio-2']");

    public void clickFemaleRadioButton(){
        scrollToElementJS(femaleRadioButton);
        JavaScriptUtility.clickJS(femaleRadioButton);
    }

    public boolean isFemaleSelected(){
        return find(femaleRadioButton).isSelected();
    }
}
