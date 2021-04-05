/**
 * 
 */
package com.THStest;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.THSpages.HomePage;
import com.THSpages.LoginPage;
import com.THSpages.PortalPage;

import junit.framework.Assert;

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
	@Test(priority = 1)
	public void verifyportalpageUserPreferencesbuttondisoplaying() throws InterruptedException {

		page.getInstance(LoginPage.class).doLogin(GroupID, UserName, Password);
		Thread.sleep(300);
		String portallogOutbutton = page.getInstance(PortalPage.class).UserPreferencebutton();
		Thread.sleep(300);
		log.info(portallogOutbutton);
		Assert.assertEquals(portallogOutbutton, "User Preferences");
		// verify if the button is clickible
	}

	@Test(priority = 2)
	public void performPortalTest() throws InterruptedException {

		page.getInstance(LoginPage.class).doLogin(GroupID, UserName, Password);
		Thread.sleep(300);
		HomePage portalpage = page.getInstance(PortalPage.class).PLP_CLICK();
		Thread.sleep(300);

	}
}