/**
 * 
 */
package com.THStest;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
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
public class BasicInformationPageTest extends BaseTest {

    private static Logger log = Logger
	    .getLogger(BasicInformationPageTest.class.getName() + " ----------------------------------");

    // check if all the labels are displaying as expected
    /*
     * business owned F name, L Name Address City, State, Zip DOB Occupancy and
     * dwelling in 1000 feet of a hydrant
     * 
     */

    // header
    @Test(priority = 1)
    public void verify_BasicinformationPage_header() throws InterruptedException {
	page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	Thread.sleep(300);
	page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);
	page.getInstance(DisconnectPage.class).DisconnectSession_button();
	Thread.sleep(1000);
	page.getInstance(HomePage.class).doSelectStateByDataprovided(RiskState);
	Thread.sleep(1000);
//	String basicinfoPageheader = page.getInstance(BasicInformationPage.class).getBasicinfopagePageHeader();
////	Assert.assertEquals(basicinfoPageheader, "RATING & POLICY MANAGEMENT");
//	log.info("Basic information page header -- " + basicinfoPageheader);
    }

    // verify lables displaying
    @Test(priority = 3)
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

    @Test(priority = 4)
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
}
