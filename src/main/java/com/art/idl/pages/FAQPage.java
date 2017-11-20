package com.art.idl.pages;

import com.art.idl.pageobject.PageObject;
import com.art.idl.singleton.EnvProperties;
import com.art.idl.singleton.SingletonDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by M.Malyus on 11/8/2017.
 */
public class FAQPage extends PageObject {
    private EnvProperties envProperties = new EnvProperties();
    private WebDriver driver = SingletonDriver.getInstance();
    private final Wait wait = new WebDriverWait(driver, 5, 1000);

    @FindBy(xpath = "//div[@class=\"nav-list\"]//ul[@class=\"nav navbar-nav navbar-right\"]//li[3]")
    private WebElement contactUsButton;

    @FindBy(xpath = "//div[@class=\"row info\"]//div[@class=\"info\"][1]")
    private WebElement presentsOfContactUsPAgeElement;

    @FindBy(xpath = "//div[@class=\"nav-list\"]//ul[@class=\"nav navbar-nav navbar-right\"]//li[2]")
    private WebElement faqButton;

    @FindBy(xpath = "//div[@id=\"accordion\"]//div[@class=\"panel active\"]")
    private WebElement presentsOfFAQPage;

    @FindBy(xpath = "//div[@class=\"nav-list\"]//ul[@class=\"nav navbar-nav navbar-right\"]//li[1]")
    private WebElement pricingButton;

    @FindBy(xpath = "//div//div[@class=\"col-sm-6 col-md-6 col-lg-3 price-block\"][1]")
    private WebElement pricingScreenPresents;

    @FindBy(xpath = "//div[@class=\"panel active\"]//div[@class=\"panel-body\"]")
    private WebElement presentsOfAnswer;

    @FindBy(xpath = "//div[@class=\"panel-group\"]//div[@class=\"panel\"][1]//a")
    private WebElement firstQuestionButton;

    @FindBy(xpath = "//div[@class=\"panel-group\"]//div[@class=\"panel\"][1]//div[@class=\"panel-collapse collapse\"]//div")
    private WebElement firstAnswerOfQuestion;

    @FindBy(xpath = "//div[@class=\"panel-group\"]//div[@class=\"panel\"][3]//a")
    private WebElement secondtQuestionButton;

    @FindBy(xpath = "//div[@class=\"panel-group\"]//div[@class=\"panel\"][3]//div[@class=\"panel-collapse collapse\"]//div")
    private WebElement secondtAnswerOfQuestion;

    @FindBy(xpath = "//div[@class=\"panel-group\"]//div[@class=\"panel\"][1]//a")
    private WebElement thirdQuestionButton;

    @FindBy(xpath = "//div[@class=\"panel-group\"]//div[@class=\"panel\"][1]//div[@class=\"panel-collapse collapse\"]//div")
    private WebElement thirdAnswerOfQuestion;


    @FindBy(xpath = "//div[@class=\"panel-group\"]//div[@class=\"panel\"][3]//a")
    private WebElement fourthdQuestionButton;

    @FindBy(xpath = "//div[@class=\"panel-group\"]//div[@class=\"panel\"][3]//div[@class=\"panel-collapse collapse\"]//div")
    private WebElement fourthdAnswerOfQuestion;

    @Step
    public void clickOnFAQItemOnFAQPage(){
        faqButton.click();
    }
    @Step
    public boolean presentsOfFAQPage(){
        return presentsOfFAQPage.isDisplayed();
    }
    @Step
    public void clickOnContactUsButton(){
        contactUsButton.click();
    }
    @Step
    public boolean presntsOfContactUsPage(){
        return presentsOfContactUsPAgeElement.isDisplayed();
    }
    @Step
    public void turnBackFromContactUsPage(){
        driver.navigate().back();
    }
    @Step
    public void clickOnPricingItemOnFAQPage(){
        pricingButton.click();
    }
    @Step
    public boolean presentOfPricingPage(){
        return pricingScreenPresents.isDisplayed();
    }
    @Step
    public void turnBackFromPricingToFAQ(){
        driver.navigate().back();
    }
    @Step
    public void clickOnFirstQuestion(){
        firstQuestionButton.click();
    }
    @Step
    public boolean presentsOfAnswerToFirstQuestion(){
        wait.until(ExpectedConditions.visibilityOf(presentsOfAnswer));
        return presentsOfAnswer.isDisplayed();
    }
    @Step
    public void clickOnSecondQuestion(){
        secondtQuestionButton.click();
    }
    @Step
    public boolean presentsOfAnswerToSecondQuestion(){
        wait.until(ExpectedConditions.visibilityOf(presentsOfAnswer));
        return presentsOfAnswer.isDisplayed();
    }
    @Step
    public void clickOnThirdQuestion(){
       thirdQuestionButton.click();
    }
    @Step
    public boolean presentsOfAnswerToThirdQuestion(){
        wait.until(ExpectedConditions.visibilityOf(presentsOfAnswer));
        return presentsOfAnswer.isDisplayed();
    }
    @Step
    public void clickOnFourthQuestion(){
        fourthdQuestionButton.click();
    }
    @Step
    public boolean presentsOfAnswerToFourthQuestion(){
        wait.until(ExpectedConditions.visibilityOf(presentsOfAnswer));
        return presentsOfAnswer.isDisplayed();
    }

}
