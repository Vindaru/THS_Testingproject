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
public class OccupancyPage extends BasePage {

	private static Logger log = Logger.getLogger(OccupancyPage.class.getName() + " ----------------------------------");

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

	public void OccupancyValues(String state, String occupancy) throws InterruptedException {

		/*
		 * VERIFY IF ALL THE OCCUPANCIES ARE DISPALYING BASED ON STATES
		 * 
		 * =============================================================================
		 * 
		 * AL : OWNER || SEASONAL || RENTAL || VACANT || NOT A RESIDENCE
		 * -----------------------------------------------------------------------------
		 * ----------------------------------------------------------------------------
		 * AZ : OWNER || SEASONAL || RENTAL || VACANT || NOT A RESIDENCE || TENANT
		 * -----------------------------------------------------------------------------
		 * ----------------------------------------------------------------------------
		 * AR : OWNER || SEASONAL || RENTAL || VACANT || NOT A RESIDENCE
		 * -----------------------------------------------------------------------------
		 * ----------------------------------------------------------------------------
		 * GA : OWNER || SEASONAL || RENTAL || VACANT || NOT A RESIDENCE
		 * -----------------------------------------------------------------------------
		 * ----------------------------------------------------------------------------
		 * IL : OWNER || SEASONAL || RENTAL || VACANT || NOT A RESIDENCE
		 * -----------------------------------------------------------------------------
		 * ----------------------------------------------------------------------------
		 * IN : OWNER || SEASONAL || RENTAL || VACANT || NOT A RESIDENCE
		 * -----------------------------------------------------------------------------
		 * ----------------------------------------------------------------------------
		 * LA : OWNER || SEASONAL || RENTAL || VACANT || NOT A RESIDENCE
		 * -----------------------------------------------------------------------------
		 * ----------------------------------------------------------------------------
		 * MS : OWNER || SEASONAL || RENTAL || VACANT || NOT A RESIDENCE
		 * -----------------------------------------------------------------------------
		 * ----------------------------------------------------------------------------
		 * MI : OWNER || SEASONAL || RENTAL || VACANT || NOT A RESIDENCE
		 * -----------------------------------------------------------------------------
		 * ----------------------------------------------------------------------------
		 * MO : OWNER || SEASONAL || RENTAL || VACANT || NOT A RESIDENCE
		 * -----------------------------------------------------------------------------
		 * ----------------------------------------------------------------------------
		 * TN : OWNER || SEASONAL || RENTAL || VACANT || NOT A RESIDENCE
		 * -----------------------------------------------------------------------------
		 * ----------------------------------------------------------------------------
		 * OH : OWNER || SEASONAL || RENTAL || VACANT || NOT A RESIDENCE
		 * -----------------------------------------------------------------------------
		 * ----------------------------------------------------------------------------
		 * TX : OWNER || SEASONAL || RENTAL || VACANT || NOT A RESIDENCE || TENANT
		 * -----------------------------------------------------------------------------
		 * ----------------------------------------------------------------------------
		 * NC : OWNER || SEASONAL || RENTAL || VACANT || NOT A RESIDENCE
		 * -----------------------------------------------------------------------------
		 * ----------------------------------------------------------------------------
		 * SC : OWNER || SEASONAL || RENTAL || VACANT || NOT A RESIDENCE || TENANT
		 * -----------------------------------------------------------------------------
		 * ----------------------------------------------------------------------------
		 * WI : OWNER || SEASONAL || RENTAL || VACANT || NOT A RESIDENCE
		 * -----------------------------------------------------------------------------
		 * ----------------------------------------------------------------------------
		 * 
		 * =============================================================================
		 * =============================================================================
		 * =======
		 * 
		 */
		switch (state) {

		case "AL": // Alabama
		case "AR": // Arkansas
		case "GA": // Georgia
		case "IN": // Indiana
		case "IL": // Illinios
		case "LA": // Louisana
		case "MI": // Michigan
		case "MO": // Missouri
		case "MS": // Mississippi
		case "OH": // Ohio
		case "TN": // Tennessee
		case "WI": // Wiscosin

			String List_1[] = { "Select...", "Seasonal", "Vacant", "Rental", "Owner", "Not A Residence" };
			Select set1_selectOccupancy = new Select(driver.findElement(Occupancy));
			List<WebElement> set1_dropdowns = set1_selectOccupancy.getOptions();
			log.info(set1_dropdowns.size());
			for (int i = 0; i < set1_dropdowns.size(); i++) {
				Assert.assertEquals(set1_dropdowns.get(i).getText(), List_1[i]);
				log.info(set1_dropdowns.get(i).getText());
			}
			log.info("Verifiaction for Occupancy applicability is not compelte for state : " + state);
			Thread.sleep(500);
			set1_selectOccupancy.selectByVisibleText(occupancy);
			break;
		case "AZ": // Arizona
		case "SC": // South Carolina
		case "TX": // Texas

			String List_2[] = { "Select...", "Seasonal", "Vacant", "Rental", "Owner", "Not A Residence", "Tenant" };
			Select set2_selectOccupancy = new Select(driver.findElement(Occupancy));
			List<WebElement> set2_dropdowns = set2_selectOccupancy.getOptions();

			log.info(set2_dropdowns.size());

			for (int i = 0; i < set2_dropdowns.size(); i++) {
				Assert.assertEquals(set2_dropdowns.get(i).getText(), List_2[i]);
				log.info(set2_dropdowns.get(i).getText());
			}
			log.info("Verifiaction for Occupancy applicability is not compelte for state : " + state);
			Thread.sleep(500);
			set2_selectOccupancy.selectByVisibleText(occupancy);
			break;

		case "NC": // North Carolina

			String List_3[] = { "Select...", "Seasonal", "Rental", "Owner" };
			Select set3_selectOccupancy = new Select(driver.findElement(Occupancy));
			List<WebElement> set3_dropdowns = set3_selectOccupancy.getOptions();

			log.info(set3_dropdowns.size());

			for (int i = 0; i < set3_dropdowns.size(); i++) {
				Assert.assertEquals(set3_dropdowns.get(i).getText(), List_3[i]);
				log.info(set3_dropdowns.get(i).getText());
			}
			log.info("Verifiaction for Occupancy applicability is not compelte for state : " + state);
			Thread.sleep(500);
			set3_selectOccupancy.selectByVisibleText(occupancy);
			break;
		}
	}

	public void SelectOccupancy(String state, String occupancy) throws InterruptedException {

		Select selectOccupancy = new Select(driver.findElement(Occupancy));
		selectOccupancy.selectByVisibleText(occupancy);
	}

	public OccupancyPage(WebDriver driver) {
		super(driver);
	}
}
