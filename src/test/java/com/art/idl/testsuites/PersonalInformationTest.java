package com.art.idl.testsuites;

import com.art.idl.businessobjects.PesronalInformationBO;
import com.art.idl.pages.PricingPage;
import com.art.idl.singleton.SingletonDriver;
import com.art.idl.steps.PersonalInformationPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by M.Malyus on 11/9/2017.
 */
public class PersonalInformationTest {
    private WebDriver driver;
    private PersonalInformationPage personalInformationPage;

    //Id
    //Test 1.187
    @Test
    public void checkProgressBarOfPErsonalInformationPage(){
        personalInformationPage = new PersonalInformationPage();
        personalInformationPage.clickOnPricingButtonOnPricingScreen();
        Assert.assertTrue(personalInformationPage.checkPresentsOfPricingScreen(),"User is not on PricingPage!");
        personalInformationPage.clickOnGetYourIDLButton1yearLicense();
        Assert.assertTrue(personalInformationPage.presentsOfPersonalInformationPage().contains("PERSONAL INFORMATION"), "User is not on PersonalInformationPage!");
        System.out.println("Width:" + personalInformationPage.checkProgressBarOfPersonalInformationPage());
        Assert.assertTrue(personalInformationPage.checkProgressBarOfPersonalInformationPage().contains("width: 20%;"));
    }
    //Id
    //Test 1.191
    @Test
    public void checkIfFirstNameFieldCanBeEmptyWhenOtherWithValidData()   {
        personalInformationPage = new PersonalInformationPage();
        PesronalInformationBO personalInformationBO = new PesronalInformationBO();
        personalInformationBO.goToPersonalInformationPage();
        personalInformationBO.writeInfoToAllFieldsOfPersonalInformationPage("","Mason","m@gmail.com","0631750358");
        personalInformationPage.clickOnCountinueButton();
        Assert.assertTrue(personalInformationPage.presentsOfPersonalInformationPage().contains("PERSONAL INFORMATION"), "System allows to leave epmty FirstName field!");
    }
    //Id
    //Test 1.200
    @Test
    public void checkIfFirstNameFieldCanBeFiillInWithDigits()   {
        personalInformationPage = new PersonalInformationPage();
        PesronalInformationBO personalInformationBO = new PesronalInformationBO();
        personalInformationBO.goToPersonalInformationPage();
        personalInformationBO.writeInfoToAllFieldsOfPersonalInformationPage("1234","Mason","m@gmail.com","0631750358");
        personalInformationPage.clickOnCountinueButton();
        Assert.assertTrue(personalInformationPage.presentsOfPersonalInformationPage().contains("PERSONAL INFORMATION"), "System allows to fill in firstName With digits!");
    }
    //Id
    //Test 1.207
    @Test
    public void checkIfLastNameFieldCantBeEmpty(){
        personalInformationPage = new PersonalInformationPage();
        PesronalInformationBO personalInformationBO = new PesronalInformationBO();
        personalInformationBO.goToPersonalInformationPage();
        personalInformationBO.writeInfoToAllFieldsOfPersonalInformationPage("Alex","","m@gmail.com","0631750358");
        personalInformationPage.clickOnCountinueButton();
        Assert.assertTrue(personalInformationPage.presentsOfPersonalInformationPage().contains("PERSONAL INFORMATION"), "System allows to leave epmty LastName field!");
    }
    //Id
    //Test 1.215
    @Test
    public void checkIfLastNameFieldCanBeFillInWithDigits(){
        personalInformationPage = new PersonalInformationPage();
        PesronalInformationBO personalInformationBO = new PesronalInformationBO();
        personalInformationBO.goToPersonalInformationPage();
        personalInformationBO.writeInfoToAllFieldsOfPersonalInformationPage("Alex","1234","m@gmail.com","0631750358");
        personalInformationPage.clickOnCountinueButton();
        Assert.assertTrue(personalInformationPage.presentsOfPersonalInformationPage().contains("PERSONAL INFORMATION"), "System allows to fill in firstName with digits!");
    }
    //Id
    //Test 1.218
    @Test
    public void checkIfLastNameFieldCantBeWithAFewSpaces(){
        personalInformationPage = new PersonalInformationPage();
        PesronalInformationBO personalInformationBO = new PesronalInformationBO();
        personalInformationBO.goToPersonalInformationPage();
        personalInformationBO.writeInfoToAllFieldsOfPersonalInformationPage("Alex","          ","m@gmail.com","0631750358");
        personalInformationPage.clickOnCountinueButton();
        Assert.assertTrue(personalInformationPage.presentsOfPersonalInformationPage().contains("PERSONAL INFORMATION"), "System allows to fill in firstName with a few spaces!");
    }
    //Id
    //Test 1.270
    @Test
    public void checkIfCmDropdownIsShwonAfterClickOnCmButton(){
        personalInformationPage = new PersonalInformationPage();
        PesronalInformationBO personalInformationBO = new PesronalInformationBO();
        personalInformationBO.goToPersonalInformationPage();
        personalInformationPage.selectHeight();
        Assert.assertTrue(personalInformationPage.presentsOfCmDropdown(), "Cm dropdown is not shown!");
    }
    //Id
    //Test 1.281
    @Test
    public void checkIfPhoneFieldCantBeEmptyWheAllValid(){
        personalInformationPage = new PersonalInformationPage();
        PesronalInformationBO personalInformationBO = new PesronalInformationBO();
        personalInformationBO.goToPersonalInformationPage();
        personalInformationBO.writeInfoToAllFieldsOfPersonalInformationPage("Alex","Mason","m@gmail.com","");
        personalInformationPage.clickOnCountinueButton();
        Assert.assertTrue(personalInformationPage.presentsOfPersonalInformationPage().contains("PERSONAL INFORMATION"), "System allows to leave epmty Phone field!");
    }
    //Id
    //Test 1.295
    @Test
    public void checkIfPhoneFieldCantBeWithSpaces(){
        personalInformationPage = new PersonalInformationPage();
        PesronalInformationBO personalInformationBO = new PesronalInformationBO();
        personalInformationBO.goToPersonalInformationPage();
        personalInformationBO.writeInfoToAllFieldsOfPersonalInformationPage("Alex","Mason","m@gmail.com","    ");
        personalInformationPage.clickOnCountinueButton();
        Assert.assertTrue(personalInformationPage.presentsOfPersonalInformationPage().contains("PERSONAL INFORMATION"), "System allows to fill in Phone field with spaces!");
    }
    //Id
    //Test 1.301
    @Test
    public void checkIEmailCantBeEmptyWhenAllValid(){
        personalInformationPage = new PersonalInformationPage();
        PesronalInformationBO personalInformationBO = new PesronalInformationBO();
        personalInformationBO.goToPersonalInformationPage();
        personalInformationBO.writeInfoToAllFieldsOfPersonalInformationPage("Alex","Mason","","0931026120");
        personalInformationPage.clickOnCountinueButton();
        Assert.assertTrue(personalInformationPage.presentsOfPersonalInformationPage().contains("PERSONAL INFORMATION"), "System allows to leave epmty Email field!");
    }
    //Id
    //Test 1.311
    @Test
    public void checkIfEmailCantBeWithaAFewSpaces(){
        personalInformationPage = new PersonalInformationPage();
        PesronalInformationBO personalInformationBO = new PesronalInformationBO();
        personalInformationBO.goToPersonalInformationPage();
        personalInformationBO.writeInfoToAllFieldsOfPersonalInformationPage("Alex","Mason","   ","0931026120");
        personalInformationPage.clickOnCountinueButton();
        Assert.assertTrue(personalInformationPage.presentsOfPersonalInformationPage().contains("PERSONAL INFORMATION"),"System allows to fill in with spaces Email field!");
    }
    //Id
    //Test 1.317-318
    @Test
    public void checkIfBackButtonRediretUserToHomePage(){
        personalInformationPage = new PersonalInformationPage();
        PesronalInformationBO pesronalInformationBO = new PesronalInformationBO();
        pesronalInformationBO.goToPersonalInformationPage();
        personalInformationPage.clickOnBackButton();
        Assert.assertTrue(personalInformationPage.checkIfHomeScreenIsPresent(),"Back button doesnt work correctly!");
    }
    //Id
    //Test 1.323
    @Test
    public void checkIfUserRedirectToNextStepCountinuButtonVailDataAll() throws InterruptedException {
        personalInformationPage = new PersonalInformationPage();
        PesronalInformationBO personalInformationBO = new PesronalInformationBO();
        personalInformationBO.goToPersonalInformationPage();
        personalInformationBO.writeInfoToAllFieldsOfPersonalInformationPage("Alex","Mason","a@gmail.com","0931026120");
        personalInformationPage.clickOnCountinueButtonWhenAllWithValid();
        Assert.assertTrue(personalInformationPage.checkIfOriginalDriverLicenseIsPresent(),"Countinu button doesnt work correctly!");
    }
    //Id
    //Test 1.324
    @Test
    public void checkIfUserCantRedirectToNextStepWhenSomeFieldEmpty(){
        personalInformationPage = new PersonalInformationPage();
        PesronalInformationBO personalInformationBO = new PesronalInformationBO();
        personalInformationBO.goToPersonalInformationPage();
        personalInformationBO.writeInfoToAllFieldsOfPersonalInformationPage("Alex","Mason","a@gmail.com","");
        personalInformationPage.clickOnCountinueButton();
        Assert.assertTrue(personalInformationPage.presentsOfPersonalInformationPage().contains("PERSONAL INFORMATION"),"System allows user to get to next step!");
    }

    @AfterMethod
    public void quit(){
        SingletonDriver.quit();
    }
}

