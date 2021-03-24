/**
 * 
 */
package com.THStest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.THSpages.LoginPage;
import com.THSpages.PortalPage;

/**
 * @author vdaru
 *
 */
public class LoginTest extends BaseTest {

    private static Logger log = Logger.getLogger(LoginTest.class.getName() + " ----------------------------------");

    @Test(priority = 1)
    public void verifyloginpageTitle() {

	String LoginInPageTitle = page.getInstance(LoginPage.class).getPageTitile();
	log.info(LoginInPageTitle);
	AssertJUnit.assertEquals(LoginInPageTitle, "Tower Hill Insurance Group - Login");
    } // *[@id="towerRound"]

    @Test(priority = 2)
    public void verifyLoginPageheaderTest() {
	String LoginInPageheader = page.getInstance(LoginPage.class).getLogininPageheader();
	log.info(LoginInPageheader);

    }

    @Test(priority = 3)
    public void performLoginTest_validvalues() throws InterruptedException {
	/*
	 * perform login test with valid cred GroupID
	 */
	PortalPage portalpage = page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	log.info("Testing if agent is able to login in with valid creditionals ");
	try {
	    Thread.sleep(2000);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	String portalPageHeader = portalpage.getPortalPageHeader();
	log.info(portalPageHeader);
	// WELCOME TO TOWER HILL'S AGENT PORTAL
	AssertJUnit.assertEquals(portalPageHeader, "WELCOME TO TOWER HILL'S AGENT PORTAL");
    }

    @Test(priority = 4)
    public void performLoginTest_invalidvalues() throws InterruptedException {
	/*
	 * perform login test with in-valid password
	 */
	page.getInstance(LoginPage.class).doLogin_InvalidCred(GroupID, UseName, "invalid password");
	log.info("Testing if agent is able to login with invalid password");
	try {
	    Thread.sleep(2000);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

    @Test(priority = 1)
    public void verifytowerhillimagedisplayingonLoginPage() {

	page.getInstance(LoginPage.class).dotesttowerhillimage();
    }

}
