package constructor;

public class Variable_call 
{
int a=10;//1.2-->non static variable
static int b=20;//static variable
String name="velocity";

	public static void main(String[] args)
	{
	Variable_call v=new Variable_call();//creating object
	
	System.out.println("Value of variable a is "+v.a);//calling non static variable
	System.out.println("Value of variable b is "+b);//calling static variables
	System.out.println("value of name is "+v.name);
	
	

	

	}

}
