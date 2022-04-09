package abstract_study;

public class Concrete extends Sample {

	public static void main(String[] args)
	{
       Concrete c=new Concrete();
       c.test1();
       c.test2();
       c.test3();
       c.test5();

	}

	@Override
	public void test3() {
	//this incomplete method completed in concrete class
		System.out.println("Test3 method completed in concrete class");
		
	}
	
	public void test5() 
	{
		System.out.println("Method from concrete class");
	}
	
	
	

}
