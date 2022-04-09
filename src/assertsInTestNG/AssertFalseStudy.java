package assertsInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalseStudy {
  @Test
  public void Testing() {
	  
	  boolean result=false;
	  
	  Assert.assertFalse(result,"Result is true");
	  
	  
  }
}
