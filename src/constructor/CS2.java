package constructor;

public class CS2 {
	public CS2()//This is user defined zero parameter constructor
	{
		System.out.println("Running zero prameter constructor");
	}

	public static void main(String[] args) 
	{
	CS2 c2=new CS2();//creating object of class
	c2.test1();//calling non static method

	}
	
	public void test1()// This is non static method
	{
		System.out.println("Non Static method test1 is called");
	}

}
