package com.art.idl.steps;

import com.art.idl.pageobject.PageObject;
import com.art.idl.singleton.EnvProperties;
import com.art.idl.singleton.SingletonDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;
import sun.print.PageableDoc;

import java.io.File;

/**
 * Created by M.Malyus on 11/10/2017.
 */
public class OriginalDriverLicensePage extends PageObject {
    private EnvProperties envProperties = new EnvProperties();
    private WebDriver driver = SingletonDriver.getInstance();
    private final Wait wait = new WebDriverWait(driver, 5, 1000);

    @FindBy(xpath = "//input[@id=\"license-number\"]")
    private WebElement presentsOfOriginalDriverLicenseStepPage;

    @FindBy(xpath = "//div[@class=\"progress-bar\"]")
    private WebElement progressBarLine;

    @FindBy(xpath = "//input[@id=\"license-number\"]")
    private WebElement licenseNumberField;

    @FindBy(xpath = "//div[@id=\"exp-month\"]")
    private WebElement expirationOpenButtonMonth;

    @FindBy(xpath = "//div[@id=\"exp-month\"]//ul//li[1]//a")
    private WebElement firstOfMonthExpiration;

    @FindBy(xpath = "//div[@id=\"exp-day\"]")
    private WebElement expirationOpenButtonDay;

    @FindBy(xpath = "//div[@id=\"exp-day\"]//ul//li[1]//a")
    private WebElement firsOfDayExpiration;

    @FindBy(xpath = "//div[@id=\"exp-year\"]")
    private WebElement expirationOpenButtonYear;

    @FindBy(xpath = "//div[@id=\"exp-year\"]//ul//li[1]//a")
    private WebElement firstOYearExpiration;

    @FindBy(xpath = "//div[@id=\"firt-issue-month\"]")
    private WebElement firstIssueOfMonthOpenButton;

    @FindBy(xpath = "//div[@id=\"firt-issue-month\"]//ul//li[1]//a")
    private WebElement firstOfMonthIssue;

    @FindBy(xpath = "//div[@id=\"firt-issue-day\"]")
    private WebElement firstIssuedOfDayOpenButton;

    @FindBy(xpath = "//div[@id=\"firt-issue-day\"]//ul//li[1]//a")
    private WebElement firsOfDayIssue;

    @FindBy(xpath = "//div[@id=\"firt-issue-year\"]")
    private WebElement firstIssueOfYearOpenButton;

    @FindBy(xpath = "//div[@id=\"firt-issue-year\"]//ul//li[1]//a")
    private WebElement firstOfYearIssue;

    @FindBy(xpath = "//input[@id=\"input-0\"]")
    private WebElement countryField;

    @FindBy(xpath = "//span[@class=\"highlight\"]")
    private WebElement countryAutoComplete;

    @FindBy(xpath = "//div[6]/label[2]/input")
    private WebElement uploadPhotoInput;

    @FindBy(xpath = "//div[5]/div/label[1]/label")
    private WebElement categoryAButton;

    @FindBy(xpath = "//div[5]/div/label[2]/label")
    private WebElement categoryBButton;

    @FindBy(xpath = "//div[5]/div/label[3]/label")
    private WebElement categoryCButton;

    @FindBy(xpath = "//div[5]/div/label[4]/label")
    private WebElement categoryDButton;

    @FindBy(xpath = "//div[5]/div/label[5]/label")
    private WebElement categoryEButton;

    @FindBy(xpath = "//button[@class=\"btn btn-get btn-back\"]")
    private WebElement backButton;

    @FindBy(xpath = "//button[@class=\"btn btn-get btn-continue btn-top\"]")
    private WebElement countinueButton;

    @FindBy(xpath = "//button[@class=\"btn btn-get btn-continue\"]")
    private WebElement countinueButtonForValid;

