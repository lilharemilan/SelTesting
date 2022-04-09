package assertsInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AsserNullStudy {
  @Test
  public void Null() {
	  
	  
	  String a=null;
	  
	  Assert.assertNull(a, "a is not null");
			  
	  
  }
}
