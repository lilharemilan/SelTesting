package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.Base;
import UtilityPackage.Utility;
import kiteAppPOMClasses.kiteLoginPage;

public class kiteAppUserIdErrorMsgValidation extends Base 
{
	kiteLoginPage login;
	@BeforeClass
	public void LaunchBrowser()
	{
		launchBrowser();
		login=new kiteLoginPage(driver);
		
	}
	
	@BeforeMethod
	public void LoginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.enterPassword(Utility.readDataFromExcel(0, 1));
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	}
	
	@Test
	public void validateUserIDErrorMsg() throws EncryptedDocumentException, IOException 
	{
		int TCID=25;
		String expectedUserIDErrorMsg = Utility.readDataFromExcel(0, 3);
		String actualUserIDErrorMsg = login.getUserIdErrorMsg();
		Assert.assertEquals(expectedUserIDErrorMsg, actualUserIDErrorMsg,"Error Msg Is not Matching" );
		Utility.takeScreenshot(driver,TCID);
		
	}
	
	@AfterClass
	public void closingBrowser()
	{
	       closeBrowser();
	}
	
	
	
	
	
	
}
