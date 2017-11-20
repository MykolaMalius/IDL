package com.art.idl.singleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class SingletonDriver {
    private static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<WebDriver>();
    private SingletonDriver() {
    }
    public static WebDriver getInstance() {
        if (webDriverThreadLocal.get() != null) {
            return webDriverThreadLocal.get();
        }
        WebDriver instance;
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        EnvProperties envProperties = new EnvProperties();
        instance = new ChromeDriver();
        instance.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        instance.manage().window().maximize();
        webDriverThreadLocal.set(instance);
        webDriverThreadLocal.get().get(envProperties.getBaseUrl());
        return webDriverThreadLocal.get();
    }
    public static void quit(){
        try{
            webDriverThreadLocal.get().quit();
        }
        finally {
            webDriverThreadLocal.remove();
        }
    }
}