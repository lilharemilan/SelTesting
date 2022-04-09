package frameWORK;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaWithDDF {
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
			FileInputStream MyFile= new FileInputStream("C:\\Users\\CW\\selenium\\excelTest.xlsx");
			Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet4");
			
			String myUserId = Mysheet.getRow(0).getCell(0).getStringCellValue();
			String myPassword = Mysheet.getRow(0).getCell(1).getStringCellValue();
			String myPin = Mysheet.getRow(0).getCell(2).getStringCellValue();
			System.out.println(myPin);
		
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CW\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement userId = driver.findElement(By.id("userid"));
	WebElement Password = driver.findElement(By.id("password"));
	WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	
	
	userId.sendKeys(myUserId );
	Password.sendKeys(myPassword);
	LoginButton.click();
	Thread.sleep(3000);
	
	WebElement pin = driver.findElement(By.id("pin"));
	WebElement continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
	
	pin.sendKeys(myPin );
	continuebutton.click();
	Thread.sleep(2000);
	
	WebElement userid = driver.findElement(By.xpath("//span[@class='user-id']"));
	String actualUserId = userid.getText();
	String ExpectedUserId = myUserId ;
	System.out.println("user id is "+actualUserId);//for actual user id
	
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
	


		
		
		
		
	}

}
