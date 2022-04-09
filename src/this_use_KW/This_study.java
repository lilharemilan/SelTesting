package this_use_KW;

public class This_study {
	
	int a=100;//non-static global variable
	static int b=200;//static global variable
	static int c=10;
	
	public static void main(String[] args) 
	{
		This_study t=new This_study();
		t.sample();
				

	}
	
	public void sample()
	{
		int b=900;
		int a=10;
		int sum=100+a;//using a=10-->local value 
		System.out.println("sum is using local variable"+sum);
		
		int sum1=100+this.a;//using a=100-->global value
		System.out.println("sum is using global value"+sum1);
		
		int sub=1000-b;//using b=900-->local value
		int sub1=1000-this.b;//using b=200-->global value
		
		System.out.println("sub is using local b is "+sub);
		System.out.println("sub is using global b is "+sub1);
		
	}
	
	public static void test1()
	{
		int c=50;
		int sum=100+c;
		//int sum1=100+this.c;we cant use this keyword in static methods
		
		
	}
	
	
	

}
