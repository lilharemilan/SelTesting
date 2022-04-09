package kiteAppusingPOMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHOmePage {
//1.
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userId;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;
	
	//2.
		public kiteHOmePage (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
	//3.
		public void validateUserId(String Userid)
		{
			String expectedUserId = Userid;
			String actualUserId = userId.getText();
			
			if (actualUserId.equals(expectedUserId))
					{
				System.out.println("user id is matching Test case is passed");
					}
			else
			{
				System.out.println("user id is not matching Test case is failed");
			}
			
		}
		
			public void logout() throws InterruptedException
			{
				userId.click();
				logoutButton.click();
				Thread.sleep(100);
			}
			
			
			
		}
		
		
	
	
	
	
	
	
	
	
	
	

