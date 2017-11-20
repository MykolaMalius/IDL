package com.art.idl.testsuites;

import com.art.idl.pages.PricingPage;
import com.art.idl.singleton.SingletonDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by M.Malyus on 11/7/2017.
 */
public class PricingPageTest {
    private WebDriver driver;
    private PricingPage pricingPage;

    
    //ID 7
    //Test 1.69
    @Test
    public void checkIfUserStaysOnTheSamePage() throws InterruptedException {
      pricingPage = new PricingPage();
      pricingPage.clickOnPricingButtonOnPricingScreen();
      Assert.assertTrue(pricingPage.checkPresentsOfPricingScreen(), "User is not on PricingPage!");
      pricingPage.clickOnPricingButtonOnPricingScreen();
      Assert.assertTrue(pricingPage.checkPresentsOfPricingScreen(),"User does not stays on PricingPage!");
      SingletonDriver.quit();
    }
    //Id 8
    //Test 1.70-1.71
    @Test
    public void checkIfUserCanRedirectToFAQScreenFromPricingAndTurnBack(){
     pricingPage = new PricingPage();
     pricingPage.clickOnPricingButtonOnPricingScreen();
     Assert.assertTrue(pricingPage.checkPresentsOfPricingScreen(), "User is not on PricingPage!");
     pricingPage.clickOnFAQButtonOfPricingScreen();
     Assert.assertTrue(pricingPage.checkPresentsOfFAQScreen(), "User is not redirected to FAQ screen");
     pricingPage.returnToPricingScreenFromFAQ();
     Assert.assertTrue(pricingPage.checkPresentsOfPricingScreen(), "User is not returned to the PricingPage!");
     SingletonDriver.quit();
    }
    //Id 9
    //Test 1.72-1.73
    @Test
    public void checkIfUserCanRedirectToContactUsPageFromPricingAndTurnBack(){
        pricingPage = new PricingPage();
        pricingPage.clickOnPricingButtonOnPricingScreen();
        Assert.assertTrue(pricingPage.checkPresentsOfPricingScreen(), "User is not on PricingPage!");
        pricingPage.clickOnContactUsOfFAQPage();
        Assert.assertTrue(pricingPage.checkPresentsOfContacUsPage());
        pricingPage.returnToPricingScreenFromContactUs();
        Assert.assertTrue(pricingPage.checkPresentsOfPricingScreen());
        SingletonDriver.quit();
    }
    //Id 10
    //Test 1.82-1.83
    @Test
    public void checkIfGetYourIDLButtonOfFirstItemRedirectsToPersonalInformation(){
        pricingPage = new PricingPage();
        pricingPage.clickOnPricingButtonOnPricingScreen();
        Assert.assertTrue(pricingPage.checkPresentsOfPricingScreen(), "User is not on PricingPage!");
        pricingPage.clickOnGetYourIDLOfFirstItem();
        Assert.assertTrue(pricingPage.presentsOfPersonalInformationPage().contains("PERSONAL INFORMATION"), "User is not on PersonalInformationPage!");
        pricingPage.turnBackFromPersonalInformationPage();
        Assert.assertTrue(pricingPage.checkPresentsOfPricingScreen(),"User is not on turn back to PricingPage!");
        SingletonDriver.quit();
    }
    //Id 11
    //Test 1.87-1.88
    @Test
    public void checkIfGetYourIDLButtonOfSecondItemRedirectsToPersonalInformation(){
        pricingPage = new PricingPage();
        pricingPage.clickOnPricingButtonOnPricingScreen();
        Assert.assertTrue(pricingPage.checkPresentsOfPricingScreen(), "User is not on PricingPage!");
        pricingPage.clickOnGetYourIDLOfSecondItem();
        Assert.assertTrue(pricingPage.presentsOfPersonalInformationPage().contains("PERSONAL INFORMATION"), "User is not on PersonalInformationPage!");
        pricingPage.turnBackFromPersonalInformationPage();
        Assert.assertTrue(pricingPage.checkPresentsOfPricingScreen(),"User is not on turn back to PricingPage!");
        SingletonDriver.quit();
    }
    //Id 12
    //Test 1.92-1.93
    @Test
    public void checkIfGetYourIDLButtonOfThirdItemRedirectsToPersonalInformation(){
        pricingPage = new PricingPage();
        pricingPage.clickOnPricingButtonOnPricingScreen();
        Assert.assertTrue(pricingPage.checkPresentsOfPricingScreen(), "User is not on PricingPage!");
        pricingPage.clickOnGetYourIDLOfThirdButton();
        Assert.assertTrue(pricingPage.presentsOfPersonalInformationPage().contains("PERSONAL INFORMATION"), "User is not on PersonalInformationPage!");
        pricingPage.turnBackFromPersonalInformationPage();
        Assert.assertTrue(pricingPage.checkPresentsOfPricingScreen(),"User is not on turn back to PricingPage!");
        SingletonDriver.quit();
    }
    //Id 13
    //Test 1.97-1.98
    @Test
    public void checkIfGetYourIDLButtonOfFourthItemRedirectsToPersonalInformation(){
        pricingPage = new PricingPage();
        pricingPage.clickOnPricingButtonOnPricingScreen();
        Assert.assertTrue(pricingPage.checkPresentsOfPricingScreen(), "User is not on PricingPage!");
        pricingPage.clickOnGetYourIDLOfFourthButton();
        Assert.assertTrue(pricingPage.presentsOfPersonalInformationPage().contains("PERSONAL INFORMATION"), "User is not on PersonalInformationPage!");
        pricingPage.turnBackFromPersonalInformationPage();
        Assert.assertTrue(pricingPage.checkPresentsOfPricingScreen(),"User is not on turn back to PricingPage!");
        SingletonDriver.quit();
    }

}
