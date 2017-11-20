package com.art.idl.steps;

import com.art.idl.pageobject.PageObject;
import com.art.idl.singleton.EnvProperties;
import com.art.idl.singleton.SingletonDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by M.Malyus on 11/9/2017.
 */
public class PersonalInformationPage extends PageObject {
    private EnvProperties envProperties = new EnvProperties();
    private WebDriver driver = SingletonDriver.getInstance();
    private final Wait wait = new WebDriverWait(driver, 5, 1000);

    @FindBy(xpath = "//div[@class=\"nav-list\"]//ul[@class=\"nav navbar-nav navbar-right\"]//li[1]")
    private WebElement pricingButton;

    @FindBy(xpath = "//label[@for=\"radio02\"]")
    private WebElement femaleButton;

    @FindBy(xpath = "//div//div[@class=\"col-sm-6 col-md-6 col-lg-3 price-block\"][1]")
    private WebElement pricingScreenPresents;

    @FindBy(xpath = "//div//div[@class=\"row why\"][1]")
    private WebElement presentsOfHomePage;

    @FindBy(xpath = "//input[@id=\"license-number\"]")
    private WebElement presentsOfOriginalDriverLicenseStepPage;

    @FindBy(xpath = "//div[@class=\"col-sm-6 col-md-6 col-lg-3 price-block\"][1]//button")
    private WebElement getYourIDLButton1yearLicense;

    @FindBy(xpath = "//div[@class=\"progress-bar\"]")
    private WebElement progressBarLine;

    //getText() from the title of page
    @FindBy(xpath = "//h2[@class=\"step ng-scope\"]")
    private WebElement presentsOfPersonalInformationPage;

    @FindBy(xpath = "//input[@id=\"first-name\"]")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@id=\"last-name\"]")
    private WebElement lastNameInput;

    @FindBy(xpath = "//div[@id=\"birth-month\"]")
    private WebElement monthOpernButton;

    @FindBy(xpath = "//div[@id=\"birth-month\"]//ul//li[1]//a")
    private WebElement firstMonthInList;

    @FindBy(xpath = "//div[@id=\"birth-day\"]")
    private WebElement dayOpenButton;

    @FindBy(xpath = "//div[@id=\"birth-day\"]//ul//li[1]//a")
    private WebElement firstDayOfList;

    @FindBy(xpath = "//div[@id=\"birth-year\"]")
    private WebElement yearOpenButton;

    @FindBy(xpath = "//div[@id=\"birth-year\"]//ul//li[1]//a")
    private WebElement firstYearOfList;

    @FindBy(xpath = "//div[@id=\"eye-color\"]")
    private WebElement eyeOpenButton;

    @FindBy(xpath = "//div[@id=\"eye-color\"]//ul//li[1]//a")
    private WebElement firstEyeOfList;

    @FindBy(xpath = ".//*[@id='form-views']/div[2]/div[6]/div[3]/label[2]/label")
    private WebElement cmButton;

    @FindBy(xpath = "//div[@id=\"cm\"]")
    private WebElement cmOpenButton;

    @FindBy(xpath = "//div[@id=\"cm\"]//ul//li[1]//a")
    private WebElement firstCmOfList;

    @FindBy(xpath = "//input[@id=\"phone\"]")
    private WebElement phoneNumberField;

    @FindBy(xpath = "//input[@id=\"email\"]")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id=\"license-number\"]")
    private WebElement presentesOfNextStep;

    @FindBy(xpath = "//button[@class=\"btn btn-get btn-continue btn-top\"]")
    private WebElement countinueButton;

    @FindBy(xpath = "//button[@class=\"btn btn-get btn-continue\"]")
    private WebElement countinueButtonForValid;

    @FindBy(xpath = "//button[@class=\"btn btn-get btn-back\"]")
    private WebElement backButton;

    @Step
    public void clickOnPricingButtonOnPricingScreen(){
        pricingButton.click();
    }
    @Step
    public boolean checkPresentsOfPricingScreen(){
        return pricingScreenPresents.isDisplayed();
    }
    @Step
    public void clickOnGetYourIDLButton1yearLicense(){
        getYourIDLButton1yearLicense.click();
    }
    @Step
    public String presentsOfPersonalInformationPage(){
        return presentsOfPersonalInformationPage.getText();
    }
    @Step
    public String checkProgressBarOfPersonalInformationPage(){
      return progressBarLine.getAttribute("style");
    }
    @Step
    public void writeNameToFirstNameField(String firstName){
        firstNameInput.sendKeys(firstName);
    }
    @Step
    public void writeNameToLastNameField(String lastName){
        lastNameInput.sendKeys(lastName);
    }
    @Step
    public void selectFirstMonth()  {
        monthOpernButton.click();
        wait.until(ExpectedConditions.visibilityOf(firstMonthInList));
        firstMonthInList.click();
    }
    @Step
    public void selectFirstDay(){
        dayOpenButton.click();
        wait.until(ExpectedConditions.visibilityOf(firstDayOfList));
        firstDayOfList.click();
    }
    @Step
    public void selectFirstYear(){
      yearOpenButton.click();
      wait.until(ExpectedConditions.visibilityOf(firstYearOfList));
      firstYearOfList.click();
    }
    @Step
    public void selectFirstEyeColor(){
     eyeOpenButton.click();
     wait.until(ExpectedConditions.visibilityOf(firstEyeOfList));
     firstEyeOfList.click();
    }
    @Step
    public void selectHeight(){
     cmButton.click();
        wait.until(ExpectedConditions.visibilityOf(cmOpenButton));
        cmOpenButton.click();
        wait.until(ExpectedConditions.visibilityOf(firstCmOfList));
        firstCmOfList.click();
    }
    @Step
    public void writePhoneNumber(String phoneNumber){
        phoneNumberField.sendKeys(phoneNumber);
    }
    @Step
    public void writeEmail(String email){
        emailField.sendKeys(email);
    }
    @Step
    public boolean checkIfSystemDoesNotAllowToWriteDigitsInFirstNameField(){
        return presentesOfNextStep.isDisplayed();
    }
    @Step
    public void clickOnCountinueButton(){
        countinueButton.click();
    }
    @Step
    public void clickOnCountinueButtonWhenAllWithValid(){
     countinueButtonForValid.click();
    }

    @Step
    public void allow(){
        System.out.println("Displayed:" + cmButton.isDisplayed());
        System.out.println("Enabled:" + cmButton.isEnabled());
        System.out.println("Selected:" + cmButton.isSelected());
    }
    @Step
    public boolean presentsOfCmDropdown(){
        return cmOpenButton.isDisplayed();
    }
    @Step
    public void clickOnBackButton(){
        backButton.click();
    }
    @Step
    public boolean checkIfHomeScreenIsPresent(){
        return presentsOfHomePage.isDisplayed();
    }
    @Step
    public boolean checkIfOriginalDriverLicenseIsPresent(){
        wait.until(ExpectedConditions.visibilityOf(presentsOfOriginalDriverLicenseStepPage));
        return presentsOfOriginalDriverLicenseStepPage.isDisplayed();
    }
}
