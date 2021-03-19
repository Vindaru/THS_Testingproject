package com.THSpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

    // abstract class

    WebDriver driver;
    WebDriverWait wait;

//constructor 
    public Page(WebDriver driver) {
	this.driver = driver;
	this.wait = new WebDriverWait(this.driver, 15);

    }

//abstraction method 
    public abstract String getPageTitile();

    public abstract String getPageHeader(By locator);

    public abstract WebElement getElement(By locator);

    public abstract void waitfForElementPresent(By locator);

    public abstract void waitfForPageTitle(String title);

    // generics
    public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
	try {
	    return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
	} catch (Exception e) {
	    e.printStackTrace();
	    return null;
	}

    }

    public String getPageTitle() {
	// TODO Auto-generated method stub
	return null;
    }

}
