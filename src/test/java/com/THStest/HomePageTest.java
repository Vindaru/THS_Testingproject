/**
 * 
 */
package com.THStest;

import java.io.UnsupportedEncodingException;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.THSpages.BasicInformationPage;
import com.THSpages.DisconnectPage;
import com.THSpages.HomePage;
import com.THSpages.LoginPage;
import com.THSpages.PortalPage;

/**
 * @author vdaru
 *
 */
public class HomePageTest extends BaseTest {
    private static Logger log = Logger.getLogger(HomePageTest.class.getName() + " ----------------------------------");

    @Test(priority = 1)
    public void verify_HomePage_Title() throws InterruptedException {

	page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	Thread.sleep(300);
	HomePage portalpage = page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);
	page.getInstance(DisconnectPage.class).DisconnectSession_button();
	Thread.sleep(300);
	// HomePage
	String HomePageTitle = page.getInstance(HomePage.class).getHomePageTitle();
	log.info(HomePageTitle);
	Assert.assertEquals(HomePageTitle, "RPM – Tower Hill Insurance – Tower Hill Insurance");

    }

    @Test(priority = 2)
    public void verify_HomePage_headerTest() throws InterruptedException {
	page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	Thread.sleep(300);
	HomePage portalpage = page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);
	page.getInstance(DisconnectPage.class).DisconnectSession_button();
	Thread.sleep(300);
	// HomePage header
	String HomePageheader = page.getInstance(HomePage.class).getHomePageHeader();
	log.info(HomePageheader);

    }

    @Test(priority = 3)
    public void verify_HomePage_Userdetails() throws InterruptedException {
	page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	Thread.sleep(300);
	HomePage portalpage = page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);
	page.getInstance(DisconnectPage.class).DisconnectSession_button();
	Thread.sleep(300);
	// homepage
	String HomePageagentdetails = page.getInstance(HomePage.class).getAgentInfo().getText();
	log.info(HomePageagentdetails);

    }

    @Test(priority = 4)
    public void verify_HomePage_Menutabs() throws InterruptedException {
	page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	Thread.sleep(300);
	HomePage portalpage = page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);
	page.getInstance(DisconnectPage.class).DisconnectSession_button();
	Thread.sleep(300);
	// homepage
	// verify menu tabs consists of HOME, PORTAL, POLICY MANAGMENT, ADMIN, HELP //
	// PORTAL QUOTES POLICY MANAGEMENT ADMIN HELP

	String HomePage_Menu_HOME = page.getInstance(HomePage.class).getHome_text().getText();
	log.info(HomePage_Menu_HOME);
	Assert.assertEquals(HomePage_Menu_HOME, "HOME");

	String HomePage_Menu_PORTAL = page.getInstance(HomePage.class).getPortal_text().getText();
	log.info(HomePage_Menu_PORTAL);
	Assert.assertEquals(HomePage_Menu_PORTAL, "PORTAL");

	String HomePage_Menu_QUOTES = page.getInstance(HomePage.class).getQuotes_text().getText();
	log.info(HomePage_Menu_QUOTES);
	Assert.assertEquals(HomePage_Menu_QUOTES, "QUOTES");

	String HomePage_Menu_POLICYMANAGEMENT = page.getInstance(HomePage.class).getPolicyManagment_text().getText();
	log.info(HomePage_Menu_POLICYMANAGEMENT);
	Assert.assertEquals(HomePage_Menu_POLICYMANAGEMENT, "POLICY MANAGEMENT");

	String HomePage_Menu_ADMIN = page.getInstance(HomePage.class).getAdmin_text().getText();
	log.info(HomePage_Menu_ADMIN);
	Assert.assertEquals(HomePage_Menu_ADMIN, "ADMIN");

	String HomePage_Menu_HELP = page.getInstance(HomePage.class).getHelp_text().getText();
	log.info(HomePage_Menu_HELP);
	Assert.assertEquals(HomePage_Menu_HELP, "HELP");

    }

    // Agency Override
    @Test(priority = 5)
    public void verify_HomePage_AgencyOverideTest() throws InterruptedException {

	page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	Thread.sleep(300);
	HomePage portalpage = page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);
	page.getInstance(DisconnectPage.class).DisconnectSession_button();
	Thread.sleep(300);
	// homepage
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)");
	// test Agency Override label displaying
	String AgencyOverride_text = page.getInstance(HomePage.class).getAgencyOverridelable().getText();
	log.info(AgencyOverride_text);
	Assert.assertEquals(AgencyOverride_text, "Agency Override");
	// test Agency Override label displaying
	Thread.sleep(300);
	page.getInstance(HomePage.class).doAgencyOverirde(AgencyOveride);
	Thread.sleep(500);
    }

    // Quote section verify if all THS applicable states are visible
    @Test(priority = 6)
    public void verify_HomePage_THS_States_Displaying() throws InterruptedException, UnsupportedEncodingException {

	page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	Thread.sleep(300);
	HomePage portalpage = page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);
	page.getInstance(DisconnectPage.class).DisconnectSession_button();
	Thread.sleep(300);
	// homepage
	// test Agency Override label displaying
	Thread.sleep(300);
	page.getInstance(HomePage.class).doverify_THS_Statesapplicability();
	Thread.sleep(500);
    }

    @Test(priority = 7)
    public void Select_THS_State_ExelData() throws InterruptedException {

	page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	Thread.sleep(300);
	HomePage portalpage = page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);
	page.getInstance(DisconnectPage.class).DisconnectSession_button();
	Thread.sleep(300);
	// homepage
	// test Agency Override label displaying
	Thread.sleep(300);
	BasicInformationPage basicinformationpage = page.getInstance(HomePage.class)
		.doSelectStateByDataprovided(RiskState);
	Thread.sleep(300);
	String BIPageHeader = basicinformationpage.getBasicinfopagePageHeader();
	log.info(BIPageHeader);
	Assert.assertEquals(BIPageHeader, "Address Validator In Progress.....");
	log.info("Successfully landed in Basicinformation page");
    }

}
