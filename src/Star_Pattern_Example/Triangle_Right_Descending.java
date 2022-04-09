package Star_Pattern_Example;

public class Triangle_Right_Descending {

	public static void main(String[] args) 
	{
//		* * * * *
//		  * * * *
//		    * * *
//		      * *
//              *
//	

		int space=0; //observing first row space 
		int star=5; //observing first row star
		
		
		for (int i=0;i<=5;i++)
		{
			for (int j=1;j<=space;j++) //1st consider inner for loop for the space
			{
				System.out.print(" ");
			}
			for (int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			space++;
			star--;
				
		}
		
	
		
	}

}
