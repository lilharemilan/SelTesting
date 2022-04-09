package KitePOMTestNG;

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
		
		
		//3.Methods
			
			public void enterUserId( String uid)
			{
				userId.sendKeys(uid);
				
			}
			
			public void enterPassword( String pwd)
			{
				Password.sendKeys(pwd);
			}
			
			public void clickOnLoginButton()
			{
				LoginButton.click();
			}
		
		
}
		
		
		
		
		
		
		