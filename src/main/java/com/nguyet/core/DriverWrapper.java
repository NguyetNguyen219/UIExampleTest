package com.nguyet.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverWrapper {
    private static WebDriver chromeDriver;
    private static WebDriver edgeDriver;
    private static WebDriver firefoxDriver;

    private static WebDriverWait driverWait;

    private DriverWrapper() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=es");

        ChromeDriverService service = ChromeDriverService.createServiceWithConfig(options);
        chromeDriver = new ChromeDriver();
    }

    public static WebDriver getChromeDriver() {
        if(chromeDriver == null)
            new DriverWrapper();
        return chromeDriver;
    }

    public static WebDriverWait getDriverWait() {
        if(driverWait == null)
            driverWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
        return driverWait;
    }

    public static void reset() {
        chromeDriver = null;
    }
}
