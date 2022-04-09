package access_specifier;

    public class AS1 
 {

	int a=10;//default global variable
	public int b=20;//public global variable
	protected int c=30;//protected global variable
	private int d=40;//private global variable
	
	public static void main(String[] args) 
	{
		AS1 s1=new AS1();
		s1.test1();// Public method-->throught the project
	    s1.test2();//Default method-->within Package-->cant accessed outside the package
		s1.test3();//protected method-->within package-->can be access outside the package used inhertiance
		s1.Test4();//private method-->only within the class
	System.out.println("******************************************");
		//variable calling
		System.out.println("Default global variable a is "+s1.a);
		System.out.println("Public global variable b is "+s1.b);
		System.out.println("Protected global variable c is "+s1.c);
		System.out.println("private global variable d is "+s1.d);
		
		
	}
	
	public void test1()
	{
		System.out.println("Public Test 1 method from AS1 class");
	}
	
	void test2()
	{
		System.out.println("Default Test2 method from AS1 class");
	}
		
	protected void test3()
	{
		System.out.println("Protected Test3 method from AS1 class");
	}
		
	private void Test4()
	{
		System.out.println("Private Test4 method from AS1 class");
	}
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 }
