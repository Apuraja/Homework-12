package com.nopcommerce.demo.page;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class Buildyourowncomputerpage extends Utility {
    By byocLink = By.xpath("//h2[@class='product-title']//a[text()='Build your own computer']");
    By Processor = By.xpath("//select[@id='product_attribute_1']");
    By Ram = By.xpath("//select[@id='product_attribute_2']");
    By hdd = By.xpath("//input[@id='product_attribute_3_7']");
    By os = By.xpath("//input[@id='product_attribute_4_9']");
    By Software = By.xpath("//input[@id='product_attribute_5_10']");
    By addCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By shoppingCart = By.xpath("//p[text()='The product has been added to your ']");


    public void clickOnByoc(){
        Reporter.log("Click on Build ur own " + byocLink.toString());
        clickOnElement(byocLink);
    }
    public void selectProcessor(int value){
        selectByValueFromDropDown(Processor, String.valueOf(value));
    }
    public void selectRam(int value){
        selectByValueFromDropDown(Ram, String.valueOf(value));
    }
    public void selectHdd(){
        Reporter.log("Clicking on Hdd " + hdd.toString());
        clickOnElement(hdd);
    }
    public void selectOs(){
        Reporter.log("Clicking on Os " + os.toString());
        clickOnElement(os);
    }
    public void selectSoftware(){
        Reporter.log("clicking on Software " + Software.toString());
        clickOnElement(Software);
    }
    public void clickOnAddCArt(){
        Reporter.log("Clocking on AddCart" + addCart.toString());
        clickOnElement(addCart);
    }
    public String verifyOrder(){
        return getTextFromElement(shoppingCart);
    }
}







