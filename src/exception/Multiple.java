package exception;

public class Multiple {

	public static void main(String[] args) 
	{
		
		int a=10;
		int b=0;
		
		try 
		{
			int div=a/b;
			System.out.println(div);
		} 
		
		catch (NullPointerException e) 
		{
			System.out.println("Can't Perferom Action on Null Value");
		}
		
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("Check String Index");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Generic Exception caught");
		}
//		
//		catch (ArithmeticException e) 
//		{
//			System.out.println("Divide by Zero is not Possible");
//		}
//		
		finally 
		{
		System.out.println("Hii Finally is executed");
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
