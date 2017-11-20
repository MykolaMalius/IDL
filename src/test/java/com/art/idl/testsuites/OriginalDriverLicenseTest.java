package com.art.idl.testsuites;

import com.art.idl.businessobjects.OriginalDriverLicenseBO;
import com.art.idl.singleton.SingletonDriver;
import com.art.idl.steps.OriginalDriverLicensePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Created by M.Malyus on 11/10/2017.
 */
public class OriginalDriverLicenseTest {
    private WebDriver driver;
    private OriginalDriverLicenseBO originalDriverLicenseBO;
    private OriginalDriverLicensePage originalDriverLicensePage;
    //Id
    //Test 1.332
    @Test
    public void checkProgressBarOfOriginalDriverLicense() throws InterruptedException {
        originalDriverLicenseBO = new OriginalDriverLicenseBO();
        originalDriverLicensePage = new OriginalDriverLicensePage();
        originalDriverLicenseBO.goToOriginalDriverLicensePage();
        System.out.println("Width:" + originalDriverLicensePage.checkProgressBarOfOriginalDriverLicensePage());
        Assert.assertTrue(originalDriverLicensePage.checkProgressBarOfOriginalDriverLicensePage().contains("width: 40%;"),"Smth with progress bar of OriginalDriverLicense!");
    }
    //Id
    //Test 1.337
    @Test
    public void checkIfLicenseNumberCantBeEmptyWhenAllValid() throws InterruptedException {
        originalDriverLicenseBO = new OriginalDriverLicenseBO();
        originalDriverLicensePage = new OriginalDriverLicensePage();
        originalDriverLicenseBO.goToOriginalDriverLicensePage();
        originalDriverLicenseBO.writeToFieldsOfOriginalDriverLicenseStep("","Ukraine");
        //Wait when update!
        //originalDriverLicensePage.clickOnCountinueButton();
        Assert.assertTrue(originalDriverLicensePage.checkIfOriginalDriverLicenseIsPresent(),"System allow to leave empty LicenseNumber field!");
    }
    //Id
    //Test 1.350
    @Test
    public void checkIfLicenseNumberCanBeWithSpaceOnlyAllValid() throws InterruptedException {
        originalDriverLicenseBO = new OriginalDriverLicenseBO();
        originalDriverLicensePage = new OriginalDriverLicensePage();
        originalDriverLicenseBO.goToOriginalDriverLicensePage();
        originalDriverLicenseBO.writeToFieldsOfOriginalDriverLicenseStep("   ","Ukraine");
        //Wait when update!
        //originalDriverLicensePage.clickOnCountinueButton();
        Assert.assertTrue(originalDriverLicensePage.checkIfOriginalDriverLicenseIsPresent(),"System allow to paste spaces in LicenseNumber field!");

    }
    //Id
    //Test 1.433-1.435
    @Test
    public void checkACategoryButtonForValid(){
        originalDriverLicenseBO = new OriginalDriverLicenseBO();
        originalDriverLicensePage = new OriginalDriverLicensePage();
        originalDriverLicenseBO = new OriginalDriverLicenseBO();
        originalDriverLicensePage = new OriginalDriverLicensePage();
        originalDriverLicenseBO.goToOriginalDriverLicensePage();
        originalDriverLicensePage.chooseACategory();
        originalDriverLicensePage.disableACategory();
    }
    //Id
    //Test 1.436-1.438
    @Test
    public void checkBCategoryButtonForValid(){
        originalDriverLicenseBO = new OriginalDriverLicenseBO();
        originalDriverLicensePage = new OriginalDriverLicensePage();
        originalDriverLicenseBO = new OriginalDriverLicenseBO();
        originalDriverLicensePage = new OriginalDriverLicensePage();
        originalDriverLicenseBO.goToOriginalDriverLicensePage();
        //She is active for default!
        originalDriverLicensePage.disableBCategory();
        originalDriverLicensePage.chooseBCategory();
    }
    //Id
    //Test 1.439-1.441
    @Test
    public void checkCCategoryButtonForValid(){
        originalDriverLicenseBO = new OriginalDriverLicenseBO();
        originalDriverLicensePage = new OriginalDriverLicensePage();
        originalDriverLicenseBO = new OriginalDriverLicenseBO();
        originalDriverLicensePage = new OriginalDriverLicensePage();
        originalDriverLicenseBO.goToOriginalDriverLicensePage();
        originalDriverLicensePage.chooseCCategory();
        originalDriverLicensePage.disableCCategory();
    }
    //Id
    //Test 1.442-1.444
    @Test
    public void checkDCategoryButtonForValid(){
        originalDriverLicenseBO = new OriginalDriverLicenseBO();
        originalDriverLicensePage = new OriginalDriverLicensePage();
        originalDriverLicenseBO = new OriginalDriverLicenseBO();
        originalDriverLicensePage = new OriginalDriverLicensePage();
        originalDriverLicenseBO.goToOriginalDriverLicensePage();
        originalDriverLicensePage.chooseDCategory();
        originalDriverLicensePage.disableDCategory();
    }
    //Id
    //Test 1.445-1.447
    @Test
    public void checkECategoryButtonForValid(){
        originalDriverLicenseBO = new OriginalDriverLicenseBO();
        originalDriverLicensePage = new OriginalDriverLicensePage();
        originalDriverLicenseBO = new OriginalDriverLicenseBO();
        originalDriverLicensePage = new OriginalDriverLicensePage();
        originalDriverLicenseBO.goToOriginalDriverLicensePage();
        originalDriverLicensePage.chooseECategory();
        originalDriverLicensePage.disableECategory();
    }
    //Id
    //Test 1.448
    @Test
    public void checkIfSystemAllowsToActivateAllCategoriesButtons(){
        originalDriverLicenseBO = new OriginalDriverLicenseBO();
        originalDriverLicensePage = new OriginalDriverLicensePage();
        originalDriverLicenseBO = new OriginalDriverLicenseBO();
        originalDriverLicensePage = new OriginalDriverLicensePage();
        originalDriverLicenseBO.goToOriginalDriverLicensePage();
        originalDriverLicenseBO.activateAllDriverLicenseCategoriesButtons();
    }

    @AfterMethod
    public void quit(){
        SingletonDriver.quit();
    }
}
