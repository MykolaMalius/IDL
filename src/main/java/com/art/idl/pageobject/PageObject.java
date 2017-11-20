package com.art.idl.pageobject;
import com.art.idl.singleton.SingletonDriver;
import com.art.idl.singleton.TestExecutionListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.testng.annotations.Listeners;

@Listeners({ TestExecutionListener.class })
public class PageObject {
    public PageObject(WebDriver driver) {
        WebDriver instance = SingletonDriver.getInstance();
        PageFactory.initElements((new DefaultElementLocatorFactory(instance)),this);
    }

    public PageObject() {
        this(SingletonDriver.getInstance());
    }

}
