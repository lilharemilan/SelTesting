package testNGstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void MyMethod1() {
	  
	   System.out.println("Welcome to Test NG1");
  }
  
  @Test
  public void MyMethod2() {
	  
	  System.out.println("Welcome to Test NG2");
	  Reporter.log("Welcome to Test NG2",true);
	  //if we want to print above statement in console also then we have 
	  //to insert true in reporter.log otherwise it will be 
	  //print in emailable report. by inserting true in repoetr.log the report
	  //show in both console and emailable report.
	  
	   
  }
  
}
