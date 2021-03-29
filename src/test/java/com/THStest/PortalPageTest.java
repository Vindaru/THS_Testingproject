/**
 * 
 */
package com.THStest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.THSpages.HomePage;
import com.THSpages.LoginPage;
import com.THSpages.PortalPage;

/**
 * @author vdaru
 *
 */
public class PortalPageTest extends BaseTest {

    private static Logger log = Logger
	    .getLogger(PortalPageTest.class.getName() + " ----------------------------------");

    /*
     * when landed on Portal Page please select on Personal lines Portal and
     * continue to next page
     * 
     */
   

    @Test(dependsOnMethods = {"performlogin"}, priority = 1, description = "Testcase-2(PortalPageTest) = 'AfterScuccessful login please click on Portal button to go to homepage' ")
  
    public void performPortalTest() throws InterruptedException {

	page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	Thread.sleep(300);
	HomePage portalpage = page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);

    }
}