package test;

import access_specifier.AS1;

public class Demo extends AS1 
{
   public static void main(String[] args) 
{
		AS1 s1=new AS1();//create object of As1 class
		s1.test1();//caling public method from AS1 class
		
		Demo d=new Demo();//create object of sub class
		d.test1();//calling public method of AS1 class
		d.test3();//calling protected method of AS1 class
		//d.test2();//cant call default access specifier
		//d.test4();//cant call private access specifier
		
		
		

	}

}
