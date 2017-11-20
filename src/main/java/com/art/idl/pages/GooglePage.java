package com.art.idl.pages;

import com.art.idl.pageobject.PageObject;
import com.art.idl.singleton.EnvProperties;
import com.art.idl.singleton.SingletonDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by M.Malyus on 11/8/2017.
 */
public class GooglePage extends PageObject {
    private EnvProperties envProperties = new EnvProperties();
    private WebDriver driver = SingletonDriver.getInstance();
    private final Wait wait = new WebDriverWait(driver, 5, 1000);

    @FindBy(xpath = ".//*[@id='sb_ifc0']")
    private WebElement searchField;
    @FindBy(xpath = "//div[2]/div[3]/center/input[1]")
    private WebElement searchButton;

    @Step
    public void writeNewText(String text){
        searchButton.click();
        Assert.assertTrue(true);
    }
    @Step
    public void make(){
        Assert.assertTrue(true);
    }

}
