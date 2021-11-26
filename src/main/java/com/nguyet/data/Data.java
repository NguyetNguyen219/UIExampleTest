package com.nguyet.data;

import org.testng.annotations.DataProvider;

public class Data {
    @DataProvider(name = "texts")
    public Object[][] textToSearch() {
        return new Object[][] {
                {"Moon"},
                {"Sun"},
                {"Earth"}
        };
    }
}
