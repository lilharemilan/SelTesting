package Inheritance;

public class Rahul extends Rahul_Fathers_Money 
{

	public void Bike()
	{
	System.out.println("Rahul Bike");
	}
	
	
	
	public static void main(String[] args) 
	
	{
	Rahul HH=new Rahul();
	HH.Bike();//calling non static method
	HH.Money();

	
	
	}

}
