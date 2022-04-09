package exception;

public class NullException {

	public static void main(String[] args)
	{
		
		String name=null;
		
		try 
		{
			name.charAt(0);
		} 
		catch (NullPointerException e) 
		{
			System.out.println("Cant Perfrom action on null value");
		}
		
		System.out.println("Hiii...All");
		
		
		
		
		
		
		

	}

}
