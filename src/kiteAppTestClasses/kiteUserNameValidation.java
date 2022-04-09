package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.Base;
import UtilityPackage.Utility;
import kiteAppPOMClasses.kiteHomePage;
import kiteAppPOMClasses.kiteLoginPage;
import kiteAppPOMClasses.kitePinPage;

public class kiteUserNameValidation extends Base{

   kiteLoginPage login;
   kitePinPage pin;
   kiteHomePage home;
   
	@BeforeClass
	public void broeserLaunch()
	{
		launchBrowser();
		login=new kiteLoginPage(driver);
		pin=new kitePinPage(driver);
		home=new kiteHomePage(driver);
		
	}
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.enterUserId(Utility.readDataFromExcel(0, 0));
		login.enterPassword(Utility.readDataFromExcel(0, 1));
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.enterPin(Utility.readDataFromExcel(0, 2));
		pin.clickOnContinueButton();
		
	}
	
	@Test
	public void validateUserName() throws EncryptedDocumentException, IOException 
	{
		int TCID=100;
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		String expectedUserID = Utility.readDataFromExcel(0, 0);
		String actualUserID = home.getActualUserID();
		
		Assert.assertEquals(expectedUserID,actualUserID,"ExpectedUserID and ActualUserID is not matched");
		Reporter.log("ValidateUserName",true);
		
		Utility.takeScreenshot(driver,TCID);
		

		
	}
	@AfterMethod
	public void logoutFromKiteApp() throws InterruptedException 
	{
		home.logout();
		Reporter.log("Logging out",true);
		
	}
	
	@AfterClass
	public void closingBrowser() 
	{
		closeBrowser();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
}
