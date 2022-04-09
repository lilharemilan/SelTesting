package polymorphism;

public class OverloadingStudy {

	public static void main(String[] args) 
	{
		
		OverloadingStudy o=new OverloadingStudy();
		o.add();
		o.add(10,30);
		o.add(55.55f,66.66f);
		o.add(99.99f,22.22f);
		

	}
	
	public void add()//method with zero parameter
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
	
	public void add(int a,int b)//method with two integer parameters
	{
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
	
	public void add(float a,float b)//method with two float parameter
	{
		float sum=a+b;
		System.out.println("sum is "+sum);
		
	}
	
	
	
	
	
	
	
	
	

}
