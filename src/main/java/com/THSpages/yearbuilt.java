/**
 * 
 */
package com.THSpages;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

/**
 * @author vdaru
 *
 */
public class yearbuilt extends BasePage {

    private static Logger log = Logger.getLogger(yearbuilt.class.getName() + " ----------------------------------");

    /*
     * Occupancy page will be testing, occupancies based on states
     * 
     * - verify if occupancy label is displaying - based on states verify if all the
     * occupancies are displaying or not
     */

    private By YearBuilt = By.name("policyTerm|location|constructionYear");
    private By renevotedHomepath = By.name("policyTerm|location|olderRenovatedHome");

    public WebElement getYearBuilt() {
	return getElement(YearBuilt);
    }

    public WebElement getrenevotedHomepath() {
	return getElement(renevotedHomepath);
    }

    public void yearbuilt_validation(int yearBuilt) throws InterruptedException {

	// verity if the year built lable is displaying,
	Thread.sleep(500);
	WebDriverWait wait = new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.visibilityOfElementLocated(YearBuilt));
	getYearBuilt().clear();
	getYearBuilt().sendKeys("1400");
	// error message should displaying "Please enter a value between 1500 and 2022."
	String Yearbuilt_error = driver.findElement(By.xpath("//*[@id='addressValidator']/div[7]/label/span[2]/ul/li"))
		.getText();
	log.info(Yearbuilt_error);
	Assert.assertEquals(Yearbuilt_error, "Please enter a value between 1500 and 2022.");
	Thread.sleep(500);

    }

    public void Selectyearbuilt(int yearBuilt) throws InterruptedException {
	Thread.sleep(500);
	log.info(yearBuilt);
	WebDriverWait wait = new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.visibilityOfElementLocated(YearBuilt));
	getYearBuilt().clear();
	getYearBuilt().sendKeys(String.valueOf(yearBuilt));
	WebElement textbox = driver.findElement(YearBuilt);
	textbox.sendKeys(Keys.ENTER);

    }

    public void OlderReneovatedHomeValidation(int yearBuilt, String reneovatedHome, String state)
	    throws InterruptedException {
	Thread.sleep(1000);
	log.info(yearBuilt);

	switch (state) {
	case "AL":
	case "AZ":
	case "AR":
	case "IL":
	case "IN":
	case "OH":
	case "MO":
	case "MS":
	case "MI":
	case "NC":
	case "LA":
	case "TN":
	case "SC":

	    log.info("for State ========" + state + "           Older renevodetd home is applicable ");
	    int year = Calendar.getInstance().get(Calendar.YEAR);
	    log.info(year);
	    int builtAge = year - yearBuilt;
	    log.info(builtAge);

	    if (builtAge > 80) {
		// olderreneovatedHome is present as teh age of house is greater then 80 years
		List<WebElement> olderreneovatedHome = driver.findElements(renevotedHomepath);
		    if (reneovatedHome.matches("YES")) {
			log.info("older renevoded home is selected as YES");
			olderreneovatedHome.get(0).click();
		    } else {
			log.info("older renevoded home is selected as NO");
			olderreneovatedHome.get(1).click();
		    }
		} 
	     else {
		log.info("older renevoded home is not applicable please continue");
	    }

	    break;
	case "TX":
	case "WI":
	case "GA":
	    log.info("for State ========" + state + "           Older renevodetd home is NOT applicable ");
	    break;
	}

    }

    public yearbuilt(WebDriver driver) {
	super(driver);
	// TODO Auto-generated constructor stub
    }

}
