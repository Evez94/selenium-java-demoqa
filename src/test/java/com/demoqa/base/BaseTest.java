package com.demoqa.base;

import com.demoqa.pages.base.BasePage;
import com.demoqa.pages.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.demoqa.pages.base.BasePage.delay;
import static utilities.Utility.setUtilityDriver;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String DEMOQA_URL = "https://demoqa.com";

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();

        // CI/CD (Jenkins/Docker) üçün mütləq olan sazlamalar
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080"); // maximize() əvəzinə bu kifayətdir
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);

        driver.get(DEMOQA_URL);

        // DemoQA-dəki mane olan reklamları və footer-i silirik
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("document.querySelectorAll('iframe, #fixedban, footer').forEach(el => el.remove());");
        } catch (Exception ignored) {}

        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            delay(1000);
            driver.quit();
        }
    }
}