    @Step
    public boolean checkIfOriginalDriverLicenseIsPresent(){
        wait.until(ExpectedConditions.visibilityOf(presentsOfOriginalDriverLicenseStepPage));
        return presentsOfOriginalDriverLicenseStepPage.isDisplayed();
    }
    @Step
    public String checkProgressBarOfOriginalDriverLicensePage(){
        wait.until(ExpectedConditions.visibilityOf(licenseNumberField));
        return progressBarLine.getAttribute("style");
    }
    @Step
    public void writeLicenseNumber(String licenseNumber){
        wait.until(ExpectedConditions.visibilityOf(licenseNumberField));
        licenseNumberField.sendKeys(licenseNumber);
    }
    @Step
    public void chooseFirstMonthExpirationDate()   {
        expirationOpenButtonMonth.click();
        wait.until(ExpectedConditions.visibilityOf(firstOfMonthExpiration));
        firstOfMonthExpiration.click();
    }
    @Step
    public void chooseFirstDayExpirationDate(){
        expirationOpenButtonDay.click();
        wait.until(ExpectedConditions.visibilityOf(firsOfDayExpiration));
        firsOfDayExpiration.click();
    }
    @Step
    public void chooseFirstYearExpirationDate(){
     expirationOpenButtonYear.click();
     wait.until(ExpectedConditions.visibilityOf(firstOYearExpiration));
     firstOYearExpiration.click();
    }
    @Step
    public void chooseFirstIssueMonth(){
        firstIssueOfMonthOpenButton.click();
        wait.until(ExpectedConditions.visibilityOf(firstOfMonthIssue));
        firstOfMonthIssue.click();
    }
    @Step
    public void chooseFirstIssueDate(){
        firstIssuedOfDayOpenButton.click();
        wait.until(ExpectedConditions.visibilityOf(firsOfDayIssue));
        firsOfDayIssue.click();
    }
    @Step
    public void chooseFirstIssueYear(){
     firstIssueOfYearOpenButton.click();
     wait.until(ExpectedConditions.visibilityOf(firstIssueOfYearOpenButton));
     firstOfYearIssue.click();
    }
    @Step
    public void writeCountryOfDriverLicense(String countryOfDriverLicense) throws InterruptedException {
        countryField.sendKeys(countryOfDriverLicense);
        Actions actions = new Actions(driver);
        actions.moveToElement(countryAutoComplete).click().perform();
    }
    @Step
    public void uploadPhotoOfDriverLicense(){
      uploadPhotoInput.sendKeys((new File("./1.jpg").getAbsolutePath()));
    }

    @Step
    public void clickOnBackButton(){
        backButton.click();
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
    public void chooseACategory(){
        Actions actions = new Actions(driver);
        actions.moveToElement(categoryAButton).click().perform();
    }
    @Step
    public void disableACategory(){
        Actions actions = new Actions(driver);
        actions.moveToElement(categoryAButton).click().perform();
    }
    @Step
    public void chooseBCategory(){
        Actions actions = new Actions(driver);
        actions.moveToElement(categoryBButton).click().perform();
    }
    @Step
    public void disableBCategory(){
        Actions actions = new Actions(driver);
        actions.moveToElement(categoryBButton).click().perform();
    }
    @Step
    public void chooseCCategory(){
        Actions actions = new Actions(driver);
        actions.moveToElement(categoryCButton).click().perform();
    }
    @Step
    public void disableCCategory(){
        Actions actions = new Actions(driver);
        actions.moveToElement(categoryCButton).click().perform();
    }
    @Step
    public void chooseDCategory(){
        Actions actions = new Actions(driver);
        actions.moveToElement(categoryDButton).click().perform();
    }
    @Step
    public void disableDCategory(){
        Actions actions = new Actions(driver);
        actions.moveToElement(categoryDButton).click().perform();
    }
    @Step
    public void chooseECategory(){
        Actions actions = new Actions(driver);
        actions.moveToElement(categoryEButton).click().perform();
    }
    @Step
    public void disableECategory(){
        Actions actions = new Actions(driver);
        actions.moveToElement(categoryEButton).click().perform();
    }

}
