//package com.demoqa.base;
//
//import com.demoqa.pages.base.BasePage;
//import com.demoqa.pages.HomePage;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//
//import static com.demoqa.pages.base.BasePage.delay;
//import static utilities.Utility.setUtilityDriver;
//
//public class BaseTest {
//    // Variable public yox, protected olmalıdır ki, miras alan (extends) klaslar oxuya bilsin
//    protected WebDriver driver;
//
//    protected BasePage basePage;
//    protected HomePage homePage;
//    private String DEMOQA_URL = "https://demoqa.com";
//
//
//    @BeforeClass
//    public void setUp(){
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//    }
//
//    @BeforeMethod
//    public void loadApplication(){
//        driver.get(DEMOQA_URL);
//        basePage = new BasePage();
//        basePage.setDriver(driver);
//        setUtilityDriver();
//        homePage = new HomePage();
//    }
//
//
//    @BeforeMethod
//    public void setUp() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless=new");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--window-size=1920,1080");
//
//        driver = new ChromeDriver(options);
//        driver.get("https://demoqa.com/text-box");
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            delay(3000);
//            driver.quit();
//        }
//    }
//}


package com.demoqa.base;

import com.demoqa.pages.base.BasePage;
import com.demoqa.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static com.demoqa.pages.base.BasePage.delay;
import static utilities.Utility.setUtilityDriver;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String DEMOQA_URL = "https://demoqa.com";

    @BeforeClass
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(DEMOQA_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            delay(3000);
            driver.quit();
        }
    }
}