/**
 * 
 */
package com.THSpages;

import org.openqa.selenium.WebDriver;

/**
 * @author vdaru
 *
 */
public class UserPreferencePage extends BasePage {

	public String getUserPreferencePageTitle() {
		return getPageTitle();
	}

	public UserPreferencePage(WebDriver driver) {
		super(driver);

	}
}
