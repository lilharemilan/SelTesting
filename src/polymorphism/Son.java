package polymorphism;

public class Son extends Father {

	public static void main(String[] args) 
	{
		Father f=new Father();//Super class object
		Son s=new Son();//subclass object
		
	    f.Money();
	    s.Money();
	
		
		
		

	}
	//overriding super class method
	
	public void Money()
	{
		System.out.println (" Son's Money 12K ");
	}
	

}
