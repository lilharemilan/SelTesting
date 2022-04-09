package constructor;

public class CS4 {

	int a;//1.variable declaration
	int b;//2.variable declaration
	int c;//1. variable declaration
	
	public CS4()//zero-parameter constructor
	{
		a=100;
		b=200;
		c=300;	
		System.out.println("running zero parameter constructor");
	}
	
	public CS4(int num1)//constructor with one parameter
	{
	       a=num1;
		//int a=100;
		System.out.println("value of a is "+a);
	}
	public CS4(int num1,int num2)//constructor with two parameter
	{
	a=num1;
	b=num2;
	System.out.println("running constructor with two parameter");
	
	}
	public CS4(int num1,int num2,int num3)
	{
		a=num1;
		b=num2;
		c=num3;
		System.out.println("Running constructor with three parameteres");
	}
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("****************");
		CS4 c40=new CS4();//create object
		c40.addition();
		
		CS4 c41=new CS4(800);//create object 
		c41.addition();
		
		CS4 c42=new CS4(30, 60);
		c42.addition();
		
		CS4 c43=new CS4(10, 90, 100);
		c43.addition();
		System.out.println("**********************");
				
				
}

public void addition()
{
	int sum=a+b+c;
	System.out.println("addition is "+sum);
			
}

}

