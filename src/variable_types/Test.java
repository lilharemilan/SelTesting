package variable_types;

 public class Test
  {
 int a=90;//global non static variable
 static int b=80; //global static variable
 
	public static void main(String[] args)
	{
	Test t= new Test();//create object of test class
	int sum=10+t.a;
	System.out.println("sum is "+sum);
	int sub=100-b;
	System.out.println("sub is "+sub);
	int sub1=b-t.a;
	System.out.println("sub1 is "+sub1);
	int sum1=t.a+b;
	System.out.println("sum1 is "+sum1);
		

	}

}
