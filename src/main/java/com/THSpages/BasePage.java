package com.THSpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page {

	public BasePage(WebDriver driver) {
		super(driver);

	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		return getElement(locator).getText();
	}

	@Override
	public String getportalUserPreferencesbutton(By locator) {
		return getElement(locator).getText();
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			return element;
		} catch (Exception e) {
			System.out.println("Unknown Error occured while 'creating' element " + locator.toString());
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public void waitfForElementPresent(By locator) {

		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
			ExpectedConditions.invisibilityOfElementLocated(locator);
		} catch (Exception e) {
			System.out.println("Unknown Error occured  while 'waiting' for element " + locator.toString());
		}

	}

	@Override
	public void waitfForPageTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
		} catch (Exception e) {
			System.out.println("Unknown Error occured while waiting for title " + title);
		}

	}

	@Override
	public String getPageTitile() {
		// TODO Auto-generated method stub\
		return driver.getTitle();
	}

//    @Override
//    public String getPageTitile() {
//	// TODO Auto-generated method stub
//	return driver.getTitle();
//    }

}
