package Interface_study;

public interface Father 
{
    void money();
    void rules();
    void look();
    default void love()
    {
    	System.out.println("Father's Love");
    }
    
    static void nature()
    {
    	System.out.println("Father's Nature");
    }
    
 
    
    
    	
    
	
}
