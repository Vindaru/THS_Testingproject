/**
 * 
 */
package com.THSpages;

import java.util.List;
import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * @author vdaru
 *
 */
public class BasicInformationPage extends BasePage {

    private static Logger log = Logger
	    .getLogger(BasicInformationPage.class.getName() + " ----------------------------------");

    private By header = By.id("//*[@id='addressValidator']/div[1]/div/h3");  //*[@id='addressValidator']/div[1]/div/h3
    private By BusinessOwned_lable = By.xpath(
	    "/html/body/div[1]/div[4]/div[1]/div[2]/div/div[2]/div/form/section/div[2]/div[1]/div[1]/div[1]/label");
    private By InsuredFirstName_lable = By.xpath(
	    "/html/body/div[1]/div[4]/div[1]/div[2]/div/div[2]/div/form/section/div[2]/div[1]/div[1]/div[2]/div/label/span[1]");
    private By InsuredLastName_lable = By.xpath(
	    "/html/body/div[1]/div[4]/div[1]/div[2]/div/div[2]/div/form/section/div[2]/div[1]/div[1]/div[2]/label/span[1]");
    private By InsuredAddress_lable = By.xpath(
	    "/html/body/div[1]/div[4]/div[1]/div[2]/div/div[2]/div/form/section/div[2]/div[1]/div[2]/label[1]/span[1]");
    private By InsuredCity_lable = By.xpath(
	    "/html/body/div[1]/div[4]/div[1]/div[2]/div/div[2]/div/form/section/div[2]/div[1]/div[2]/label[3]/span[1]");
    private By InsuredState_lable = By.xpath(
	    "/html/body/div[1]/div[4]/div[1]/div[2]/div/div[2]/div/form/section/div[2]/div[1]/div[2]/label[4]/span[1]");
    private By InsuredZipcode_lable = By.xpath(
	    "/html/body/div[1]/div[4]/div[1]/div[2]/div/div[2]/div/form/section/div[2]/div[1]/div[2]/label[5]/span[1]");
    private By InsuredDOB_lable = By
	    .xpath("/html/body/div[1]/div[4]/div[1]/div[2]/div/div[2]/div/form/section/div[2]/div[2]/label[1]/span[1]");
    private By Occupancy_lable = By
	    .xpath("/html/body/div[1]/div[4]/div[1]/div[2]/div/div[2]/div/form/section/div[2]/div[2]/label[2]/span[1]");
    private By Fire_Hyderant_lable = By
	    .xpath("/html/body/div[1]/div[4]/div[1]/div[2]/div/div[2]/div/form/section/div[4]/div/label");
    private By validateButton = By
	    .xpath("/html/body/div[1]/div[4]/div[1]/div[2]/div/div[2]/div/form/section/div[5]/span");
    private By FirstName = By.name("policyTerm|primaryInsured|firstName");
   
    private By LastName = By.name("policyTerm|primaryInsured|lastName");
   
    private By Address = By.name("policyTerm|location|address|street");
   
    private By City = By.name("policyTerm|location|address|city");
   
    private By Zipcode = By.name("policyTerm|location|address|zipCode");
   
    private By DOB = By.name("policyTerm|primaryInsured|dateOfBirth");
   
    private By Occupancy = By.name("policyTerm|location|occupancy");
   
    private By Fire_Hyderant = By.name("policyTerm|location|nearFireHydrant");
   
    private By ValidateButton_Click = By.id("validate-address-button");
  
    private By resultmapperheader = By.xpath("//*[@id='addressValidatorMappingResults']/div[1]");
   
    private By selectAddressbutton = By.xpath("//*[@id='addressValidatorMappingResults']/div[2]/div[1]");

    private By LatLongbutton = By.xpath("//*[@id='addressValidatorMappingResults']/div[3]/div[1]/div");

    /**//*[@id="addressValidatorMappingResults"]/div[2]/div[1]
     * @return the address
     */
    public String getresultmapperheader() {
	return getPageHeader(resultmapperheader);
    }

    public WebElement getAddress() {
	return getElement(Address);
    }

    public WebElement getValidateButton_Click() {
	return getElement(ValidateButton_Click);
    }

