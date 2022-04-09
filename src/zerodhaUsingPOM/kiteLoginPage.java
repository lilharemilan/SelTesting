package zerodhaUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class kiteLoginPage {

	//1.Variable declaration
	//No of elements you have to handle
	
	@FindBy(id="userid") private  WebElement userId;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;
	
	//2.Use constructor-->public
	
	public kiteLoginPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//3.Method which work on Data Members
	
	public void sendUserId() 
	{
		userId.sendKeys("DAA677");
	}
	
	public void sendPassword()
	{
		Password.sendKeys("Velocity@123");
	}
	
	public void clickonLoginButton()
	{
		 LoginButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
