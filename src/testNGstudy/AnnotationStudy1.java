package testNGstudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationStudy1 {
  @Test
  public void a() {
	  
	  Reporter.log("Running A Method",true);
  }
  @Test
  public void c() {
	  
	  Reporter.log("Running C Method",true);
  }
  @Test
  public void b() {
	  
	  Reporter.log("Running B Method",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Running Before Method",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("Running After Method",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("Running Before Class",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("Running After Class",true);
  }

}

//Note
//No of @test or Method Equals No of Before Method and After Method
//Before class and after class is run one time in a Class

//IF Multiple test cases or @test in class then it run by alphabetically order of 
//test methods name.
//
