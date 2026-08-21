package com.demoqa.pages.forms;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton(){
        var formsPage = homePage.goToForms().gotoPracticeFormPage();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleSelected();

        Assert.assertTrue(isFemaleRadioButtonSelected,"\n Female Radio Button is not Selected \n");
    }
}
