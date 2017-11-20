package com.art.idl.businessobjects;

import com.art.idl.pageobject.PageObject;
import com.art.idl.steps.PersonalInformationPage;

/**
 * Created by M.Malyus on 11/9/2017.
 */
public class PesronalInformationBO extends PageObject {

    public void goToPersonalInformationPage(){
        PersonalInformationPage personalInformationPage = new PersonalInformationPage();
        personalInformationPage.clickOnPricingButtonOnPricingScreen();
        personalInformationPage.clickOnGetYourIDLButton1yearLicense();
    }
    public void writeInfoToAllFieldsOfPersonalInformationPage(String firstName,String lastName,String email,String phoneNumber){
        PersonalInformationPage personalInformationPage = new PersonalInformationPage();
        personalInformationPage.writeNameToFirstNameField(firstName);
        personalInformationPage.writeNameToLastNameField(lastName);
        personalInformationPage.selectFirstMonth();
        personalInformationPage.selectFirstDay();
        personalInformationPage.selectFirstYear();
        personalInformationPage.selectFirstEyeColor();
        personalInformationPage.selectHeight();
        personalInformationPage.writePhoneNumber(phoneNumber);
        personalInformationPage.writeEmail(email);
    }
}
