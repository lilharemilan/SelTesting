package Star_Pattern_Example;

public class Triangle_Left_Descending {

	public static void main(String[] args) {
		
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
		
		//Step 1 Count Row=5, Count Coloumn=5
		
		int star=5;
		
		for (int i=1;i<=5;i++)//outer for loop use for rows
		{
			
			for (int j=1;j<=star;j++) 
			{
				
				System.out.print("*");
			}
			
			System.out.println();
			star--;
			
			
			
		}
		
		
		
		
		
		
	}

}
