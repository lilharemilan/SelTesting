package this_use_KW;

public class This_Study_Prac
{
    int a=10;//non static global variable
    int b=20;//non static global variable
    static int c=30;//static global variable
    String Name="Milan";//non static global variable
	
	public static void main(String[] args) 
	{
	This_Study_Prac MM=new This_Study_Prac();
	MM.sample();

	}
	
	public void sample() 
	{
		int a=40;//local variable
		int b=50;
		int c=60;
		String Name="Venky";
		int sum=100+a;//sum using local variable a=10
		int sum1=200+b;//sum using local variable b=20
		int sum2=300+c;//sum using local variable c=30
		System.out.println("sum is using local variable "+ sum);
		System.out.println("sum is using local variable "+ sum1);
		System.out.println("sum is using local variable "+ sum2);
		
		String Friends=" Rahul & "+Name;
		String Classmates=" Saurabh & "+this.Name;
		System.out.println("Freinds are"+Friends);
		System.out.println("Classmates are "+Classmates);
	
		
		int sum3=400+this.a;//using a=100 global value
		System.out.println("sum is using global value "+sum3);
		int sub=500-this.b;
		System.out.println("sub is using global value "+sub);
		
	}
	
	
	
	
	

}
