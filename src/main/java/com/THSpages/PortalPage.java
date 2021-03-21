/**
 * 
 */
package com.THSpages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * @author vdaru
 *
 */
public class PortalPage extends BasePage {

    private static Logger log = Logger.getLogger(LoginPage.class.getName() + " ----------------------------------");
    /*
     * verify page title, verify header : "WELCOME TO TOWER HILL'S AGENT PORTAL"
     * verify buttons avaliable : Personal Lines Portal, Commercial Lines Portal and
     * Agent Dashboard click on Personal Loines Portal
     */

    private By header = By.xpath("//*[@id='product-title']");
    private By PersonalLinesPortal = By.xpath("//*[@id='application-container']/div[2]/div/div/div[1]/form/button");
    private By portalUserPreferencesbutton = By.xpath("//*[@id='application-container']/header/div/div/div/div[2]/div[1]/div[2]/div/a[1]"); 

    public WebElement getHeader() {
	return getElement(header);
    }

    public String getPortalPageTitle() {
	return getPageTitle();
    }

    public String getPortalPageHeader() {
	return getPageHeader(header);
    }

    public String getPortalUserPreferencesbutton() {
	return getportalUserPreferencesbutton(portalUserPreferencesbutton);
    }

    public WebElement getPersonalLinesPortal() {
	return getElement(PersonalLinesPortal);
    }

    public HomePage PLP_CLICK() {
	getPersonalLinesPortal().click();
	// get instance
	return getInstance(HomePage.class);
    }

    public String UserPreferencebutton() throws InterruptedException {
	// get instance

	WebElement UserPreference = wait
		.until(ExpectedConditions.elementToBeClickable(portalUserPreferencesbutton));

	log.info(UserPreference);
	UserPreference.click();
	Thread.sleep(1000);

	UserPreferencePage UserP = new UserPreferencePage(driver);
	UserP.getUserPreferencePageTitle();

	log.info(UserP.getUserPreferencePageTitle());
	Assert.assertEquals(UserP.getUserPreferencePageTitle(),
		"RPM &#8211;  User Preferences &#8211; Tower Hill Insurance");
	return null;
    }

    public PortalPage(WebDriver driver) {
	super(driver);
    }
}
