/**
 * 
 */
package com.THStest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.THSpages.BasicInformationPage;
import com.THSpages.DisconnectPage;
import com.THSpages.HomePage;
import com.THSpages.LoginPage;
import com.THSpages.PortalPage;

import excel_Utlis.TestUtil;
import junit.framework.Assert;

/**
 * @author vdaru
 *
 */
public class BasicInformationPageTest extends BaseTest {

    private static Logger log = Logger
	    .getLogger(BasicInformationPageTest.class.getName() + " ----------------------------------");
    // header
//    @Test(priority = 1,  description = "Testcase-1(BasicInformation page) = 'After landing on BasicInformationPage verify header ='RATING & POLICY MANAGEMENT' ")
//    public void verify_BasicinformationPage_header() throws InterruptedException {
//	page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
//	Thread.sleep(300);
//	page.getInstance(PortalPage.class).PLP_CLICK();
//	Thread.sleep(300);
//	page.getInstance(DisconnectPage.class).DisconnectSession_button();
//	Thread.sleep(1000);
//	String homepageheader = page.getInstance(HomePage.class).getHomePageHeader();
//	log.info(homepageheader);
//        Assert.assertEquals(homepageheader, "Address Validator");
//	Thread.sleep(1000);
//    }
    // verify lables displaying
    @Test(priority = 1, description = "Testcase-6(BasicInformationPage) = 'After landing on BasicInformationPage verify all labels are displayin as expected.")
    public void verify_BasicinformationPage_Labels() throws InterruptedException {

	page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	Thread.sleep(300);
	page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);
	page.getInstance(DisconnectPage.class).DisconnectSession_button();
	Thread.sleep(300);
	// homepage select state
	page.getInstance(HomePage.class).doSelectStateByDataprovided(RiskState);

	page.getInstance(BasicInformationPage.class).getBasicinformationpageLables();

    }

    @Test(priority = 2)
    public void verify_BasicinformationPage_ExelData() throws InterruptedException {
	page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	Thread.sleep(300);
	page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);
	page.getInstance(DisconnectPage.class).DisconnectSession_button();
	Thread.sleep(300);
	// homepage select state
	page.getInstance(HomePage.class).doSelectStateByDataprovided(RiskState);
	// basic information page
	Thread.sleep(500);
	page.getInstance(BasicInformationPage.class).doBasicinformationPagevalidation(FirstName, LastName, RiskAddress,
		RiskCity, RiskZipcode, DOB, Occupancy, FireHyderate, RiskState, YearBuilt, ReneovatedHome, PolicyForm);
	Thread.sleep(1000);
    }
//    dependsOnGroups = {"Use test Data : 'TowerHillTestData' "}
    @Test( priority = 3)
    public void verify_BasicinformationPage_DataProvider() throws InterruptedException {
	page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	Thread.sleep(300);
	page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);
	page.getInstance(DisconnectPage.class).DisconnectSession_button();
	Thread.sleep(300);
	// homepage select state
	page.getInstance(HomePage.class).doSelectStateByDataprovided(RiskState);
	// basic information page
	Thread.sleep(500);
	page.getInstance(BasicInformationPage.class).doBasicinformationPagevalidation(FirstName, LastName, RiskAddress,
		RiskCity, RiskZipcode, DOB, Occupancy, FireHyderate, RiskState, YearBuilt, ReneovatedHome, PolicyForm);
	Thread.sleep(1000);
    }
    
    @DataProvider
    public Object[][] getLoginData() throws EncryptedDocumentException, InvalidFormatException, IOException {
	Object data[][] = TestUtil.getTowerHillTestData("login");

	return data;
    }
  
}
