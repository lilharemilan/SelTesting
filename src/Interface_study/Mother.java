package Interface_study;

public interface Mother 
{
	
	void Honesty();
	
	 static void nature()
	{
		System.out.println("Mother's Nature");
	}
	default void love()
	{
		System.out.println("Mother's Love");
	}
    

}
