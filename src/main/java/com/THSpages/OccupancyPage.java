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

	case "AL":

	    String AL_List[] = { "Select...", "Seasonal", "Vacant", "Rental", "Owner", "Not A Residence" };
	    Select AL_selectOccupancy = new Select(driver.findElement(Occupancy));
	    List<WebElement> AL_dropdowns = AL_selectOccupancy.getOptions();

	    log.info(AL_dropdowns.size());

	    for (int i = 0; i < AL_dropdowns.size(); i++) {
		Assert.assertEquals(AL_dropdowns.get(i).getText(), AL_List[i]);
		log.info(AL_dropdowns.get(i).getText());
	    }
	    log.info("Vaerification successful for Occuaoncy dropdown   ---- state AL");	    	    
	    Thread.sleep(500);
	    AL_selectOccupancy.selectByVisibleText(occupancy);
	    
	    break;

	case "AR":

	    String AR_List[] = { "Select...", "Seasonal", "Vacant", "Rental", "Owner", "Not A Residence" };
	    Select AR_selectOccupancy = new Select(driver.findElement(Occupancy));
	    List<WebElement> AR_dropdowns = AR_selectOccupancy.getOptions();

	    log.info(AR_dropdowns.size());

	    for (int i = 0; i < AR_dropdowns.size(); i++) {
		Assert.assertEquals(AR_dropdowns.get(i).getText(), AR_List[i]);
		log.info(AR_dropdowns.get(i).getText());
	    }
	    log.info("Verification successful for Occuaoncy dropdown   ---- state AR");
	    
	    Thread.sleep(500);
	    AR_selectOccupancy.selectByVisibleText(occupancy);
	    break;

	case "AZ":

	    String AZ_List[] = { "Select...", "Seasonal", "Vacant", "Rental", "Owner", "Not A Residence", "Tenant" };
	    Select AZ_selectOccupancy = new Select(driver.findElement(Occupancy));
	    List<WebElement> AZ_dropdowns = AZ_selectOccupancy.getOptions();

	    log.info(AZ_dropdowns.size());

	    for (int i = 0; i < AZ_dropdowns.size(); i++) {
		Assert.assertEquals(AZ_dropdowns.get(i).getText(), AZ_List[i]);
		log.info(AZ_dropdowns.get(i).getText());
	    }
	    log.info("Vaerification successful for Occuaoncy dropdown   ---- state AZ");
	    Thread.sleep(500);
	    AZ_selectOccupancy.selectByVisibleText(occupancy);
	    break;

	case "GA":

	    String GA_List[] = { "Select...", "Seasonal", "Vacant", "Rental", "Owner", "Not A Residence" };
	    Select GA_selectOccupancy = new Select(driver.findElement(Occupancy));
	    List<WebElement> GA_dropdowns = GA_selectOccupancy.getOptions();

	    log.info(GA_dropdowns.size());

	    for (int i = 0; i < GA_dropdowns.size(); i++) {
		Assert.assertEquals(GA_dropdowns.get(i).getText(), GA_List[i]);
		log.info(GA_dropdowns.get(i).getText());
	    }
	    log.info("Vaerification successful for Occuaoncy dropdown   ---- state GA");
	    Thread.sleep(500);
	    GA_selectOccupancy.selectByVisibleText(occupancy);
	    break;

	case "IL":

	    String IL_List[] = { "Select...", "Seasonal", "Vacant", "Rental", "Owner", "Not A Residence" };
	    Select IL_selectOccupancy = new Select(driver.findElement(Occupancy));
	    List<WebElement> IL_dropdowns = IL_selectOccupancy.getOptions();

	    log.info(IL_dropdowns.size());

	    for (int i = 0; i < IL_dropdowns.size(); i++) {
		Assert.assertEquals(IL_dropdowns.get(i).getText(), IL_List[i]);
		log.info(IL_dropdowns.get(i).getText());
	    }
	    log.info("Vaerification successful for Occuaoncy dropdown   ---- state IL");
	    
	    Thread.sleep(500);
	    IL_selectOccupancy.selectByVisibleText(occupancy);
	    break;

	case "IN":
	    String IN_List[] = { "Select...", "Seasonal", "Vacant", "Rental", "Owner", "Not A Residence" };
	    Select IN_selectOccupancy = new Select(driver.findElement(Occupancy));
	    List<WebElement> IN_dropdowns = IN_selectOccupancy.getOptions();

	    log.info(IN_dropdowns.size());

	    for (int i = 0; i < IN_dropdowns.size(); i++) {
		Assert.assertEquals(IN_dropdowns.get(i).getText(), IN_List[i]);
		log.info(IN_dropdowns.get(i).getText());
	    }
	    log.info("Vaerification successful for Occuaoncy dropdown   ---- state IN");
	    
	    Thread.sleep(500);
	    IN_selectOccupancy.selectByVisibleText(occupancy);
	    break;

	case "LA":

	    String LA_List[] = { "Select...", "Seasonal", "Vacant", "Rental", "Owner", "Not A Residence" };
	    Select LA_selectOccupancy = new Select(driver.findElement(Occupancy));
	    List<WebElement> LA_dropdowns = LA_selectOccupancy.getOptions();

	    log.info(LA_dropdowns.size());

	    for (int i = 0; i < LA_dropdowns.size(); i++) {
		Assert.assertEquals(LA_dropdowns.get(i).getText(), LA_List[i]);
		log.info(LA_dropdowns.get(i).getText());
	    }
	    log.info("Vaerification successful for Occuaoncy dropdown   ---- state LA");
	    
	    Thread.sleep(500);
	    LA_selectOccupancy.selectByVisibleText(occupancy);
	    break;

	case "MI":

	    String MI_List[] = { "Select...", "Seasonal", "Vacant", "Rental", "Owner", "Not A Residence" };
	    Select MI_selectOccupancy = new Select(driver.findElement(Occupancy));
	    List<WebElement> MI_dropdowns = MI_selectOccupancy.getOptions();

	    log.info(MI_dropdowns.size());

	    for (int i = 0; i < MI_dropdowns.size(); i++) {
		Assert.assertEquals(MI_dropdowns.get(i).getText(), MI_List[i]);
		log.info(MI_dropdowns.get(i).getText());
	    }
	    log.info("Vaerification successful for Occuaoncy dropdown   ---- state MI");
	    Thread.sleep(500);
	    MI_selectOccupancy.selectByVisibleText(occupancy);
	    break;

	case "MO":

	    String MO_List[] = { "Select...", "Seasonal", "Vacant", "Rental", "Owner", "Not A Residence" };
	    Select MO_selectOccupancy = new Select(driver.findElement(Occupancy));
	    List<WebElement> MO_dropdowns = MO_selectOccupancy.getOptions();

	    log.info(MO_dropdowns.size());

	    for (int i = 0; i < MO_dropdowns.size(); i++) {
		Assert.assertEquals(MO_dropdowns.get(i).getText(), MO_List[i]);
		log.info(MO_dropdowns.get(i).getText());
	    }
	    log.info("Vaerification successful for Occuaoncy dropdown   ---- state MO");
	    Thread.sleep(500);
	    MO_selectOccupancy.selectByVisibleText(occupancy);
	    break;

	case "MS":

	    String MS_List[] = { "Select...", "Seasonal", "Vacant", "Rental", "Owner", "Not A Residence" };
	    Select MS_selectOccupancy = new Select(driver.findElement(Occupancy));
	    List<WebElement> MS_dropdowns = MS_selectOccupancy.getOptions();

	    log.info(MS_dropdowns.size());

	    for (int i = 0; i < MS_dropdowns.size(); i++) {
		Assert.assertEquals(MS_dropdowns.get(i).getText(), MS_List[i]);
		log.info(MS_dropdowns.get(i).getText());
	    }
	    log.info("Vaerification successful for Occuaoncy dropdown   ---- state MS");
	    Thread.sleep(500);
	    MS_selectOccupancy.selectByVisibleText(occupancy);
	    break;

	case "NC":

	    String NC_List[] = { "Select...", "Seasonal", "Rental", "Owner", "Tenant" };
	    Select NC_selectOccupancy = new Select(driver.findElement(Occupancy));
	    List<WebElement> NC_dropdowns = NC_selectOccupancy.getOptions();

	    log.info(NC_dropdowns.size());

	    for (int i = 0; i < NC_dropdowns.size(); i++) {
		Assert.assertEquals(NC_dropdowns.get(i).getText(), NC_List[i]);
		log.info(NC_dropdowns.get(i).getText());
	    }
	    log.info("Vaerification successful for Occuaoncy dropdown   ---- state NC");
	    Thread.sleep(500);
	    NC_selectOccupancy.selectByVisibleText(occupancy);
	    break;

	case "SC":

	    String SC_List[] = { "Select...", "Seasonal", "Vacant", "Rental", "Owner", "Not A Residence", "Tenant" };
	    Select SC_selectOccupancy = new Select(driver.findElement(Occupancy));
	    List<WebElement> SC_dropdowns = SC_selectOccupancy.getOptions();

	    log.info(SC_dropdowns.size());

	    for (int i = 0; i < SC_dropdowns.size(); i++) {
		Assert.assertEquals(SC_dropdowns.get(i).getText(), SC_List[i]);
		log.info(SC_dropdowns.get(i).getText());
	    }
	    log.info("Vaerification successful for Occuaoncy dropdown   ---- state SC");
	    Thread.sleep(500);
	    SC_selectOccupancy.selectByVisibleText(occupancy);
	    break;

	case "OH":

	    String OH_List[] = { "Select...", "Seasonal", "Vacant", "Rental", "Owner", "Not A Residence" };
	    Select OH_selectOccupancy = new Select(driver.findElement(Occupancy));
	    List<WebElement> OH_dropdowns = OH_selectOccupancy.getOptions();

	    log.info(OH_dropdowns.size());

	    for (int i = 0; i < OH_dropdowns.size(); i++) {
		Assert.assertEquals(OH_dropdowns.get(i).getText(), OH_List[i]);
		log.info(OH_dropdowns.get(i).getText());
	    }
	    log.info("Vaerification successful for Occuaoncy dropdown   ---- state OH");
	    Thread.sleep(500);
	    OH_selectOccupancy.selectByVisibleText(occupancy);
	    break;

	case "TN":

	    String TN_List[] = { "Select...", "Seasonal", "Vacant", "Rental", "Owner", "Not A Residence" };
	    Select TN_selectOccupancy = new Select(driver.findElement(Occupancy));
	    List<WebElement> TN_dropdowns = TN_selectOccupancy.getOptions();

	    log.info(TN_dropdowns.size());

	    for (int i = 0; i < TN_dropdowns.size(); i++) {
		Assert.assertEquals(TN_dropdowns.get(i).getText(), TN_List[i]);
		log.info(TN_dropdowns.get(i).getText());
	    }
	    log.info("Vaerification successful for Occuaoncy dropdown   ---- state TN");
	    
	    Thread.sleep(500);
	    TN_selectOccupancy.selectByVisibleText(occupancy);
	    break;

	case "TX":
	    String TX_List[] = { "Select...", "Seasonal", "Vacant", "Rental", "Owner", "Not A Residence", "Tenant" };
	    Select TX_selectOccupancy = new Select(driver.findElement(Occupancy));
	    List<WebElement> TX_dropdowns = TX_selectOccupancy.getOptions();

	    log.info(TX_dropdowns.size());

	    for (int i = 0; i < TX_dropdowns.size(); i++) {
		Assert.assertEquals(TX_dropdowns.get(i).getText(), TX_List[i]);
		log.info(TX_dropdowns.get(i).getText());
	    }
	    log.info("Vaerification successful for Occuaoncy dropdown   ---- state TX");
	    
	    Thread.sleep(500);
	    TX_selectOccupancy.selectByVisibleText(occupancy);
	    break;

	case "WI":

	    String WI_List[] = { "Select...", "Seasonal", "Vacant", "Rental", "Owner", "Not A Residence" };
	    Select WI_selectOccupancy = new Select(driver.findElement(Occupancy));
	    List<WebElement> WI_dropdowns = WI_selectOccupancy.getOptions();

	    log.info(WI_dropdowns.size());

	    for (int i = 0; i < WI_dropdowns.size(); i++) {
		Assert.assertEquals(WI_dropdowns.get(i).getText(), WI_List[i]);
		log.info(WI_dropdowns.get(i).getText());
	    }
	    log.info("Vaerification successful for Occuaoncy dropdown   ---- state WI");
	    Thread.sleep(500);
	       break;

	}
	
    }
    
    public void SelectOccupancy(String state, String occupancy) throws InterruptedException {
	
	Select selectOccupancy = new Select (driver.findElement(Occupancy));
	selectOccupancy.selectByVisibleText(occupancy);
    }

    public OccupancyPage(WebDriver driver) {
	super(driver);
    }
}
