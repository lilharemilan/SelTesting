package Casting;

public class Rahul_Gandhi extends SoniaGandhi 
{

	public static void main(String[] args)
	{
		SoniaGandhi SG=new SoniaGandhi();//creating object of Sonia Gandhi class
		SG.Bungalow();
		SG.Congress_Party();
		SG.All_Assets_Price();
		
		Rahul_Gandhi RG=new Rahul_Gandhi();//creating object of Rahul Gandhi class
		RG.Bungalow();
		RG.Congress_Party();
		RG.Bank_Balance();
		
		 SoniaGandhi RG1=new Rahul_Gandhi();//Upcasting with reference Soniagandhi.
		 RG1.Bungalow();
		 RG1.Congress_Party();
		
}
	
	public void Bungalow()
	{
		System.out.println(" Rahul Gandhi have Own Bungalow");
		
	}
	
	public void Congress_Party()
	{
		
	System.out.println("Leader of Congress Party");
	}
	
	public void Bank_Balance() 
	{
		int SBI=500;
		float PNB=250.65f;
		int BOB=1000;
		
		float Sum=SBI+PNB+BOB;
		System.out.println("Total Bank Balance in Crore"+Sum);
		
	
	}
	
	
	

}
