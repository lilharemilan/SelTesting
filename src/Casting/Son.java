package Casting;

public class Son extends Father{

	public static void main(String[] args) 
	{
		Son s=new Son();//creating object of Sons class
		s.money();
		
		
		s.Bike();//calling own property
		
		
		
		Father f=new Father();//creating object of Father class
		f.money();
		
		
		
		//creating object of subclass and giving superclass reference
	    Father f1=new Son();///upcasting operation
	    f1.money();
	    f1.mobile();
	  
   
	    
	    
	    
	    
	    //f1.bike();we cant call the method which is not common
		
	}
	
   public void money() //overrided because same method name in father and son class
	{	System.out.println("Sons have Money 1 Lakh Rs.");
		
	}
	
	
	public void mobile() //override
	{
		System.out.println("Sons Have ViVo Mobile");
	}
	
	public void Bike() 
	{
	System.out.println("Son's have own Bike Pulsar");
		
	}
	
	

}
