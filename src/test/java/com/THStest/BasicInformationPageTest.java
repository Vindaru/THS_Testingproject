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
public class BasicInformationPageTest extends BaseTest{

    private static  Logger log = Logger.getLogger(BasicInformationPageTest.class.getName()+" ----------------------------------");
    

    
 // check if all the labels are displaying as expected
    /*
     * business owned
     * F name, L Name
     * Address
     * City, State, Zip DOB Occupancy and dwelling in 1000 feet of a hydrant
     * 
     */
    @Test(priority = 1)
    public void verifyBascinformantionLabels() throws InterruptedException {
	
	
	page.getInstance(LoginPage.class).doLogin(GroupID,UseName, Password);
	Thread.sleep(300);
	page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);
	page.getInstance(DisconnectPage.class).DisconnectSession_button();
	Thread.sleep(300);
	// homepage select state
	page.getInstance(HomePage.class).doSelectStateByDataprovided(stateSelect);	
	// basic information page	
	
	 
	// check if all the labels are displaying as expected validateInsurefirstandlastname
	
	page.getInstance(BasicInformationPage.class).getBasicinformationpageLables();

     }  
    @Test(priority =2)
    public void verifyBasicinfoPage() throws InterruptedException {
	
	
	page.getInstance(LoginPage.class).doLogin(GroupID,UseName, Password);
	Thread.sleep(300);
	page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);
	page.getInstance(DisconnectPage.class).DisconnectSession_button();
	Thread.sleep(300);
	// homepage select state
	page.getInstance(HomePage.class).doSelectStateByDataprovided(stateSelect);	
	// basic information page		
	Thread.sleep(500);
	page.getInstance(BasicInformationPage.class).doBasicinformationPagevalidation(FirstName,LastName, RiskAddress, RiskCity, RiskZipcode, DOB, Occupancy, FireHyderate);
	

     }  
    

    
}
