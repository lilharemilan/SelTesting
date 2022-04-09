package assertsInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsEqualStudy {
  @Test
  public void AsserTest() {
	  
	  String name="VCTC";
	  String name1="VCTC1";
	  
//	  if (name.equals(name1)) 
//	  {
//		 System.out.println("TC is passed");
//	  }
//	  else
//	  {
//		System.out.println("TC is failed");  
//		
//	  }
	  
	  Assert.assertEquals(name,name1,"String not matching");
	  
	  
  }
  }