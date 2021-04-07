/**
 * 
 */
package com.THStest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.THSpages.BasePage;
import com.THSpages.Page;

import excel_Utlis.ExcelUtils;
import excel_Utlis.RPM_Constant;

/**
 * @author vdaru
 *
 */
public class BaseTest extends ExcelUtils {

	private static Logger log = Logger.getLogger(BaseTest.class.getName() + " ----------------------------------");

	WebDriver driver;
	public Page page;

	String GroupID;
	String UserName;
	String Password;
	String Agencyoverride;
	String FirstName;
	String LastName;
	String RiskAddress;
	String RiskCity;
	String RiskState;
	int RiskZipcode;
	String DOB;
	String Occupancy;
	String FireHyderate;
	int YearBuilt;
	String ReneovatedHome;
	String PolicyForm;
	String ResindecyType;
	String DwellinglossSettlement;
	String PreviousAddress;
	String MailingAddressvalue;
	String MailingAddress;
	String Mailingcity;
	String Mailingstate;
	int MailingZipcode;
	String EffectiveDate;
	int RoofYear;
	int SquareFootage;
	String RoofingMaterial;
	String ConstructionType;
	int NumberofStories;
	String RoofShape;
	String RowTownhome;
	String NewPurchase; // YES or NO
	String PriorExpDate;
	String FoundationType;
	String BasmentFineshed;
	String SupplementHeat; // YES, NO
	int CoverageA;
	int CoverageB;
	int CoverageC;
	int ALEValue;
	int Liability;
	int MedPay;
	String DwellingLossSettlement;
	int AOPDeductible;
	int WindHailDeductuble;
	String PreviousLosses; // YES, NO
	String ResidenceType;
	String ShortTermRental; // YES, NO
	String PolicyNumber ;

	@BeforeMethod
	public void setUp() throws Exception {

		String log4jConfPath = "C:\\Users\\vdaru\\eclipse-workspace\\THS_Project\\src\\test\\java\\com\\THStest\\log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vdaru\\Desktop\\Desktopp\\ECLIPSE\\requried jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		log.info("Browser = Chrome opened successfully");
		driver.get(RPM_Constant.URL_UAT);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//	// excel
//		ExcelUtils.setExcelFile(RPM_Constant.Path_TestData + RPM_Constant.File_TestData, "sheet1");
//		int i, j;
//		for (j = 0; j < ExcelUtils.ExcelWSheet.getPhysicalNumberOfRows(); j++) {
//			for (int a = 2; a < ExcelUtils.ExcelWSheet.getPhysicalNumberOfRows(); a++) {
//
//				GroupID = ExcelUtils.getCellData(a, 0);
//				UserName = ExcelUtils.getCellData(a, 1);
//				Password = ExcelUtils.getCellData(a, 2);
//				Agencyoverride = ExcelUtils.getCellData(a, 3);
//				FirstName = ExcelUtils.getCellData(a, 4);
//				LastName = ExcelUtils.getCellData(a, 5);
//				RiskAddress = ExcelUtils.getCellData(a, 6);
//				RiskCity = ExcelUtils.getCellData(a, 7);
//				RiskState = ExcelUtils.getCellData(a, 8);
//				RiskZipcode = (int) ExcelUtils.getNumericCellValue(a, 9);
//				DOB = ExcelUtils.getCellData(a, 10);
//				Occupancy = ExcelUtils.getCellData(a, 11);
//				FireHyderate = ExcelUtils.getCellData(a, 12);
//				YearBuilt = (int) ExcelUtils.getNumericCellValue(a, 13);
//				ReneovatedHome = ExcelUtils.getCellData(a, 14);
//				ResindecyType = ExcelUtils.getCellData(a, 15);
//				PolicyForm = ExcelUtils.getCellData(a, 16);
//				DwellinglossSettlement = ExcelUtils.getCellData(a, 17);
//				MailingAddressvalue = ExcelUtils.getCellData(a, 18);
//				MailingAddress = ExcelUtils.getCellData(a, 19);
//				Mailingcity = ExcelUtils.getCellData(a, 20);
//				Mailingstate = ExcelUtils.getCellData(a, 21);
//				MailingZipcode = (int) ExcelUtils.getNumericCellValue(a, 22);
//				PreviousAddress = ExcelUtils.getCellData(a, 23);
//				EffectiveDate = ExcelUtils.getCellData(a, 24);
//				RoofYear = (int) ExcelUtils.getNumericCellValue(a, 25);
//				SquareFootage = (int) ExcelUtils.getNumericCellValue(a, 26);
//				RoofingMaterial = ExcelUtils.getCellData(a, 27);
//				ConstructionType = ExcelUtils.getCellData(a, 28);
//				NumberofStories = (int) ExcelUtils.getNumericCellValue(a, 29);
//				RoofShape = ExcelUtils.getCellData(a, 30);
//				RowTownhome = ExcelUtils.getCellData(a, 31);
//				NewPurchase = ExcelUtils.getCellData(a, 32);// YES or NO
//				PriorExpDate = ExcelUtils.getCellData(a, 33);
//				FoundationType = ExcelUtils.getCellData(a, 34);
//				BasmentFineshed = ExcelUtils.getCellData(a, 35);
//				SupplementHeat = ExcelUtils.getCellData(a, 36);
//				CoverageA = (int) ExcelUtils.getNumericCellValue(a, 37);
//				CoverageB = (int) ExcelUtils.getNumericCellValue(a, 38);
//				CoverageC = (int) ExcelUtils.getNumericCellValue(a, 39);
//				ALEValue = (int) ExcelUtils.getNumericCellValue(a, 40);
//				Liability = (int) ExcelUtils.getNumericCellValue(a, 41);
//				MedPay = (int) ExcelUtils.getNumericCellValue(a, 42);
////				DwellingLossSettlement = ExcelUtils.getCellData(a, 21);
//				AOPDeductible = (int) ExcelUtils.getNumericCellValue(a, 43);
//				WindHailDeductuble = (int) ExcelUtils.getNumericCellValue(a, 44);
//				PreviousLosses = ExcelUtils.getCellData(a, 45);
////				ResidenceType = ExcelUtils.getCellData(a, 46);
//				ShortTermRental = ExcelUtils.getCellData(a, 46);

				page = new BasePage(driver);
//			}
//		}
	}

	@BeforeTest
	public void beforeTest() throws Exception {

		System.out.println(
				"=========================================================================***     READY FOR AUTOMATION TESTING  ***==============================================================================================================");

	}

	@AfterTest
	public void afterTest() {
		System.out.println(
				"=========================================================================***     END OF AUTOMATION TESTING  ***==============================================================================================================");

	}

	@AfterMethod
	public void tear_Down() throws Exception {

//		driver.quit();
			log.info("Browser = Chrome opened successfully");
		}
	}

