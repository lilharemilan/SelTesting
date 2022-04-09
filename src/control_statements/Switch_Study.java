package control_statements;

public class Switch_Study {

	public static void main(String[] args) {
		
		//if my year is 
//	1:I am in 1styear of engg
//	2.i am in 2nd year of engg
//	3.I am in 3rd year of engg	
//	4.I am in 4th year of engg	
//	Please enter valid value between 1-4-->Default	

	int Year=2;	
		
	switch (Year) {
	case 1:System.out.println("I am in 1st Year of Engg  ");
	break;

	case 2:System.out.println("I am in 2nd Year of Engg");
	break;
	
	case 3:System.out.println(" I am in 3rd Year of Engg");
    break;
    
	case 4:System.out.println(" I am in 4th Year of Engg ");
	break;
	
	default:System.out.println("Please enter valid value between 1-4 ");
		break;
	}
	
	
	}

}
