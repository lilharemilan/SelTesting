package waitOrSynchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableUse {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CW\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	WebElement signInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		signInButton.click();
		Thread.sleep(2000);
		
		WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		
		System.out.println(getOTPButton.isEnabled());
		
		boolean result = getOTPButton.isEnabled();
		
		System.out.println("getOTPButton ststus is"+result);
		
		if(result)
		{
			System.out.println("Get OTP Button is enabled");
			getOTPButton.click();
		}
		
		else {
			
			
			driver.findElement(By.id("mobileNumber")).sendKeys("8793680867");
			Thread.sleep(100);
			getOTPButton.click();
			System.out.println("clicked on get OTP button");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
