package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClasses.Base;
import UtilityPackage.Utility;
import kiteAppPOMClasses.kiteLoginPage;

public class kiteUserIDandPassWordErrorMsg extends Base 
{
	kiteLoginPage login;
	SoftAssert s=new SoftAssert();
	@BeforeClass
 public void launchingBrowser() 
 {
	 launchBrowser();
	 login=new kiteLoginPage(driver);
 }
	@BeforeMethod
	public void logintokiteApp()
	{
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		
	}
	
	@Test()
	public void validateUserIDErrorMsg() throws EncryptedDocumentException, IOException
	{
		int TCID=55;
		String expectedUserIDErrorMsg = Utility.readDataFromExcel(0,3);
		String actualUserIDErrorMsg = login.getUserIdErrorMsg();
		
		s.assertEquals(expectedUserIDErrorMsg,actualUserIDErrorMsg,"ExpUID and ActUID Error Msg not matching");
		s.assertAll();
		
		Utility.takeScreenshot(driver,TCID);
		
	}
	
	@Test
	public void validatePasswordErrorMsg() throws EncryptedDocumentException, IOException 
	{
		int TCID=56;
		String expectedPasswordErrorMsg = Utility.readDataFromExcel(0,4);
		String actualPasswordErrorMsg = login.getPasswordErrorMsg();
		
		s.assertEquals(expectedPasswordErrorMsg,actualPasswordErrorMsg,"ExpPwd and ActPwd Error msg not matching" );
        s.assertAll();	
        
        Utility.takeScreenshot(driver, TCID);
        
        
      
	}
	
	@AfterClass
	public void closingBrowser()
	{
		closeBrowser();
	}
	
	
	
	
	
	
	
	
}
