package Interface_study;

public class IC implements MyInterface{

	public static void main(String[] args)
	{
		IC ic=new IC();//create object of implementation class
		ic.test();
		ic.test1();
		ic.test2();
		ic.demo();
	}
	
	public void demo()  //own method of implementation class
	{
	System.out.println("own method of implementation class");
	}

    @Override
	public void test() 
    {
	System.out.println("Test method Completed in Implementation Class");
		
	}

	@Override
	public void test1() 
	{
	System.out.println("Test1 method Completed in Implementation Class");	
		
	}

	@Override
	public void test2() 
	{
	System.out.println("Test2 method Completed in Implementation class");
		
	}

}
