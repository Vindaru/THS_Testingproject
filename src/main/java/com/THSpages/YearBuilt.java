/**
 * 
 */
package com.THSpages;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

/**
 * @author vdaru
 *
 */
public class YearBuilt extends BasePage {

    private static Logger log = Logger.getLogger(YearBuilt.class.getName() + " ----------------------------------");

    /*
     * Occupancy page will be testing, occupancies based on states
     * 
     * - verify if occupancy label is displaying - based on states verify if all the
     * occupancies are displaying or not
     */

    private By Occupancy = By.name("policyTerm|location|occupancy");

    public WebElement getOccupancy() {
	return getElement(Occupancy);
    }

    public void OccupancyValues(String state, String yearbuilt) throws InterruptedException {

	// verity if the 
	
    }
    
    public void SelectOccupancy(String state, String yearbuilt) throws InterruptedException {
	
	Select selectOccupancy = new Select (driver.findElement(Occupancy));
	selectOccupancy.selectByVisibleText(yearbuilt);
    }

    public YearBuilt(WebDriver driver) {
	super(driver);
    }
}
