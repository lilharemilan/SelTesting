package Inheritance;

public class Hierarchical {

	public static void main(String[] args) 
	{
		Son1 s1=new Son1();
		s1.mobile();//calling own method
		s1.Money();//calling superclass method using subclass object
		
		Son2 s2=new Son2();
		s2.laptop();//calling own method
		s2.Money();//calling super class method using sub class object
		
		Father.test();//calling static method
		Son1.test();
		Son2.test();
		
		
		
		
		

	}

}