    /**
     * @return the selectAddressbutton
     */
    public WebElement getSelectAddressbutton() {
	return getElement(selectAddressbutton);
    }

    /**
     * @return the latLongbutton
     */
    public WebElement getLatLongbutton() {
	return getElement(LatLongbutton);
    }

    /**
     * @return the city
     */
    public WebElement getCity() {
	return getElement(City);
    }

    /**
     * @return the zipcode
     */
    public WebElement getZipcode() {
	return getElement(Zipcode);
    }

    /**
     * @return the dOB
     */
    public WebElement getDOB() {
	return getElement(DOB);
    }

    /**
     * @return the occupancy
     */
    public WebElement getOccupancy() {
	return getElement(Occupancy);
    }

    /**
     * @return the fire_Hyderant
     */
    public WebElement getFire_Hyderant() {
	return getElement(Fire_Hyderant);
    }

    public WebElement getHeader() {
	return getElement(header);
    }

    public String getBasicinfopagePageTitle() {
	return getPageTitle();
    }

    public String getBasicinfopagePageHeader() {
	return getPageHeader(header);
    }

    /*
     * @return the businessOwned_lable
     */
    public WebElement getBusinessOwned_lable() {
	return getElement(BusinessOwned_lable);
    }

    /**
     * @return the insuredFirstName_lable
     */
    public WebElement getInsuredFirstName_lable() {
	return getElement(InsuredFirstName_lable);
    }

    /**
     * @return the insuredLastName_lable
     */
    public WebElement getInsuredLastName_lable() {
	return getElement(InsuredLastName_lable);
    }

    /**
     * @return the insuredAddress_lable
     */
    public WebElement getInsuredAddress_lable() {
	return getElement(InsuredAddress_lable);
    }

    /**
     * @return the insuredCity_lable
     */
    public WebElement getInsuredCity_lable() {
	return getElement(InsuredCity_lable);
    }

    /**
     * @return the insuredState_lable
     */
    public WebElement getInsuredState_lable() {
	return getElement(InsuredState_lable);
    }

    /**
     * @return the insuredZipcode_lable
     */
    public WebElement getInsuredZipcode_lable() {
	return getElement(InsuredZipcode_lable);
    }

    /**
     * @return the insuredDOB_lable
     */
    public WebElement getInsuredDOB_lable() {
	return getElement(InsuredDOB_lable);
    }

    /**
     * @return the occupancy_lable
     */
    public WebElement getOccupancy_lable() {
	return getElement(Occupancy_lable);
    }

    /**
     * @return the fire_Hyderant_lable
     */
    public WebElement getFire_Hyderant_lable() {
	return getElement(Fire_Hyderant_lable);
    }

    /**
     * @return the validateButton
     */
    /**
     * @return the firstName
     */
    public WebElement getFirstName() {
	return getElement(FirstName);
    }

    /**
     * @return the lastName
     */
    public WebElement getLastName() {
	return getElement(LastName);
    }

    public WebElement getValidateButton() {
	return getElement(validateButton);
    }

    public void getBasicinformationpageLables() throws InterruptedException {

	Thread.sleep(500);
	String BusinessOwned_Lable = getBusinessOwned_lable().getText();
	log.info(BusinessOwned_Lable);
	Assert.assertEquals(BusinessOwned_Lable, "Business Owned");

	String FirstName_Lable = getInsuredFirstName_lable().getText();
	log.info(FirstName_Lable);
	Assert.assertEquals(FirstName_Lable, "First Name + Middle Initial");

	String LastName_Lable = getInsuredLastName_lable().getText();
	log.info(LastName_Lable);
	Assert.assertEquals(LastName_Lable, "Last Name");

	String InsuredAddress_Lable = getInsuredAddress_lable().getText();
	log.info(InsuredAddress_Lable);
	Assert.assertEquals(InsuredAddress_Lable, "Address");

	String InsuredCity_Lable = getInsuredCity_lable().getText();
	log.info(InsuredCity_Lable);
	Assert.assertEquals(InsuredCity_Lable, "City");

	String InsuredState_Lable = getInsuredState_lable().getText();
	log.info(InsuredState_Lable);
	Assert.assertEquals(InsuredState_Lable, "State");

	String Insured_ZipcodeLable = getInsuredZipcode_lable().getText();
	log.info(Insured_ZipcodeLable);
	Assert.assertEquals(Insured_ZipcodeLable, "ZIP Code");

	String InsuredDOB_lable = getInsuredDOB_lable().getText();
	log.info(InsuredDOB_lable);
	Assert.assertEquals(InsuredDOB_lable, "Date of Birth");

	String Occupancy_lable = getOccupancy_lable().getText();
	log.info(Occupancy_lable);
	Assert.assertEquals(Occupancy_lable, "Occupancy");

	String Fire_Hyderant_lable = getFire_Hyderant_lable().getText();
	log.info(Fire_Hyderant_lable);

	String ValidateButton = getValidateButton().getText();
	log.info(ValidateButton);
	Assert.assertEquals(ValidateButton, "Validate");
	return;
    }

