package constructor;

public class CS1 {
//compiler will create constructor for us-->Default Constructor

	public static void main(String[] args)
	{
		CS1 c1=new CS1();//craeting object
		c1.test1();// calling Non-static method 
		

	}
	
	public void test1()
	{
		System.out.println("Hi This is Test1 Non-Static Method");
		
	}

}
