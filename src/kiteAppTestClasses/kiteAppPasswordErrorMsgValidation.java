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

public class kiteAppPasswordErrorMsgValidation extends Base {
	kiteLoginPage login;
	@BeforeClass
	public void launchingBrowser()
	{
	launchBrowser();
	login=new kiteLoginPage(driver);
	
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.enterUserId(Utility.readDataFromExcel(0, 0));
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
	}
	
	@Test
	
	public void validatePasswordErrorMsg() throws EncryptedDocumentException, IOException
	{
		int TCID=26;
		String expectedPasswordErrorMsg = Utility.readDataFromExcel(0, 4);
		String actualPasswordErrorMsg = login.getPasswordErrorMsg();
		
		Assert.assertEquals( expectedPasswordErrorMsg,actualPasswordErrorMsg,"Error Msg is not matching");
		Utility.takeScreenshot(driver,TCID);
		
	}
	
	@AfterClass
	public void closingBrowser()
	{
		closeBrowser();
	}
	
	
	
	
	
	
	
	
	
	
	
}
