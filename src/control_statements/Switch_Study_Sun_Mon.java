package control_statements;

public class Switch_Study_Sun_Mon {

	public static void main(String[] args) 
	{
		int Weekdays=7;
		
		switch (Weekdays) 
		{
		case 1:System.out.println("On Monday we wil play cricket");
		break;
		
		case 2:System.out.println("On Tuesday we will Play Football");
		break;
		
		case 3:System.out.println("On Wednesday we will Play Chess");
		break;
		
		case 4:System.out.println("On Thursday we will Play volleyball");
		break;
		
		case 5:System.out.println("On Friday we will Play Basketball");
		break;
		
		case 6:System.out.println("On Saturday we will Play Batminton");
		break;
		
		case 7:System.out.println("On Sunday we will go for Tracking");
		break;
		
		default:System.out.println("Please enter value between 1-7");
		break;
	
		}
		
	}

}
