package excelSheetStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//file path is given and stoerd file in reference variable
		FileInputStream MyFile= new FileInputStream("C:\\Users\\CW\\selenium\\excelTest.xlsx");
		
		//
		//String value = WorkbookFactory.create(MyFile).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		
		//System.out.println("Data from Excel is "+value);
		
		double value1 = WorkbookFactory.create(MyFile).getSheet("Sheet2").getRow(0).getCell(2).getNumericCellValue();
		
		System.out.println("Data from Excel is "+value1);
		

}

}
