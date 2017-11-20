package com.art.idl.testsuites;

import com.art.idl.pages.IDLHomePage;
import com.art.idl.singleton.SingletonDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by M.Malyus on 11/7/2017.
 */
public class MainPageTest {
    private WebDriver driver;
    private IDLHomePage idlHomePage;
  
    //Id 1
    //Test 1.4-1.5
    @Test
    public void checkIfUserRedirectedToPricingScreenFromHomeAndReturnBack(){
        idlHomePage = new IDLHomePage();
        idlHomePage.clickOnPricingButton();
        Assert.assertTrue(idlHomePage.checkIfPricingScreenPresent(),"Does not redirected to PricingPage!");
        idlHomePage.returnToHomePage();
        Assert.assertTrue(idlHomePage.checkIfHomeScreenIsPresent(),"User id not coming back to HomePage!");
        SingletonDriver.quit();
    }
    //Id 2
    //Test 1.6-1.7
    @Test
    public void checkIfUserRedirectedToFAQScreenFromHomeAndReturnBack(){
      idlHomePage = new IDLHomePage();
      idlHomePage.clickOnFAQButton();
      Assert.assertTrue(idlHomePage.checkIfFAQPageIsPresent(),"Does not redirected to FAQPage");
      idlHomePage.returnToHomePage();
      Assert.assertTrue(idlHomePage.checkIfHomeScreenIsPresent(),"User id not coming back to HomePage!");
      SingletonDriver.quit();
    }
    //Id 3
    //Test 1.8-1.9
    @Test
    public void checkIfUserRedirectedToContactUsPageFromHomeAndReurnsBack(){
        idlHomePage = new IDLHomePage();
        idlHomePage.clickOnContactUsButton();
        Assert.assertTrue(idlHomePage.checkIfContactUsPageIsPresent(), "Does not redirected to ContactUs screen");
        idlHomePage.returnToHomePage();
        Assert.assertTrue(idlHomePage.checkIfHomeScreenIsPresent(), "User is not coming back to HomePage!");
        SingletonDriver.quit();
    }
    //Id 4
    //Test 1.11-1.12
    @Test
    public void checkIfUserRedirectedToPricingPageByGetOneRightNowTopMenu(){
        idlHomePage = new IDLHomePage();
        idlHomePage.clickOnGetOneRightNowButtonOfTopMenu();
        Assert.assertTrue(idlHomePage.checkIfPricingScreenPresent(), "Does not redirected to PricingPage!");
        SingletonDriver.quit();
    }
    //Id 5
    //Test 1.16-1.18
    @Test
    public void checkIfUserRedirectedToPricingPageByGetOneRightNowOfBanner(){
        idlHomePage = new IDLHomePage();
        idlHomePage.clickOnGetOneRIghtNowButtonOfBanner();
        Assert.assertTrue(idlHomePage.checkIfPricingScreenPresent(), "Does not redirected to PricingPage!");
        idlHomePage.returnToHomePage();
        Assert.assertTrue(idlHomePage.checkIfHomeScreenIsPresent(), "Does not redirected to HomePAge");
        SingletonDriver.quit();
    }
    //ID 6
    //Test 1.40-1.42
    @Test
    public void  checkIfUserRedirectedToPricingPageByGetOneRightNowNearBottom(){
        idlHomePage = new IDLHomePage();
        idlHomePage.clickOnGetOneRightNewButtonNearBottom();
        Assert.assertTrue(idlHomePage.checkIfPricingScreenPresent(), "Does not redirected to PricingPage!");
        idlHomePage.returnToHomePage();
        Assert.assertTrue(idlHomePage.checkIfHomeScreenIsPresent(), "Does not redirected to HomePAge");
        SingletonDriver.quit();
    }
}
