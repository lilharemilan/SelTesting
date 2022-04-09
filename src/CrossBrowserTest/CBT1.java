package CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBT1 {
@Parameters("browserName")
  @Test
  public void CrossBrowser(String browserName) throws InterruptedException 
{
	WebDriver driver = null;
	if(browserName.equals("chrome")) 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\CW\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
	}
	else if(browserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\CW\\selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
		
	driver.get("https://vctcpune.com/selenium/practice.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();
	
	
  }
}
