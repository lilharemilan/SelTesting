package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutStudy {
	 @Test
	  public void a() {
		  
		  Reporter.log("Running A Method",true);
	  }
	  @Test(timeOut = 1000)//we want it execute in 1000ms
	  public void c() throws InterruptedException {
		  Thread.sleep(2000);//but it takes 2000ms thats why it fails
		  Reporter.log("Running C Method",true);
	  }
	  @Test
	  public void b() {
		  
		  Reporter.log("Running B Method",true);
	  }
}
