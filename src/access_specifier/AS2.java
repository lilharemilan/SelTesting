package access_specifier;

public class AS2 {

	public static void main(String[] args) 
	{
		AS1 s1=new AS1();//object of AS1 class
		//s1.test4();-->private members are visible only within the class
		s1.test1();//public method of aS1 class
		s1.test2();//default method of AS1 class
		s1.test3();//Protected method of AS1 class
		
        System.out.println("********************************");
		System.out.println("calling default member of AS1 class "+s1.a);
		System.out.println("Calling public member of AS1 class "+s1.b);
		System.out.println("calling protected member of AS1 class "+s1.c);
		//System.out.println("calling private member of AS1 class is not possible "+s1.d);
		
		
		
		
		
		
		
		
		
		
		

	}

}
