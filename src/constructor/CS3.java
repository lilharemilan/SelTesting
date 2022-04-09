package constructor;

public class CS3 
{
	//This program is about to use of constructor to initalize the variable
  int a;//1.Variable Declaration
  int b;//1.Variable declaration
  

	//To initalize data member/Variable
  
  public CS3()//constructor-->Zero parameter
  {
         a=50;//2.Initalize the variable
         b=70;//2.Initalize the variable
         System.out.println("Constructor is runnig");
         System.out.println("Value of a is "+a);
         System.out.println("Value of b is "+b);
         
   }
  public static void main(String[] args) 
	{
          CS3 AA=new CS3();
          AA.addition();
     }

	public void addition()
	{
		int sum=a+b;
		System.out.println("Addition is "+sum);
		
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
