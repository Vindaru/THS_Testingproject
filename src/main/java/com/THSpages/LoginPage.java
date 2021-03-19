/**
 * 
 */
package com.THSpages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

/**
 * @author vdaru
 *
 */
public class LoginPage extends BasePage {

    private static Logger log = Logger.getLogger(LoginPage.class.getName() + " ----------------------------------");
    // page locator
    private By groupID = By.id("inputGroupID");
    private By userName = By.id("inputUserName");
    private By password = By.id("inputPassword");
    private By submitButton = By.xpath("//*[@id='authSubmit']");
    private By header = By.xpath("//*[@id='loginTitle']");
    private By invalid_credentials = By.xpath("//*[@id='errorMessage']");

//    private String GroupID = "";

    public LoginPage(WebDriver driver) {
	super(driver);
    }

    /*
     * Getters (process of encapsulation)
     * 
     */

    /**
     * @return the groupID
     */
    public WebElement getGroupID() {
	return getElement(groupID);
    }

    /**
     * @return the userName
     */
    public WebElement getUserName() {
	return getElement(userName);
    }

    /**
     * @return the password
     */
    public WebElement getPassword() {
	return getElement(password);
    }

    /**
     * @return the submitButton
     */
    public WebElement getSubmitButton() {
	return getElement(submitButton);
    }

    /**
     * @return the header
     */
    public WebElement getHeader() {
	return getElement(header);
    }

    /**
     * @return the invalid_credentials
     */
    public WebElement getinvalid_credentials() {
	return getElement(invalid_credentials);
    }

    public String getLogininPagetitle() {
	return getPageTitle();
    }

    public String getLogininPageheader() {
	return getPageHeader(header);
    }

    public PortalPage doLogin(String groupID, String userName, String password) throws InterruptedException {

	log.info("GroupID:" + groupID);
	log.info("UseName:" + userName);
	log.info("Password:" + password);

	getGroupID().sendKeys(groupID);
	Thread.sleep(300);
	getUserName().sendKeys(userName);
	Thread.sleep(300);
	getPassword().sendKeys(password);
	Thread.sleep(300);
	getSubmitButton().click();
	Thread.sleep(300);
	// get instance
	return getInstance(PortalPage.class);

    }

    public PortalPage doLogin_InvalidCred(String groupID, String userName, String password)
	    throws InterruptedException {

	log.info("GroupID:" + groupID);
	log.info("UseName:" + userName);
	log.info("Password:" + password);

	getGroupID().sendKeys(groupID);
	Thread.sleep(300);
	getUserName().sendKeys(userName);
	Thread.sleep(300);
	getPassword().sendKeys(password);
	Thread.sleep(300);
	getSubmitButton().click();
	Thread.sleep(500);
	String Test_InvalidCreditionals = getinvalid_credentials().getAttribute("value");
	log.info(Test_InvalidCreditionals);

//  	Assert.assertEquals(Test_InvalidCreditionals, "get instance Authentication Failed. Please check your credentials and try again. &nbsp;&nbsp;"); 

	return getInstance(PortalPage.class);

    }

}
