/**
 * 
 */
package com.THSpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author vdaru
 *
 */
public class DisconnectPage extends BasePage {

    /*
     * verify page title, verify header : "WELCOME TO TOWER HILL'S AGENT PORTAL"
     * verify buttons avaliable : Personal Lines Portal, Commercial Lines Portal and
     * Agent Dashboard click on Personal Loines Portal
     */

    private By DisconnectSession = By.xpath("//*[@id='submit']");

    public String getPortalPageTitle() {
	return getPageTitle();
    }

    public WebElement getDisconnectSession() {
	return getElement(DisconnectSession);
    }

    public HomePage DisconnectSession_button() {

	getDisconnectSession().click();

	// get instance
	return getInstance(HomePage.class);

    }

    public DisconnectPage(WebDriver driver) {
	super(driver);

    }
}
