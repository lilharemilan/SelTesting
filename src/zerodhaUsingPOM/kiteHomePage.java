package zerodhaUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class kiteHomePage {
//1.
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userId;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;
	
	//2.
	public kiteHomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//3.
	public void validateuserId()
	{
		String actualuserId = userId.getText();
		String expecteduserId = "DAA677";
		
		
		if(actualuserId.equals(expecteduserId)) 
		{
			System.out.println("user id is matching Test case is passed");
		}
		else 
		{
			System.out.println("user id is not matching Test case is failed");
		}
		
		 }
		
		public void clickOnLogout() throws InterruptedException 
		{
		userId.click();	
		Thread.sleep(2000);
		logoutButton.click();
	
	}


		public String getActualUserId() {
		return null;
			// TODO Auto-generated method stub
			
		}
	

	
	
	
}
