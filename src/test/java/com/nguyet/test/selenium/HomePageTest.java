package com.nguyet.test.selenium;

import com.nguyet.data.Data;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.nguyet.test.pages.GoogleHomePage;

public class HomePageTest extends SeleniumBaseTest {

    @Test(dataProvider = "texts", dataProviderClass = Data.class)
    public void testExample(String text) {
        GoogleHomePage homePage = new GoogleHomePage();
        homePage.setTextToSearchField(text);
        homePage.clickSearchBtn();

        Assert.assertTrue(homePage.getTitle().contains(text));
    }
}
