package com.art.idl.pages;

import com.art.idl.pageobject.PageObject;
import com.art.idl.singleton.EnvProperties;
import com.art.idl.singleton.SingletonDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by M.Malyus on 11/7/2017.
 */
public class IDLHomePage extends PageObject {
    private EnvProperties envProperties = new EnvProperties();
    private WebDriver driver = SingletonDriver.getInstance();
    private final Wait wait = new WebDriverWait(driver, 5, 1000);

    @FindBy(xpath = "//div[@class=\"nav-list\"]//ul[@class=\"nav navbar-nav navbar-right\"]//li[1]")
    private WebElement pricingButton;

    @FindBy(xpath = "//div//div[@class=\"col-sm-6 col-md-6 col-lg-3 price-block\"][1]")
    private WebElement pricingScreenPresents;

    @FindBy(xpath = "//div//div[@class=\"row why\"][1]")
    private WebElement presentsOfHomePage;

    @FindBy(xpath = "//div[@class=\"nav-list\"]//ul[@class=\"nav navbar-nav navbar-right\"]//li[2]")
    private WebElement faqButton;

    @FindBy(xpath = "//div[@id=\"accordion\"]//div[@class=\"panel active\"]")
    private WebElement presentsOfFAQPage;

    @FindBy(xpath = "//div[@class=\"nav-list\"]//ul[@class=\"nav navbar-nav navbar-right\"]//li[3]")
    private WebElement contactUsButton;

    @FindBy(xpath = "//div[@class=\"row info\"]//div[@class=\"info\"][1]")
    private WebElement presentsOfContactUsPAge;

    @FindBy(xpath = "//div[@class=\"nav-list\"]//ul[@class=\"nav navbar-nav navbar-right\"]//li[4]")
    private WebElement getOneRightNowButtonOfTopMenu;

    @FindBy(xpath = "//div[@class=\"banner-text\"]//button")
    private WebElement getOneRightNowButtonOfBanner;

    @FindBy(xpath = "//div[@class=\"container\"]//div[@class=\"row button-area\"]//button")
    private WebElement getOneRightNowButtonNearBottom;
    @Step
    public void clickOnPricingButton() {
        pricingButton.click();
    }
    @Step
    public boolean checkIfPricingScreenPresent(){
        return pricingScreenPresents.isDisplayed();
    }
    @Step
    public void returnToHomePage(){
        driver.navigate().back();
    }
    @Step
    public boolean checkIfHomeScreenIsPresent(){
        return presentsOfHomePage.isDisplayed();
    }
    @Step
    public void clickOnFAQButton(){
        faqButton.click();
    }
    @Step
    public boolean checkIfFAQPageIsPresent(){
        return presentsOfFAQPage.isDisplayed();
    }
    @Step
    public void clickOnContactUsButton(){
        contactUsButton.click();
    }
    @Step
    public boolean checkIfContactUsPageIsPresent(){
        return presentsOfContactUsPAge.isDisplayed();
    }
    @Step
    public void clickOnGetOneRightNowButtonOfTopMenu(){
        getOneRightNowButtonOfTopMenu.click();
    }
    @Step
    public void clickOnGetOneRIghtNowButtonOfBanner(){
        getOneRightNowButtonOfBanner.click();
    }
    @Step
    public void clickOnGetOneRightNewButtonNearBottom(){
        getOneRightNowButtonNearBottom.click();
    }

    public void typePasswordAndSubmit(String password) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"passwordNext\"]/content/span")));
    }
}
