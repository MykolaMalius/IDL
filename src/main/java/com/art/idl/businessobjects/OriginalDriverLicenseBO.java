package com.art.idl.businessobjects;

import com.art.idl.pageobject.PageObject;
import com.art.idl.steps.OriginalDriverLicensePage;
import com.art.idl.steps.PersonalInformationPage;
import org.testng.Assert;

/**
 * Created by M.Malyus on 11/10/2017.
 */
public class OriginalDriverLicenseBO extends PageObject {
    public void goToOriginalDriverLicensePage(){
        PesronalInformationBO pesronalInformationBO = new PesronalInformationBO();
        PersonalInformationPage personalInformationPage = new PersonalInformationPage();
        pesronalInformationBO.goToPersonalInformationPage();
        pesronalInformationBO.writeInfoToAllFieldsOfPersonalInformationPage("Alex","Mason","a@gmail.com","0931308310");
        personalInformationPage.clickOnCountinueButtonWhenAllWithValid();
    }

    public void writeToFieldsOfOriginalDriverLicenseStep(String licenseNumber,String countryOfDriverLicense) throws InterruptedException {
        OriginalDriverLicensePage originalDriverLicensePage = new OriginalDriverLicensePage();
        Assert.assertTrue(originalDriverLicensePage.checkIfOriginalDriverLicenseIsPresent(), "User is not on OriginalDriverLicensePage!");
        originalDriverLicensePage.writeLicenseNumber(licenseNumber);
        originalDriverLicensePage.chooseFirstMonthExpirationDate();
        originalDriverLicensePage.chooseFirstDayExpirationDate();
        originalDriverLicensePage.chooseFirstYearExpirationDate();
        originalDriverLicensePage.chooseFirstIssueMonth();
        originalDriverLicensePage.chooseFirstIssueDate();
        originalDriverLicensePage.chooseFirstIssueYear();
        originalDriverLicensePage.writeCountryOfDriverLicense(countryOfDriverLicense);
        originalDriverLicensePage.uploadPhotoOfDriverLicense();
    }
    public void activateAllDriverLicenseCategoriesButtons(){
        OriginalDriverLicensePage originalDriverLicensePage = new OriginalDriverLicensePage();
        originalDriverLicensePage.chooseACategory();
        originalDriverLicensePage.chooseCCategory();
        originalDriverLicensePage.chooseDCategory();
        originalDriverLicensePage.chooseECategory();
    }
}
