package Casting;

public class CastTest {

	public static void main(String[] args) 
	{
	//Implicit Casting Lower data type info into Higher data type info
		
		int a=10;
		System.out.println("Value of a is"+a);
		
	    double b=a;
	    System.out.println("Value of b is" +b);
	    
	    //explicit casting higher-->lower
	    double c=50.1234;
	    System.out.println("value of c is "+c);
	    
	    int d=(int) c;
	    System.out.println("Value of d is "+d);
		
		
		
		
		

	}

}
