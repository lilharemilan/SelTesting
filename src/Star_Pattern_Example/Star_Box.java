package Star_Pattern_Example;

public class Star_Box {

	public static void main(String[] args) 
	{
		//Ex-  * * * * *    row=5
		 //    * * * * *    coloumn=5
		 //    * * * * *
		 //    * * * * *
		 //    * * * * *
		
		
		//outer for loop use for rows (Count rows) Here row count=5
		for (int i=1;i<=5;i++)
		{
		
			//inner for loop use for coloumn (Count coloumn) Here coloumn count=5
			
		for (int j=1;j<=5;j++)
		{
			
			System.out.print("*"); //use print only
		}
		
		System.out.println(); //use print on next line
		
		}
		
		
	}

}
