/**
 * 
 */
package com.THStest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.THSpages.LoginPage;
import com.THSpages.PortalPage;

import excel_Utlis.TestUtil;
import junit.framework.Assert;

/**
 * @author vdaru
 *
 */
public class LoginTest extends BaseTest {

    private static Logger log = Logger.getLogger(LoginTest.class.getName() + " ----------------------------------");

    @Test(priority = 1, description = "Testcase-1(loginPageTest) = 'verifing if TowerHill image is displaying on Login page' ")
    public void verifytowerhillimagedisplayingonLoginPage() {
	page.getInstance(LoginPage.class).dotesttowerhillimage();
    }

    @Test(priority = 2, description = "Testcase-2(loginPageTest) = 'verifing loginpage title : 'Tower Hill Insurance Group - Login' ")
    public void verifyloginpageTitle() {

	String LoginInPageTitle = page.getInstance(LoginPage.class).getPageTitile();
	log.info(LoginInPageTitle);
	AssertJUnit.assertEquals(LoginInPageTitle, "Tower Hill Insurance Group - Login");
    }

    @Test(priority = 3, description = "Testcase-3(loginPageTest) = 'verifing loginpage header value displaying: 'Login' ")
    public void verifyLoginPageheaderTest() {
	String LoginInPageheader = page.getInstance(LoginPage.class).getLogininPageheader();
	log.info(LoginInPageheader);
	AssertJUnit.assertEquals(LoginInPageheader, "Login");
    }

    @Test(priority = 3, description = "Testcase-4(loginPageTest) = 'using valid login details verifing if user can loginto RPM successfully ' ")
    public void performLoginTest_validvalues() throws InterruptedException {
	/*
	 * perform login test with valid cred GroupID
	 */
	PortalPage portalpage = page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	String portalPageHeader = portalpage.getPortalPageHeader();
	log.info(portalPageHeader);
	AssertJUnit.assertEquals(portalPageHeader, "WELCOME TO TOWER HILL'S AGENT PORTAL");
	log.info("Successfully logged into RPM");
    }

    @Test(priority = 4, dataProvider = "getLoginData", description = "Regression testing loginpage with multiple login credentials")
    public void performlogin(String gropuId, String userName, String password) throws InterruptedException {

	try {
	    LoginPage lp = new LoginPage(driver);
	    lp.getGroupID().sendKeys(gropuId);
	    Thread.sleep(300);
	    lp.getUserName().sendKeys(userName);
	    Thread.sleep(300);
	    lp.getPassword().sendKeys(password);
	    Thread.sleep(300);
	    lp.getSubmitButton().click();
	    Thread.sleep(500);
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

// data provider for login Page
    @DataProvider
    public Object[][] getLoginData() throws EncryptedDocumentException, InvalidFormatException, IOException {
	Object data[][] = TestUtil.getTowerHillTestData("login");

	return data;
    }

}
