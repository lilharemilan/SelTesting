package exception;

public class StringIndex {

	public static void main(String[] args) 
	{
		
		String name="Velocity";
		
	   try 
	    {
		   System.out.println(name.charAt(8));
		} 
	   catch (StringIndexOutOfBoundsException e)   
	   {
			System.out.println("enter charAT argument between 0-7");
	   }
	  
		
		
		
		
		
		
		
		
	}

}
