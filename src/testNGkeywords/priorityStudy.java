package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priorityStudy {
	 @Test(priority = 1)
	  public void a() {
		  
		  Reporter.log("Running A Method",true);
	  }
	  @Test(priority = -2)
	  public void c() {
		  
		  Reporter.log("Running C Method",true);
	  }
	  @Test(priority = 1)
	  public void b() {
		  
		  Reporter.log("Running B Method",true);
	  }
}
