/**
 * 
 */
package com.THStest;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.THSpages.BasicInformationPage;
import com.THSpages.DisconnectPage;
import com.THSpages.HomePage;
import com.THSpages.LoginPage;
import com.THSpages.PortalPage;

import junit.framework.Assert;

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
	String basicinfoPageheader = page.getInstance(BasicInformationPage.class).getBasicinfopagePageHeader();
	log.info("Basic information page header -- " + basicinfoPageheader);
    }

    // title
    @Test(priority = 1)
    public void verify_BasicinformationPage_title() throws InterruptedException {
	String basicinfoPagetitle = page.getInstance(BasicInformationPage.class).getPageTitile();
	log.info("Basic information page title -- " + basicinfoPagetitle);
    }

    // verify lables displaying
    @Test(priority = 1)
    public void verify_BasicinformationPage_Labels() throws InterruptedException {

	page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	Thread.sleep(300);
	page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);
	page.getInstance(DisconnectPage.class).DisconnectSession_button();
	Thread.sleep(300);
	// homepage select state
	page.getInstance(HomePage.class).doSelectStateByDataprovided(stateSelect);
	// basic information page

	// check if all the labels are displaying as expected
	// validateInsurefirstandlastname

	page.getInstance(BasicInformationPage.class).getBasicinformationpageLables();

    }

    @Test(priority = 2)
    public void verify_BasicinformationPage_MappingResults() throws InterruptedException {

	page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	Thread.sleep(300);
	page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);
	page.getInstance(DisconnectPage.class).DisconnectSession_button();
	Thread.sleep(300);
	// homepage select state
	page.getInstance(HomePage.class).doSelectStateByDataprovided(stateSelect);
	// basic information page
	Thread.sleep(500);
	page.getInstance(BasicInformationPage.class).doBasicinformationPagevalidation(FirstName, LastName, RiskAddress,
		RiskCity, RiskZipcode, DOB, Occupancy, FireHyderate);
// verify if Mapping results are displaying after Validate button is clicked
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
	page.getInstance(HomePage.class).doSelectStateByDataprovided(stateSelect);
	// basic information page
	Thread.sleep(500);
	page.getInstance(BasicInformationPage.class).doBasicinformationPagevalidation(FirstName, LastName, RiskAddress,
		RiskCity, RiskZipcode, DOB, Occupancy, FireHyderate);
	Thread.sleep(1000);
       // verify if Mapping results are displaying after Validate button is clicked verify_selctbutton_EnterLatLong
	page.getInstance(BasicInformationPage.class).verify_MappingResults_header();
	page.getInstance(BasicInformationPage.class).verigy_addressvalidationbuttonsdisplaying();

    }

}
