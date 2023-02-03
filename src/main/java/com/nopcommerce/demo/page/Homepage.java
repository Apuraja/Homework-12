package com.nopcommerce.demo.page;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class Homepage extends Utility {
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By allMenu = By.xpath("//div[@class='header-menu']");
    By logo = By.xpath("//img[@alt='nopCommerce demo store']");
    By myAccountLink = By.className("ico-account");
    By logOutLink = By.xpath("//a[@class='ico-logout']");

    public void clickOnLoginLink() {
        Reporter.log("Clicking on login button " + loginLink.toString());
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        Reporter.log("Click on register link " + registerLink.toString());
        clickOnElement(registerLink);
    }

    public void clickOnMyAccountLink() {
        Reporter.log("click on MyAccount Link" + myAccountLink.toString());
        clickOnElement(myAccountLink);
    }

    public void clickOnLogoutLink() {
        Reporter.log("Click on LogOut link" + logOutLink.toString());
        clickOnElement(logOutLink);
    }

    public String allmenuText() {
        return getTextFromElement(allMenu);
    }
}


