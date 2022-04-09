package testNGstudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void ValidateUserId() {
	  
	  Reporter.log("Running Test",true);
	  
  }
  @Test
  public void SampleTest() {
	  
	  Reporter.log("Running Sample Test",true);
	  
  }
  
  @BeforeMethod
  public void LoginToKite() {
	  
	  Reporter.log("Logging in....",true);
	  
  }
  
  @BeforeClass
  public void LaunchBrowser() {
	  
	  Reporter.log("Launching Browser",true);
	  
  }
  
  @AfterClass
  public void CloseBrowser() {
	  
	  Reporter.log("Closing Browser",true);
	  
  }
  
  @AfterMethod
 public void Logout() {
	  
	  Reporter.log("Logging out....",true);
	  
  }
 
}
//In testNG There is no sequence of @Test or method it takes sequenc automatically
//and execute of method  by sequencially.
//It contains no of @test or methods

//Here not compulsory to write annotations in couple order means 
//@before class and after that @after class

//it takes automatically sequence whatever it want for execution.