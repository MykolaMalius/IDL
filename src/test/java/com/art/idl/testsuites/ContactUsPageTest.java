package com.art.idl.testsuites;

import com.art.idl.pageobject.PageObject;
import com.art.idl.pages.ContactUsPage;
import com.art.idl.singleton.SingletonDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by M.Malyus on 11/8/2017.
 */
public class ContactUsPageTest extends PageObject {
    private WebDriver driver;
    private ContactUsPage contactUsPage;

  
    //Id
    //1.154-1.155
    @Test
    public void checkIfUserIsRedirectedToPricingFromContactUs(){
        contactUsPage = new ContactUsPage();
        contactUsPage.clickOnContactUsButtonOnContactUsPage();
        Assert.assertTrue(contactUsPage.checkIfContactUsPageIsPresent(), "User is not on ContactUsPage!");
        contactUsPage.clickOnPricingButton();
        Assert.assertTrue(contactUsPage.checkIfPricingScreenPresent(),"User is not redirected to PricingPage!");
        contactUsPage.returnToContactUsPage();
        Assert.assertTrue(contactUsPage.checkIfContactUsPageIsPresent(), "User is not turn back to ContactUsPage!");
        SingletonDriver.quit();
    }
    //Id
    //1.156
    @Test
    public void checkIfUserStayOnConatctUsScreenAfterClickingOnContactUs(){
        contactUsPage = new ContactUsPage();
        contactUsPage.clickOnContactUsButtonOnContactUsPage();
        Assert.assertTrue(contactUsPage.checkIfContactUsPageIsPresent(), "User is not on ContactUsPage!");
        contactUsPage.clickOnContactUsButtonOnContactUsPage();
        Assert.assertTrue(contactUsPage.checkIfContactUsPageIsPresent(), "User is not on the same page!");
        SingletonDriver.quit();
    }
    //Id
    //1.57-1.58
    @Test
    public void checkIfUserCanBeRedirectedToFAQFromContacusAndTurnBack(){
        contactUsPage = new ContactUsPage();
        contactUsPage.clickOnContactUsButtonOnContactUsPage();
        Assert.assertTrue(contactUsPage.checkIfContactUsPageIsPresent(), "User is not on ContactUsPage!");
        contactUsPage.clickOnFAQItemOnContactUsPage();
        Assert.assertTrue(contactUsPage.presentsOfFAQPage(), "User is not redirected to FAQPage!");
        contactUsPage.turnBackFromFAQToContactUs();
        Assert.assertTrue(contactUsPage.checkIfContactUsPageIsPresent(), "User is not turned back to ContactUsPage!");
        SingletonDriver.quit();
    }
}
