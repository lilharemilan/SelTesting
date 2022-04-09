package listner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(listner.Listner.class)
public class Testing {
  @Test
  public void a() 
  {
	  
	  Reporter.log("Test case a is running",true);
	  
  }
  
  @Test
  
  public void b() 
  {
	  Assert.fail();
	  Reporter.log("Test case b is running",true);
	  
  }
  
  
  @Test(dependsOnMethods = {"b"})
  public void c() 
  {
	  
	  Reporter.log("Test case c is running",true);
	  
  }
  
  
  
  
  
}
