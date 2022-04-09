package Inheritance;

public class Akash_Ambani extends MukeshAmbaniComp
{ 
	
	public void Helicopter()
	{
		System.out.println("Akash Helicopter");
	}
	
	public static void main(String[] args) 
	{
		Akash_Ambani AA=new Akash_Ambani();
		AA.Helicopter();//calling non static method from same class
		AA.Reliance_Mart();//calling superclass properties using child class object
		AA.Reliance_Petrol_pump();//------
		AA.Reliance_jio();//------------
		
		Akash_Ambani.Reliance_Refinaries();//using subclass name calling static method from superclass
		
		
		
	}
	
}
