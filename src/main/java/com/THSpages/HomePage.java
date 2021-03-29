/**
 * 
 */
package com.THSpages;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * @author vdaru
 *
 */
public class HomePage extends BasePage {
    private static Logger log = Logger.getLogger(HomePage.class.getName() + " ----------------------------------");
    /*
     * verify Homepage title, Vefify Homepage Header Verify if logged user name is
     * printing on leftside of the HomePage Verify if menu consists of 'HOME'
     * 'PORTAL' 'QUOTES' 'POLICY MANAGEMENT' 'ADMIN' ''HELP, verify if we can make
     * agenct overide verify if all applicable states are displaying in Quotes
     * verify if all applicable dropdown values are displaying in Admin (Switch
     * User, Override, Task Manager)
     * 
     */
    // page locator //*[@id='application-container']/div[3]/div/div/div[2]/div[1]
 
    private By header = By.xpath("//*[@id='addressValidator']/div[1]/div");
    private By AgentInfo = By.xpath("//*[@id='application-container']/div[3]/div/div/div[2]/div[2]");

    // Test for labes printing as expected. HOME / PORTAL / QUOTES / POLICY
    // MANAGMENT / ADMIN / HELP

    private By Home_text = By.xpath("//*[@id='custom-bootstrap-menu']/div/div/ul/li[1]");
    private By Portal_text = By.xpath("//*[@id='custom-bootstrap-menu']/div/div/ul/li[2]");
    private By Quotes_text = By.xpath("//*[@id='custom-bootstrap-menu']/div/div/ul/li[3]");
    private By PolicyManagment_text = By.xpath("//*[@id='custom-bootstrap-menu']/div/div/ul/li[4]");
    private By Admin_text = By.xpath("//*[@id='custom-bootstrap-menu']/div/div/ul/li[5]");
    private By Help_text = By.xpath("//*[@id='custom-bootstrap-menu']/div/div/ul/li[6]");

    // agency override change agent and save changes
    private By agencyOverridelable = By.xpath("//*[@id='application-container']/div[4]/div[1]/div[4]/h4");
    private By agentOverride = By.xpath("//*[@id='agent-id']");
    private By agentChangeSave = By
	    .xpath("//*[@id='application-container']/div[4]/div[1]/div[4]/form[1]/div[2]/button[1]");
    private By agentoverride_alertMessage = By.id("//*[@id='portalMessage-note']/ul/li");

    // quotes get all states

//   By quotes_Select_States            = By.xpath("//*[@id='custom-bootstrap-menu']/div/div/ul/li[3]"); //a[@class='dropdown-toggle'][1]
    private By ths_applicable_States_list = By.xpath("//*[@id='custom-bootstrap-menu']/div/div/ul/li[3]/ul/li/div/ul");
    private By quotes_Select_States = By.xpath("//a[@class='dropdown-toggle'][1]");

// getters    

    /**
     * @return the agentInfo
     */
    public WebElement getAgentInfo() {
	return getElement(AgentInfo);
    }

    /**
     * @return the home_text
     */
    public WebElement getHome_text() {
	return getElement(Home_text);
    }

    /**
     * @return the agencyOverridelable
     */
    public WebElement getAgencyOverridelable() {
	return getElement(agencyOverridelable);
    }

    /**
     * @return the portal_text
     */
    public WebElement getPortal_text() {
	return getElement(Portal_text);
    }

    /**
     * @return the quotes_text
     */
    public WebElement getQuotes_text() {
	return getElement(Quotes_text);
    }

    /**
     * @return the policyManagment_text
     */
    public WebElement getPolicyManagment_text() {
	return getElement(PolicyManagment_text);
    }

    /**
     * @return the admin_text
     */
    public WebElement getAdmin_text() {
	return getElement(Admin_text);
    }

    /**
     * @return the help_text
     */
    public WebElement getHelp_text() {
	return getElement(Help_text);
    }

