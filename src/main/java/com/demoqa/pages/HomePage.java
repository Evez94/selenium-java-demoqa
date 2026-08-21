package com.demoqa.pages;

import com.demoqa.pages.base.BasePage;
import com.demoqa.pages.forms.FormsPage;
import org.openqa.selenium.By;
import utilities.JavaScriptUtility;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private  By formsCard = By.xpath("//div[@id ='root']//h5[text()='Forms']");

    public FormsPage goToForms(){
        scrollToElementJS(formsCard);
        JavaScriptUtility.clickJS(formsCard);
        return new FormsPage();
    }


}
