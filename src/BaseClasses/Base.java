package BaseClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base{
	protected WebDriver driver;
   public void launchBrowser()
   {
	   System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CW\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();//for disable notif
		opt.addArguments("--disable-notificatons");//for disable notifi
		 driver=new ChromeDriver(opt);
		 
		 driver.get("https://kite.zerodha.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 driver.manage().window().maximize();
		 Reporter.log("Launched Browser Successfully",true);
	   
   }
   
   public void closeBrowser() 
   {
	  driver.close();
	  Reporter.log("Browser Closed Successfully",true);
	   
	   
   }
   
   
   
   
   
}
