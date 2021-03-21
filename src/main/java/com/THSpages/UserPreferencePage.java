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
public class UserPreferencePage extends BasePage {

    public String getUserPreferencePageTitle() {
	return getPageTitle();
    }

    public UserPreferencePage(WebDriver driver) {
	super(driver);

    }
}
