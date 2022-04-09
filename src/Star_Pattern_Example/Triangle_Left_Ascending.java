package Star_Pattern_Example;

public class Triangle_Left_Ascending {

	public static void main(String[] args) {
		
		//*
		//* *
		//* * *
		//* * * *
		//* * * *
		//step 1 count row=5 and count coloumn=5
		int star=1;//write no of star in first row
		
		for (int i=1;i<=5;i++)//outer for loop used for rows
		{
		
			for (int j=1;j<=star;j++) //inner for loop used for coloumn
			{
				System.out.print("*");
				
			}
				
				System.out.println();//after printing star goes on next line
			     star++;
		}
		
		
		
	}

}
