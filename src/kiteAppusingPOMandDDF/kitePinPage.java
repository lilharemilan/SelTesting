package kiteAppusingPOMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitePinPage {

	//1.
	@FindBy(id="pin") private WebElement Pin;
	@FindBy(xpath ="//button[@type='submit']") private WebElement continueButton;
	
	//2.
	 public kitePinPage(WebDriver driver) {
		 
		 PageFactory.initElements(driver,this);
		 
	 }
	
	 //3.
	 public void enterPin(String pin)
	 {
		 Pin.sendKeys(pin);
	 }
	
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
