package com.nguyet.test.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage extends GoogleBasePage {

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    protected WebElement searchField;

//    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
//    protected WebElement searchBtn;

    @Step("Set text {text} to search field")
    public void setTextToSearchField(String text) {
        searchField.sendKeys(text);
    }

    @Step("Press search button")
    public void clickSearchBtn() {
        searchField.sendKeys(Keys.ENTER);
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
