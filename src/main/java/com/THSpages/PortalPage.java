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
public class PortalPage extends BasePage{

    

   /*
    *  verify page title, 
    *  verify header :  "WELCOME TO TOWER HILL'S AGENT PORTAL"
    *  verify buttons avaliable :  Personal Lines Portal, Commercial Lines Portal and Agent Dashboard
    *  click on Personal Loines Portal
    */
   
    private By header = By.xpath("//*[@id='product-title']");
    private By PersonalLinesPortal = By.xpath("//*[@id='application-container']/div[2]/div/div/div[1]/form/button");
   	
   public WebElement getHeader() {
       return getElement(header);
   }
   public String getPortalPageTitle() {
       return getPageTitle();
    }
   public String getPortalPageHeader() {
       return getPageHeader(header);
   }
   
   public WebElement getPersonalLinesPortal() {
       return getElement(PersonalLinesPortal);
   }
   
   public HomePage PLP_CLICK() {
	
       
       getPersonalLinesPortal().click();

  	// get instance 
  	return getInstance(HomePage.class);
  	
      }
   public PortalPage(WebDriver driver) {
   super(driver);
   	   		
 }
}
