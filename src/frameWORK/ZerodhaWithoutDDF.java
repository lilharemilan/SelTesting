package frameWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaWithoutDDF {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\CW\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement userId = driver.findElement(By.id("userid"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		userId.sendKeys("DAA677");
		Password.sendKeys("Velocity@123");
		LoginButton.click();
		Thread.sleep(3000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("866918");
		continuebutton.click();
		Thread.sleep(2000);
		
		WebElement userid = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualUserId = userid.getText();
		String ExpectedUserId = "DAA677";
		System.out.println("user id is "+actualUserId);
		
		if(actualUserId.equals(ExpectedUserId))
		{
			System.out.println("User id matching Test case is Passed");
			
		}
		else
		{
			System.out.println("user id not matching Test Case is failed");
		}
		
		Thread.sleep(1000);
		
		userid.click();
		
		WebElement logoutOutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		logoutOutButton.click();
		
		driver.close();
		
		//This is static coding and hard coding bacause here id and password are fixed so thats why we 
		//check only one user acount.
		//if we have to check different different user id and password then write the script for
		//dynamic coding.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
