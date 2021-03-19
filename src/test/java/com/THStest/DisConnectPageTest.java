/**
 * 
 */
package com.THStest;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.THSpages.DisconnectPage;
import com.THSpages.HomePage;
import com.THSpages.LoginPage;
import com.THSpages.PortalPage;

import junit.framework.Assert;

/**
 * @author vdaru
 *
 */
public class DisConnectPageTest extends BaseTest {

    private static Logger log = Logger
	    .getLogger(DisConnectPageTest.class.getName() + " ----------------------------------");

    /*
     * when landed on Portal Page please select on Personal lines Portal and
     * continue to next page
     * 
     */
    @Test(priority = 1)
    public void performDisconnectsessionTest() throws InterruptedException {

	page.getInstance(LoginPage.class).doLogin(GroupID, UseName, Password);
	Thread.sleep(300);
	page.getInstance(PortalPage.class).PLP_CLICK();
	Thread.sleep(300);
	HomePage disconnectpage = page.getInstance(DisconnectPage.class).DisconnectSession_button();
	Thread.sleep(300);
	String HomePageHeader = disconnectpage.getHomePageHeader();
	log.info(HomePageHeader);
	Assert.assertEquals(HomePageHeader, "RATING & POLICY MANAGEMENT");
    }

}
