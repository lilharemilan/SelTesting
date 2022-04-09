package UtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Utility {
	 static Sheet Mysheet;
	public static String readDataFromExcel(int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream Myfile=new FileInputStream("C:\\\\Users\\\\CW\\\\selenium\\\\excelTest.xlsx");
		Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet4");
		String value = Mysheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
		return value;
		
	}
	 public static void takeScreenshot(WebDriver driver,int TCID) throws IOException 
	 {
		 
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File dest=new File("F:\\Software Testing\\Screenshot\\TC"+TCID+"Screenshot.png");
		 org.openqa.selenium.io.FileHandler.copy(src, dest);
		 Reporter.log("Screenshot taken for TC"+TCID,true);
		 
		 
	 }
	
	
	
	
	
	
	
	
	

}
