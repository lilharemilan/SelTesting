package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.BaseUsingPropertyFile;
import UtilityPackage.Utility;
import UtilityPackage.UtilityUsingPropertyFile;
import kiteAppPOMClasses.kiteHomePage;
import kiteAppPOMClasses.kiteLoginPage;
import kiteAppPOMClasses.kitePinPage;

public class KiteAppUserNameValidationUsingPropertyFile extends BaseUsingPropertyFile {
 
	 kiteLoginPage login;
	 kitePinPage pin;
	 kiteHomePage home;
	 
	 int TCID=99;
	
	
	@BeforeClass
  public void launchingBrowser() throws IOException 
  {
	  
	  launchBrowser();
	  login=new kiteLoginPage(driver);
	   pin = new kitePinPage(driver);
	   home=new kiteHomePage(driver);

}
  
  @BeforeMethod
  public void loginToKiteApp() throws IOException
  {
	  login.enterUserId(UtilityUsingPropertyFile.getDataFromPropertyFile("UN"));
	  login.enterPassword(UtilityUsingPropertyFile.getDataFromPropertyFile("PWD"));
	  login.clickOnLoginButton();
	 
	  pin.enterPin(UtilityUsingPropertyFile.getDataFromPropertyFile("PIN"));
	  pin.clickOnContinueButton();
	  
  }
  
  @Test
  public void validateUserID() throws IOException
  {
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  String expectedUSerID = UtilityUsingPropertyFile.getDataFromPropertyFile("UN");
	 String actualUserID = home.getActualUserID();
	 Assert.fail();//here we do fail the method baecause to take SC of failed test case
	 
	 Assert.assertEquals(expectedUSerID, actualUserID,"Exp And Act userID are not matching");
    // Utility.takeScreenshot(driver, TCID);	 
	  
  }
  
  @AfterMethod
  public void logoutFromKiteApp(ITestResult result) throws InterruptedException, IOException
  {
	  // use this syntax to take screenshot of failure test case after method 
	  if(result.getStatus()==result.FAILURE)//if we want to take scrreshot of failure test case then use this method or syntax
	  {
		  UtilityUsingPropertyFile.takeScreenshot(driver, TCID);
	  }
	  else
	  {
		  Reporter.log("****TC is Passed****",true);
	  }
	  
	  home.logout();
	 
  }
  
  
  @AfterClass
  public void closingBrowser()
  {
	 
	  closeBrowser();
  }
  
  
  
  
  
  
  
  
  
  
  
  
}