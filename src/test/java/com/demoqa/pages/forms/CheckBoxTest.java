package com.demoqa.pages.forms;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

    @Test
    public void testReadingHobbyCheckBox(){
        var practiceFormPage = homePage.goToForms().gotoPracticeFormPage();
        practiceFormPage.clickReadingCheckBox();
        practiceFormPage.unClickReadingCheckBox();

        boolean isReadingCheckBoxSelected = practiceFormPage.isReadingSelected();
        Assert.assertFalse(isReadingCheckBoxSelected,"\n Reading CheckBox is Selected \n");
    }
}
