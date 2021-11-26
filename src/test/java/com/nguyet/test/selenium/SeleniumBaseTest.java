package com.nguyet.test.selenium;

import com.nguyet.test.BaseTest;
import com.nguyet.core.DriverWrapper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class SeleniumBaseTest extends BaseTest {

    protected WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        driver = DriverWrapper.getChromeDriver();
        driver.navigate().to("https://google.com");
    }

    @AfterMethod(alwaysRun = true)
    public void clean() {
        driver.quit();
        DriverWrapper.reset();
    }
}
