package com.demoqa.tests.javascript;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptTest  extends BaseTest {

    @Test
    public void testScrollingToElement(){
        homePage.goToForms();
        System.out.println("LOG: Form kartına uğurla klik olundu.");

        // Yoxlama (Assertion)
        Assert.assertTrue(driver.getCurrentUrl().contains("forms"), "Form səhifəsinə keçid alınmadı!");
        System.out.println("LOG: Form səhifəsinin URL-i doğrulandı.");
    }
}