    public void doBasicinformationPagevalidation(String firstname, String lastname, String address, String city,
	    int zipcode, String dateofbirth, String occupancy, String firehydrant, String state, int yearBuilt,
	    String reneovatedHome, String policyForm)
	    throws InterruptedException {

	log.info("Firstname:" + firstname);
	log.info("LastName:" + lastname);
	log.info("address:" + address);
	log.info("city:" + city);
	log.info("State" + state);
	log.info("zipcode:" + zipcode);
	log.info("dateofbirth:" + dateofbirth);
	log.info("occpancy:" + occupancy);
	log.info("fireHydrant:" + firehydrant);
	Thread.sleep(500);
	getFirstName().sendKeys(firstname);
	Thread.sleep(500);
	getLastName().sendKeys(lastname);
	Thread.sleep(500);
	getAddress().sendKeys(address);
	Thread.sleep(500);
	getCity().sendKeys(city);
	Thread.sleep(500);
	getZipcode().sendKeys(String.valueOf(zipcode));
	Thread.sleep(500);
	getDOB().sendKeys(dateofbirth);
	Thread.sleep(500);
	OccupancyPage OP = new OccupancyPage(driver);
	OP.OccupancyValues(state, occupancy);
	Thread.sleep(500);
	OP.SelectOccupancy(state, occupancy);
	Thread.sleep(500);
	List<WebElement> radioButton = driver.findElements(Fire_Hyderant);
	System.out.println(radioButton.size());
	if (firehydrant.matches("YES")) {
	    for (int i = 0; i <= radioButton.size(); i++) {
		Thread.sleep(500);
		driver.findElements(Fire_Hyderant).get(0).click();
		log.info("Entered value is YES, select FireHydrant as YES");
	    }
	} else if (firehydrant.matches("NO")) {
	    for (int i = 0; i <= radioButton.size(); i++) {
		Thread.sleep(500);
		driver.findElements(Fire_Hyderant).get(1).click();
		log.info("Entered value is NO, select FireHydrant as NO");
	    }
	} else {
	    log.info("Please provide 'YES' /  'NO' ");
	}
	Thread.sleep(500);
	getValidateButton_Click().click();
	Thread.sleep(2000);
	WebDriverWait wait = new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.visibilityOfElementLocated(selectAddressbutton));
	String lable = getSelectAddressbutton().getText();
	log.info(lable);
	if(lable.matches("Select Address")){
	    log.info("Select Address Button is present ");
		Thread.sleep(500);
	    getSelectAddressbutton().click();
	    }else{
		 log.info("Select Address Button is not present present ");
	    }
	Thread.sleep(1000);
	if(getOccupancy().getText().contains("Tenant")) {
	}
	yearbuilt yb =new yearbuilt(driver);
	yb.yearbuilt_validation(yearBuilt); Thread.sleep(500);	
	yb.Selectyearbuilt(yearBuilt);
	Thread.sleep(500);
	yb.OlderReneovatedHomeValidation(yearBuilt, reneovatedHome, state);
	Thread.sleep(500);
	PolicyForm pf = new PolicyForm(driver);
	pf.PolicyFormValues_Validation(state, occupancy, policyForm, yearBuilt);
	
	
	
	return;
    }
 
    public BasicInformationPage(WebDriver driver) {
	super(driver);
	// TODO Auto-generated constructor stub
    }

}
