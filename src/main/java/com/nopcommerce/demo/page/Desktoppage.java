package com.nopcommerce.demo.page;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class Desktoppage extends Utility {
    By desktopsText = By.xpath("//h1[text()='Desktops']");
    By sortText = By.xpath("//div[@class='product-sorting']");
    By displayView = By.xpath("//div[@class='product-page-size']");
    By selectDisplay = By.xpath("//select[@id='products-pagesize']");
    By selectItems = By.xpath("//div[@class='item-grid']");

    public void clickOnDesktopsButton(){
        Reporter.log("Clicking on Desktop button " + desktopsText.toString());
        clickOnElement(desktopsText);
    }
    public void clickOnSortButton(){
        Reporter.log("Clicking on sort button " + sortText.toString());
        clickOnElement(sortText);
    }
    public void clickOnDisplay(){
        Reporter.log("Clicking on Display  " + displayView.toString());
        clickOnElement(displayView);
    }
    public void clickOnSelectDisplay(){
        Reporter.log("Clicking on select display" + selectDisplay.toString());
        clickOnElement(selectDisplay);
    }
    public void clickOnItem(){
        Reporter.log("Clicking on Items " + selectItems.toString());
        clickOnElement(selectItems);
    }}
