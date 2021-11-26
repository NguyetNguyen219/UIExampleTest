package com.nguyet.test.pages;

import com.nguyet.core.DriverWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleBasePage {

    protected WebDriver driver = DriverWrapper.getChromeDriver();

    public GoogleBasePage() {
        PageFactory.initElements(driver, this);
    }
}
