package control_statements;

public class Else_if_1 {

	public static void main(String[] args) 
	{
		Else_if_1 e= new Else_if_1();
		e.testGrade();

	}
public void testGrade()
{
	//if my grade is
	//A-->%>=75
	//B-->%>=60-<=75
	//C-->%>40-<60
	//D-->Fail
	
	char grade='B';
	if (grade=='A')
	{
		System.out.println(" Your marks are >=75");
	
	}
	else if (grade=='B')
	{
		System.out.println(" Your marks are >=60 to <=75");
		
	}
	else if (grade=='C')
	{
		System.out.println(" Your marks are >40 to <60 ");
	}
	else 
	{
		System.out.println(" You are failed");
	}	
	}
	
}
