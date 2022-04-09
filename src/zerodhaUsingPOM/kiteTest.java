package zerodhaUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CW\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	
	kiteLoginPage Login=new kiteLoginPage(driver);
	Login.sendUserId();
	Login.sendPassword();
	Login.clickonLoginButton();
	Thread.sleep(2000);
	
	
    kitePinPage pin=new kitePinPage(driver);
    pin.sendpin();
    pin.continueButton();
    
    Thread.sleep(2000);
    kiteHomePage home=new kiteHomePage(driver);
    home.validateuserId();
    home.clickOnLogout();
    Thread.sleep(1000);
    
    driver.close();

	
	
			
	
		
		
		
		
		
		
		
		
		
		
	}

}
