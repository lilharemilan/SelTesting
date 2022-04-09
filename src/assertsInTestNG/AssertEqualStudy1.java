package assertsInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualStudy1 {
  @Test
  public void f() {
	  
	  String name="Milan";
	  String name1="Milan";
	  
	  Assert.assertEquals(name,name1,"name and name1 are not matching");
	  
	  
	  
	  
  }
}
