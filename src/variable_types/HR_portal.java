package variable_types;

public class HR_portal {

	public static void main(String[] args) 
	{
		Employee MilanT= new Employee();//created object of employee
		
		MilanT.Emp_Name="K.L. Rahul";
		MilanT.Emp_code=10;
		MilanT.Emp_grade='A';
		MilanT.Emp_salary=197852.5686f;

		Employee Sourabh=new Employee();
	    Sourabh.Emp_Name="Jaspreeet Bumrah";
	    Sourabh.Emp_code=6;
	    Sourabh.Emp_grade='B';
	    Sourabh.Emp_salary=456852.5864f;
	    
	    MilanT.Emp_info();
	    Sourabh.Emp_info();
		
	}
	

}
