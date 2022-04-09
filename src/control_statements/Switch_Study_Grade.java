package control_statements;

public class Switch_Study_Grade {

	public static void main(String[] args) 
	{
     char Grade='A';
     
     switch (Grade) 
     {
     case 'A':System.out.println(" Your Marks >=75");
	 break; 
	 
     case 'B':System.out.println(" Your Marks between 60-75");
     break;
     
     case 'C':System.out.println(" Your Marks between 50-60");
     break;
     
     case 'D':System.out.println(" Your Marks between 40-50");
     break;
     
     default:System.out.println("Please enter value between A-D");
	 break;
	}


	}

}
