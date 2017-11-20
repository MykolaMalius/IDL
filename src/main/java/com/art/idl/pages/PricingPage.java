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
public class PricingPage extends PageObject {
    private EnvProperties envProperties = new EnvProperties();
    private WebDriver driver = SingletonDriver.getInstance();
    private final Wait wait = new WebDriverWait(driver, 5, 1000);

    @FindBy(xpath = "//div[@class=\"nav-list\"]//ul[@class=\"nav navbar-nav navbar-right\"]//li[1]")
    private WebElement pricingButton;

    @FindBy(xpath = "//div//div[@class=\"col-sm-6 col-md-6 col-lg-3 price-block\"][1]")
    private WebElement pricingScreenPresents;

    @FindBy(xpath = "//div[@class=\"nav-list\"]//ul[@class=\"nav navbar-nav navbar-right\"]//li[2]")
    private WebElement faqButton;

    @FindBy(xpath = "//div[@id=\"accordion\"]//div[@class=\"panel active\"]")
    private WebElement presentsOfFAQPage;

    @FindBy(xpath = "//div[@class=\"nav-list\"]//ul[@class=\"nav navbar-nav navbar-right\"]//li[3]")
    private WebElement contactUsButton;

    @FindBy(xpath = "//div[@class=\"row info\"]//div[@class=\"info\"][1]")
    private WebElement presentsOfContactUsPAge;

    @FindBy(xpath = "//div[@class=\"col-sm-6 col-md-6 col-lg-3 price-block\"][1]//button")
    private WebElement getYourIDLButtonOfFirstItem;

    @FindBy(xpath = "//div[@class=\"col-sm-6 col-md-6 col-lg-3 price-block\"][2]//button")
    private WebElement getYourIDLButtonOfSecondItem;

    @FindBy(xpath = "//div[@class=\"col-sm-6 col-md-6 col-lg-3 price-block\"][3]//button")
    private WebElement getYourIDLButtonOfThirdItem;

    @FindBy(xpath = "//div[@class=\"col-sm-6 col-md-6 col-lg-3 price-block\"][4]//button")
    private WebElement getYourIDLButtonOfFourthdItem;

    //getText() from the title of page
    @FindBy(xpath = "//h2[@class=\"step ng-scope\"]")
    private WebElement presentsOfPersonalInformationPage;
    
    @Step
    public void clickOnPricingButtonOnPricingScreen(){
        pricingButton.click();
    }
    @Step
    public boolean checkPresentsOfPricingScreen(){
        return pricingScreenPresents.isDisplayed();
    }
    @Step
    public void clickOnFAQButtonOfPricingScreen(){
        faqButton.click();
    }
    @Step
    public boolean checkPresentsOfFAQScreen(){
        return presentsOfFAQPage.isDisplayed();
    }
    @Step
    public void returnToPricingScreenFromFAQ(){
        driver.navigate().back();
    }
    @Step
    public void clickOnContactUsOfFAQPage(){
        contactUsButton.click();
    }
    @Step
    public boolean checkPresentsOfContacUsPage(){
        return presentsOfContactUsPAge.isDisplayed();
    }
    @Step
    public void returnToPricingScreenFromContactUs(){
        driver.navigate().back();
    }
    @Step
    public void clickOnGetYourIDLOfFirstItem(){
        getYourIDLButtonOfFirstItem.click();
    }
    @Step
    public void clickOnGetYourIDLOfSecondItem(){
        getYourIDLButtonOfSecondItem.click();
    }
    @Step
    public void clickOnGetYourIDLOfThirdButton(){
        getYourIDLButtonOfThirdItem.click();
    }
    @Step
    public void clickOnGetYourIDLOfFourthButton(){
        getYourIDLButtonOfFourthdItem.click();
    }
    @Step
    public String presentsOfPersonalInformationPage(){
        return presentsOfPersonalInformationPage.getText();
    }
    @Step
    public void turnBackFromPersonalInformationPage(){
        driver.navigate().back();
    }


}
