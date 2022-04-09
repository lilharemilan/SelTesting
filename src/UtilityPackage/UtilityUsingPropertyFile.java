package UtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class UtilityUsingPropertyFile {
	
	 public static void takeScreenshot(WebDriver driver,int TCID) throws IOException 
	 {
		 
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File dest=new File("F:\\Software Testing\\Screenshot\\TC"+TCID+"Screenshot.png");
		 org.openqa.selenium.io.FileHandler.copy(src, dest);
		 Reporter.log("Screenshot taken for TC"+TCID,true);
		 
	 }
	 
	public static String getDataFromPropertyFile(String key) throws IOException 
	{
		
		Properties pro=new Properties();
		FileInputStream file=new FileInputStream("D:\\velocity eclipse\\11th_Dec_MyClass_B\\MyFile.properties");
		pro.load(file);
		String value = pro.getProperty(key);
		return value;
	
		
	}
	
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


