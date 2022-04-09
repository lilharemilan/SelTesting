package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledStudy {
	 @Test
	  public void a() {
		  
		  Reporter.log("Running A Method",true);
	  }
	  @Test(enabled = false)//we dont want this test method to execute so thats why we use enabled false
	  public void c() {
		  
		  Reporter.log("Running C Method",true);
	  }
	  @Test
	  public void b() {
		  
		  Reporter.log("Running B Method",true);
	  }
}
