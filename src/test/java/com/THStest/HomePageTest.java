/**
 * 
 */
package com.THStest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.UnsupportedEncodingException;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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

    @Test(priority = 1, description = "Testcase-1(homePageTest) = 'After landing on Homepage verify HomePage title ='RPM – Tower Hill Insurance – Tower Hill Insurance' ")
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
	AssertJUnit.assertEquals(HomePageTitle, "RPM – Tower Hill Insurance – Tower Hill Insurance");
	log.info("Successfully landed in Homepage and successfully verified Page Title");
    }

    @Test(priority = 2, description = "Testcase-2(homePageTest) = 'After landing on Homepage verify HomePage header ='RATING & POLICY MANAGEMENT' ")
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
	AssertJUnit.assertEquals(HomePageheader, "RATING & POLICY MANAGEMENT");
	log.info("Successfully landed in Homepage and successfully verified Page header");

    }

    @Test(priority = 3, description = "Testcase-3(homePageTest) = 'After landing on Homepage verify userDetails displaying as expected ")
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

    @Test(priority = 4, description = "Testcase-4(homePageTest) = 'After landing on Homepage verify MENU TABS displaying 'HOME','PORTAL','QUOTES',"
	    + "'POLICY MANAGMENT','ADMIN','HELP' ")
    public void verify_HomePage_Menutabs() throws InterruptedException {
	page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	Thread.sleep(300);
	HomePage portalpage = page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);
	page.getInstance(DisconnectPage.class).DisconnectSession_button();
	Thread.sleep(300);
	String HomePage_Menu_HOME = page.getInstance(HomePage.class).getHome_text().getText();
	log.info(HomePage_Menu_HOME);
	AssertJUnit.assertEquals(HomePage_Menu_HOME, "HOME");
	log.info("Successfully landed in Homepage and successfully verified HOME Tab on Menu section");
	String HomePage_Menu_PORTAL = page.getInstance(HomePage.class).getPortal_text().getText();
	log.info(HomePage_Menu_PORTAL);
	AssertJUnit.assertEquals(HomePage_Menu_PORTAL, "PORTAL");
	log.info("Successfully landed in Homepage and successfully verified PORTAL Tab on Menu section");
	String HomePage_Menu_QUOTES = page.getInstance(HomePage.class).getQuotes_text().getText();
	log.info(HomePage_Menu_QUOTES);
	AssertJUnit.assertEquals(HomePage_Menu_QUOTES, "QUOTES");
	log.info("Successfully landed in Homepage and successfully verified QUOTES Tab on Menu section");
	String HomePage_Menu_POLICYMANAGEMENT = page.getInstance(HomePage.class).getPolicyManagment_text().getText();
	log.info(HomePage_Menu_POLICYMANAGEMENT);
	AssertJUnit.assertEquals(HomePage_Menu_POLICYMANAGEMENT, "POLICY MANAGEMENT");
	log.info("Successfully landed in Homepage and successfully verified POLICY MANAGEMENT Tab on Menu section");
	String HomePage_Menu_ADMIN = page.getInstance(HomePage.class).getAdmin_text().getText();
	log.info(HomePage_Menu_ADMIN);
	AssertJUnit.assertEquals(HomePage_Menu_ADMIN, "ADMIN");
	log.info("Successfully landed in Homepage and successfully verified ADMIN Tab on Menu section");
	String HomePage_Menu_HELP = page.getInstance(HomePage.class).getHelp_text().getText();
	log.info(HomePage_Menu_HELP);
	AssertJUnit.assertEquals(HomePage_Menu_HELP, "HELP");
	log.info("Successfully landed in Homepage and successfully verified HELP Tab on Menu section");
    }

    // Agency Override
    @Test(priority = 5, description = "Testcase-5(homePageTest) = 'After landing on Homepage Test AgencyOveride")
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
	String AgencyOverride_text = page.getInstance(HomePage.class).getAgencyOverridelable().getText();
	log.info(AgencyOverride_text);
	AssertJUnit.assertEquals(AgencyOverride_text, "Agency Override");
	Thread.sleep(300);
	page.getInstance(HomePage.class).doAgencyOverirde(AgencyOveride);
	Thread.sleep(500);
    }

    // Quote section verify if all THS applicable states are visible
    @Test(priority = 6, description = "Testcase-6(homePageTest) = 'After landing on Homepage Test if all the states are displaying")
    public void verify_HomePage_THS_States_Displaying() throws InterruptedException, UnsupportedEncodingException {

	page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	Thread.sleep(300);
	HomePage portalpage = page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);
	page.getInstance(DisconnectPage.class).DisconnectSession_button();
	Thread.sleep(300);
	Thread.sleep(300);
	page.getInstance(HomePage.class).doTHS_Statesapplicability();
	Thread.sleep(500);
    }

    @Test(groups ="Use test Data : 'TowerHillTestData' ",priority = 7, description = "Testcase-6(homePageTest) = 'After landing on Homepage Select data by excel data")
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

    }

}