    /**
     * @return the agentOverride
     */
    public WebElement getAgentOverride() {
	return getElement(agentOverride);
    }

    /**
     * @return the agentChangeSave
     */
    public WebElement getAgentChangeSave() {
	return getElement(agentChangeSave);
    }

    /**
     * @return the agentoverride_alertMessage
     */
    public WebElement getAgentoverride_alertMessage() {
	return getElement(agentoverride_alertMessage);
    }

    /**
     * @return the ths_applicable_States_list
     */
    public WebElement getThs_applicable_States_list() {
	return getElement(ths_applicable_States_list);
    }

    /**
     * @param stateSelect
     * @return the ths_applicable_States_list
     */
    public WebElement getquotes_Select_States() {
	return getElement(quotes_Select_States);
    }

    public WebElement getHeader() {
	return getElement(header);
    }

    public String getHomePageTitle() {
	return getPageTitle();
    }

    public String getHomePageHeader() {

	return getPageHeader(header);
    }

    public void doAgencyOverirde(String AgencyOveride) throws InterruptedException {
	log.info("Agency is changed to :" + AgencyOveride);

	getAgentOverride().clear();
	Thread.sleep(300);
	getAgentOverride().sendKeys(AgencyOveride);
	Thread.sleep(300);
	getAgentChangeSave().sendKeys(Keys.ENTER);
	Thread.sleep(1000);
        String agencyOverridetext = driver.findElement(By.xpath("//*[@id='application-container']/div[3]/div/div/div[2]/div[2]")).getText();
        log.info(agencyOverridetext);
        if(agencyOverridetext.contains(AgencyOveride)) {
            log.info("Agency successfully overrider to group ID======== "   +  AgencyOveride );
        }else {
            log.info("Agency Overider is UNSUCCESSFUL to group ID======== " + AgencyOveride);
        }	
	return;
    }

    public void doTHS_Statesapplicability() throws InterruptedException {

	// check if all the states are displaying in dropdown
	Thread.sleep(500);

	driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
	Thread.sleep(500);
	WebElement THS_States_select = driver.findElement(quotes_Select_States);
	List<WebElement> Listall_THS_states = THS_States_select.findElements(ths_applicable_States_list);

	for (WebElement THS_states : Listall_THS_states) {
	    String getAll_THS_states = THS_states.getText(); 
           Assert.assertEquals(getAll_THS_states, "NEW QUOTES\n"+ 
           	"AL\n"+
           	"AR\n"+
           	"AZ\n"+
           	"GA\n"+
           	"IL\n"+
           	"IN\n"+
           	"LA\n"+
           	"MI\n"+
           	"MO\n"+
           	"MS\n"+
           	"NC\n"+
           	"OH\n"+
           	"SC\n"+
           	"TN\n"+
           	"TX\n"+
           	"WI","All States displaying");
	    log.info(getAll_THS_states);

	}
    }

    public void doverify_THS_Statesapplicability() throws InterruptedException, UnsupportedEncodingException {

	// verify if all the states are displaying in State section
	getquotes_Select_States().click();
	Thread.sleep(300);
	List<WebElement> stateDropdown_List = driver.findElements(ths_applicable_States_list);
	for (int i = 0; i < stateDropdown_List.size(); i++) {

	    WebElement element = stateDropdown_List.get(i);
	    String stateDropdown_value = element.getAttribute("innerHTML");
	    log.info(stateDropdown_List.size());
	}
    }

    public BasicInformationPage doSelectStateByDataprovided(String riskState) throws InterruptedException {
	log.info("Select State  :" + riskState);
	getquotes_Select_States().click();
	Thread.sleep(500);
	driver.findElement(By.linkText(riskState)).click();
	Thread.sleep(500);
	log.info("successfully selected state :  " + riskState);
	return getInstance(BasicInformationPage.class);
    }

    public HomePage(WebDriver driver) {
	super(driver);

    }
}
