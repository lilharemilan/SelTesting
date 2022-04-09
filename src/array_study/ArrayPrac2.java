package array_study;

import java.util.Arrays;

public class ArrayPrac2 {

	public static void main(String[] args)
	{
		
		double salaryofChandu=2500.35d;
		double salaryofmilan=5423.25d;
		double salaryofvishalj=6542.25d;
		double salaryofVishalk=5642.23d;
		
		double monthSalary[]=new double[4];//declaration
		monthSalary[0]=2500.35d;//value initalize
		monthSalary[1]=5423.25d;
		monthSalary[2]=6542.25d;
		monthSalary[3]=5642.25d;
		
		
		System.out.println("Salary of employee");
		
		//for (double i=0;i<=3;i++)
		{
			//System.out.println(monthSalary[(int) i]);
		}
		
		for (double i=0;i<=monthSalary.length-1;i++)
		{
			System.out.println(monthSalary[(int) i]);
		}
		
		Arrays.sort(monthSalary);
		System.out.println("**After Sorting**");
		for(double i=0;i<=monthSalary.length-1;i++)
		{
			System.out.println(monthSalary[(int) i]);
		}
		System.out.println("****descending***");
		for(double j=monthSalary.length-1;j>=0;j-- )
		{
			System.out.println(monthSalary[(int) j]);
		}
		
		
		
		
		
		
		
		
		

	}

}
