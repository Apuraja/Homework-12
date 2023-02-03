package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.page.Homepage;
import com.nopcommerce.demo.page.Loginpage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    Homepage homepage = new Homepage();
    Loginpage loginPage=new Loginpage();
   @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homepage.clickOnLoginLink();
        String actualMessage = loginPage.getWelcomeText();
        String expedctedMessage = "Welcome, Please Sign In!";
        Assert.assertEquals(actualMessage, expedctedMessage, "Login page verified");
    }
    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("ankit5@gmail.com");
        loginPage.enterPassword("1234567");
        loginPage.clickOnLoginButton();
        String actual=loginPage.getErrorMessage();
        String expected= "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actual,expected,"error message with inavalid credentials");
    }
    @Test
    public void verifyLoginSuccessFullyWithValidCredentials() {
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("ankit5@gmail.com");
        loginPage.enterPassword("1234567");}}
//        loginPage.clickOnLoginButton();
//        String actual = loginPage.getlogOut();
//        String expected = "Log out";
//        Assert.assertEquals(actual, expected, "Log out");
//    }
//@Test
//public void verifyUserLogoutSuccessFully() {
//    homepage.clickOnLoginLink();
//    loginPage.enterEmailId("Apupatel1985@yahooo.co.uk");
//    loginPage.enterPassword("Admin1234");
//    loginPage.clickOnLoginButton();
//  //  loginPage.getlogOut();
//  //  String actual = loginPage.getlogOut();
////    String expected = "Log out";
//  //  Assert.assertEquals(actual, expected, "Log out");
//}}}

