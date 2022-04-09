package KitePOMTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTestUsingTestNG {
	WebDriver driver;
	Sheet Mysheet;
	 kiteLoginPage login;
	 kitePinPage pin;
	 kiteHOmePage home;
	
	@BeforeClass
		public void launchBrowser() throws EncryptedDocumentException, IOException {
		Reporter.log("Launching Browser",true);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CW\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();//for disable notif
		opt.addArguments("--disable-notificatons");//for disable notifi
		driver=new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		Reporter.log("Launching Browser Successfully",true);
		
		FileInputStream Myfile=new FileInputStream("C:\\\\Users\\\\CW\\\\selenium\\\\excelTest.xlsx");
		 Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet4");
		
		    login=new kiteLoginPage(driver);
		    pin=new kitePinPage(driver);
		    home=new kiteHOmePage(driver);
		    
		 
		 
	}
	
	@BeforeMethod
	public void loginToKiteApp() 
	{
		String USERID = Mysheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = Mysheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = Mysheet.getRow(0).getCell(2).getStringCellValue();
		
	    login=new kiteLoginPage(driver);
	    pin=new kitePinPage(driver);
	    home=new kiteHOmePage(driver);
	    
	    Reporter.log("Entering UserId and Password",true);
	    login.enterUserId(USERID);
	    login.enterPassword(PWD);
	    login.clickOnLoginButton();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	    
	    Reporter.log("Entering Pin",true);
	    pin.enterPin(PIN);
	    pin.clickOnContinueButton();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	}
	
	@Test
	
	public void validateUserID() {
		
		Reporter.log("Validate UserID",true);
	String expectedUserID = Mysheet.getRow(0).getCell(0).getStringCellValue();
	String actualUserID = home.getActualUserID();
	
	Assert.assertEquals(actualUserID,expectedUserID,"actualUserId and expectedUserID is not matching");
	Reporter.log("User ID is validate Successfully,Test case is Passed",true);
	
	}
	
	@AfterMethod
	public void logoutFromKiteApp() throws InterruptedException {
		
		Reporter.log("logging out..",true);
		home.logout();
		
	}
	
	@AfterClass
	public void closeBrowser() 
	{
		Reporter.log("Closing Browser",true);
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
