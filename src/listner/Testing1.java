package listner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 {
  
  @Test
  public void p() 
  {
	  
	  Reporter.log("Test case p is running",true);
	  
  }
  
  @Test
  
  public void q() 
  {
	  Assert.fail();
	  Reporter.log("Test case q is running",true);
	  
  }
  
  
  @Test(dependsOnMethods = {"q"})
  public void r() 
  {
	  
	  Reporter.log("Test case r is running",true);
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
