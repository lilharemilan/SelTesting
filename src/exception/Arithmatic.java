package exception;

public class Arithmatic {

	public static void main(String[] args) 
	{
		
		int a=10;
		int b=0;
		
		try 
		{
			int div=a/b;
			System.out.println(div);
		}
		catch (ArithmeticException e) 
		{
		
			System.out.println("Cannot Divide by Zero");
		}
		
		System.out.println("Hii All....");
		
	}

}
