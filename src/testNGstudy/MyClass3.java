package testNGstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyClass3 {
  @Test
  public void MyMethod1() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\CW\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
  }
  
  @Test
  public void MyMethod2() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\CW\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
  }
  @Test
  public void MyMethod3() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\CW\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();

}
  @Test
  public void MyMethod4() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\CW\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com/");
		driver.manage().window().maximize();
  }
}	
