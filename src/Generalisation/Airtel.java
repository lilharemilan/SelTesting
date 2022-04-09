package Generalisation;

public class Airtel implements TRAI 
{

	@Override
	public void call() 
	{
		System.out.println("Airtel-call-50Rs/Min");
		
	}

	@Override
	public void SMS() 
	{
		System.out.println("Airtel SMS-150SMS/Day");
		
		
		
	}

	@Override
	public void Data() 
	{
		System.out.println("Airtel Data-1GB/Day");
		
	}
	
	public void AirtelMoney()
	{
		System.out.println("Airtel-Airtel MOney");
	}

	
	
	
	
	
	
	
	
}
