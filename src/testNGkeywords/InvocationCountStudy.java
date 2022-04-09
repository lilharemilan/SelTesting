package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountStudy {
  @Test(invocationCount = 3)
  public void a() {
	  
	  Reporter.log("Running A Method",true);
  }
  
  @AfterMethod
  public void afterMethod(){
	  
	  Reporter.log("Running After Method",true);
  }
  
  
}
//here @test running three times and also aftermthod running three
//time also with it because we use invocation count = 3

//no of times @test method run no of times after metohd run
