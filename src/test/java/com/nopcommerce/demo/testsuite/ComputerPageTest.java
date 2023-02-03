package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.page.Buildyourowncomputerpage;
import com.nopcommerce.demo.page.Computerpage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerPageTest extends TestBase {
    Computerpage computer = new Computerpage();
    Buildyourowncomputerpage Byoc = new Buildyourowncomputerpage();
    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        computer.clickOncomputerPageLink();
        String actualMessage = computer.getComputersText();
        String expectedMessage = "Computers";
        Assert.assertEquals(actualMessage,expectedMessage,"Computers verfied");
    }
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        computer.clickOncomputerPageLink();
        computer.clickOnDesktopLink();
        String actualMessage = computer.getDesktopText();
        String expectedMessage = "Desktops";
        Assert.assertEquals(actualMessage,expectedMessage,"Desktops verfied");
    }
    @Test
    public void verifyusershouldNavigateToNotebooksPageSuccessfully(){
        computer.clickOncomputerPageLink();
        computer.clickOnNotebookPageLink();
        String actualMessage = computer.getComputersText();
        String  expectedMessage = "Notebooks";
        Assert.assertEquals(actualMessage,expectedMessage,"Notebooks verified");
    }
    @Test
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(){
        computer.clickOncomputerPageLink();
        computer.clickOnDesktopLink();
        Byoc.clickOnByoc();
        Byoc.selectProcessor(1);
        Byoc.selectRam(4);
        Byoc.selectHdd();
        Byoc.selectOs();
        Byoc.selectSoftware();
        Byoc.clickOnAddCArt();
        String actualMessage = Byoc.verifyOrder();
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(actualMessage,expectedMessage,"order verfied");

    }
}