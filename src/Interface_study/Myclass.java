package Interface_study;

public class Myclass implements Interface2
{

	public static void main(String[] args) 
	{
	Myclass m=new Myclass();
	m.m1();
	m.m2();
	m.m3();
	m.m4();

	}

	@Override
	public void m1() {
		
		System.out.println (" m1 from interface1 completed in implementation class");
	}
	

	@Override
	public void m2() {
		System.out.println("m2 from interface 1 completed in implementation class");
		
	}

	@Override
	public void m3() {
		
		System.out.println("m3 from interface2 completed in implementation class");
	}

	@Override
	public void m4() {
		
		System.out.println("m4 from interface2 completed in implementtation class");
	}

}
