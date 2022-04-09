package Generalisation;

public class TestClass {

	public static void main(String[] args)
	{
		Jio j=new Jio();
		j.call();
		j.SMS();
		j.Data();
		j.JioTv();
		System.out.println("Jio SIM rate is "+TRAI.SIM);
		
		Airtel a=new Airtel();
		a.call();
		a.SMS();
		a.Data();
		a.AirtelMoney();
		System.out.println("Airtel SIM rate is"+TRAI.SIM);
		
		VI v=new VI();
		v.call();
		v.SMS();
		v.Data();
		v.D2H();
		System.out.println("VI SIM rate is"+TRAI.SIM);
		
		
		
		
		
		
		

	}

}
