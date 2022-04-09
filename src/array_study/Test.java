package array_study;

import java.util.Arrays;

public class Test {

	public static void main(String[] args)
	{
	String name1="Velocity";//same data type used
	String name2="Corporate";
	String name3="Training";
	String name4="Center";
	
	int Salary=50000;//different datatype it is not used in array
	
	//1.Declaration
	
	String Institute[]=new String[5];
	
	//2.Initalization
	
	Institute[0]="Velocity";
	Institute[1]="Corporate";
	Institute[2]="Training";
	Institute[3]="Center";
	
	//Usage.
//	System.out.println(Institute[0]);
//	System.out.println(Institute[1]);
//	System.out.println(Institute[2]);
//	System.out.println(Institute[3]);//we cant write print statemnt many times
	
	System.out.println("**************************");
	//for(int i=0;i<=3;i++)//so we use for loop
	{
		//System.out.println(Institute[i]);
	}
	
	//1.declaration
	char grade[]=new char[8];
	
	//2.initalization
	grade[0]='B';
	grade[1]='E';
	grade[2]='F';
	grade[3]='A';
	grade[4]='C';
	grade[5]='D';
	
	//3.usage
	//System.out.println(grade[0]);
	//System.out.println(grade[1]);
	
	//for (int i=0;i<=5;i++) //static coding
	{
	//	System.out.println(grade[i]);
	}
	
	for (int i=0;i<grade.length-1;i++) //dynamic coding
	{
	System.out.println(grade[i]);
		
	}
	
	System.out.println("*********After Sorting**********");
	
	Arrays.sort(grade);
	
	for (int i=0;i<=grade.length-1;i++)
	{
		System.out.println(grade[i]);
	}
	
	System.out.println("********sort by Descending order********");
	for (int i=grade.length-1;i>=0;i--)
	{
		System.out.println(grade[i]);
	}
	
}

}
