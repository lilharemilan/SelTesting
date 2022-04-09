package variable_types;

public class Employee 
{

	//name-->String
	//emp code->TM1234'1234
	//grade-->A,B,C,D-->char
	//salary-->124.12-->float
	
	String Emp_Name;//declaring global non static variable
	int Emp_code;
	char Emp_grade;
	float Emp_salary;
	
	public void Emp_info()

	{
	System.out.println(" Employee name is "+Emp_Name);
	System.out.println("Employee code is "+Emp_code);
	System.out.println("Employee grade is "+Emp_grade);
	System.out.println("Employee salary is "+Emp_salary);
	
	}
	
	public void emp_details()
	{
		
	}
	
	
}
