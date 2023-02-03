package com.nopcommerce.demo.page;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class Registerpage extends Utility {

    By registerLink = By.xpath("//a[@class='ico-register']");
    By registerText = By.xpath("//h1[text()='Register']");
    By registerButton = By.xpath("//button[@id='register-button']");
    By firstNameError = By.xpath("//span[@id='FirstName-error']");
    By lastNameError = By.xpath("//span[@id='LastName-error']");
    By emailError = By.xpath("//span[@id='Email-error']");
    By passwordError = By.xpath("//span[@id='Password-error']");
    By confirmPasswordError = By.xpath("//span[@id='ConfirmPassword-error']");
    By gender = By.xpath("//div[@class='master-wrapper-page']/div[3]/div[1]/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[1]/div/span[2]/input");//practice
    By firstNameField = By.xpath("//input[@id='FirstName']");
    By lastNameField = By.xpath("//input[@id='LastName']");
    By day = By.xpath("//select[@name='DateOfBirthDay']");
    By month = By.xpath("//select[@name='DateOfBirthMonth']");
    By year = By.xpath("//select[@name='DateOfBirthYear']");
    By emailfield  = By.xpath("//input[@id='Email']");
    By passwordfield = By.xpath("//input[@id='Password']");
    By confirmPasswordfield = By.xpath("//input[@id='ConfirmPassword']");
    By registerCompleted = By.xpath("//div[text()='Your registration completed']");


    public void clickOnregisterLink(){
        Reporter.log("Clicking on login button " + registerLink.toString());
        clickOnElement(registerLink);
    }
    public String verifyRegisterText (){
        return getTextFromElement(registerText);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String verifyfirstNameError(){
        return getTextFromElement(firstNameError);
    }
    public String verifyLastNameError(){
        return getTextFromElement(lastNameError);
    }
    public String verifyemailErrorr(){
        return getTextFromElement(emailError);
    }
    public String verifyPasswordErrorr(){
        return getTextFromElement(passwordError);
    }
    public String verifyConfirmPasswordErrorr(){
        return getTextFromElement(confirmPasswordError);
    }
    public void clicckOnGenderCheckbox(){
        clickOnElement(gender);
    }
    public void enterFirstname (String firstname){
        sendTextToElement(firstNameField,firstname);
    }
    public void enterLastname (String lastname){
        sendTextToElement(lastNameField,lastname);
    }
    public void selectDay(int value){
        selectByValueFromDropDown(day,value);
    }
    public void selectMonth(int value){
        selectByValueFromDropDown(month,value);
    }
    public void selectYear(int value){
        selectByValueFromDropDown(year,value);
    }
    public void enterEmail(String email){
        sendTextToElement(emailfield, email);
    }
    public void enterPassword(String pass){
        sendTextToElement(passwordfield, pass);
    }
    public void enterConfirmPassword(String confpass){
        sendTextToElement(confirmPasswordfield, confpass);
    }
    public String verifyRegisterCompleted (){
        return getTextFromElement(registerCompleted);
    }}



