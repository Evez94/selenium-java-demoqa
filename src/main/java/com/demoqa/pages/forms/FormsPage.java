package com.demoqa.pages.forms;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import utilities.JavaScriptUtility;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends HomePage {

    private By practiceFormMenuItem = By.xpath("//li[@id='item-0']//span[text() ='Practice Form']");

    public  PracticeFormPage gotoPracticeFormPage(){
        scrollToElementJS(practiceFormMenuItem);
        JavaScriptUtility.clickJS(practiceFormMenuItem);
        return new PracticeFormPage();
    }
}
