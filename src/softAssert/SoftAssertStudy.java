package softAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
	
	SoftAssert s=new SoftAssert();//create object of soft assert class
	
	
  @Test
  public void Mymethod() 
 {
	  String a="Pune";
	  String b="Pune";
	  
	
	  s.assertNull(b, "b is not null");
	  s.assertEquals(a,b,"a and b are not equal");
	
	  
	 s.assertAll(); 
	  
	  
	  
  }
}
