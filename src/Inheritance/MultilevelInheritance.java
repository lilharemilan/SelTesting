package Inheritance;

public class MultilevelInheritance {

	public static void main(String[] args) 
	{
		
		Daughter d=new Daughter();
		d.experience();//calling property from supermost class
		d.look();//calling property from superclass
		d.money();//calling property from super class
		d.mobile();//calling property from own class
		
		Daughter.nature();//calling static method from super class using subclass name
		Daughter.scooty();//calling static method from subclass using subclass name
		

	}

}
