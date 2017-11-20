package com.art.idl.testsuites;

import com.art.idl.pages.FAQPage;
import com.art.idl.singleton.SingletonDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by M.Malyus on 11/8/2017.
 */
public class FAQPageTest {
    private WebDriver driver;
    private FAQPage faqPage;

    //Id
    //1.122-1.123
    @Test
    public void checkIfUserIsRedirectedToPricingFromFAQAndTurnBack(){
        faqPage = new FAQPage();
        faqPage.clickOnFAQItemOnFAQPage();
        Assert.assertTrue(faqPage.presentsOfFAQPage(),"User is not on FAQPage!");
        faqPage.clickOnPricingItemOnFAQPage();
        Assert.assertTrue(faqPage.presentOfPricingPage(),"User is not redirected to PricingPage!");
        faqPage.turnBackFromPricingToFAQ();
        Assert.assertTrue(faqPage.presentsOfFAQPage(), "User is not turn back to FAQPage!");
        SingletonDriver.quit();
    }

    //Id
    //1.124
    @Test
    public void checkIfUserStayOnFAQPageAfteClickingOnFAQItem(){
        faqPage = new FAQPage();
        faqPage.clickOnFAQItemOnFAQPage();
        Assert.assertTrue(faqPage.presentsOfFAQPage(),"User is not on FAQPage!");
        faqPage.clickOnFAQItemOnFAQPage();
        Assert.assertTrue(faqPage.presentsOfFAQPage(),"User does not stay on FAQPage!");
        SingletonDriver.quit();
    }

    //Id
    //1.125-1.126
    @Test
    public void checkIfUserRedirectedToContactUsFromFAQAndTurnBack(){
        faqPage = new FAQPage();
        faqPage.clickOnFAQItemOnFAQPage();
        Assert.assertTrue(faqPage.presentsOfFAQPage(),"User is not on FAQPage!");
        faqPage.clickOnContactUsButton();
        Assert.assertTrue(faqPage.presntsOfContactUsPage(),"User is not redirected to PricingPage!");
        faqPage.turnBackFromContactUsPage();
        Assert.assertTrue(faqPage.presentsOfFAQPage(),"User is not turn back to FAQPage!");
        SingletonDriver.quit();
    }
    //Id
    //1.147
    @Test
    public void checkIfQuestionsHaveAnAnswersAfterClicking() throws InterruptedException {
        faqPage = new FAQPage();
        faqPage.clickOnFAQItemOnFAQPage();
        Assert.assertTrue(faqPage.presentsOfFAQPage(),"User is not on FAQPage!");
        faqPage.clickOnFirstQuestion();
        Assert.assertTrue(faqPage.presentsOfAnswerToFirstQuestion(),"First answer is not present!");
        faqPage.clickOnSecondQuestion();
        Assert.assertTrue(faqPage.presentsOfAnswerToSecondQuestion(),"Second answer is not present!");
        faqPage.clickOnThirdQuestion();
        Assert.assertTrue(faqPage.presentsOfAnswerToThirdQuestion(),"Third answer is not present!");
        faqPage.clickOnFourthQuestion();
        Assert.assertTrue(faqPage.presentsOfAnswerToFourthQuestion(),"Fourth answer is not present!");
        SingletonDriver.quit();
    }
}
