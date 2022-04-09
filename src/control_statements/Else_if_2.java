package control_statements;

public class Else_if_2 {

	public static void main(String[] args)
	{
    Else_if_2 HH= new Else_if_2();//create object for calling non static method
    HH.Buy();//calling non static method
	}
	//if i have 20Rs then i will buy mango
	//if i have 30Rs then i will buy banana
	//if i have 40Rs then i will buy orange
	//if i have 50rs then i will buy apple
	
	public void Buy()
{
	int Rs=30;
	if (Rs==20)
	{
		System.out.println(" I will buy Mango");
	}
	else if (Rs==30)
	{
		System.out.println(" I will buy Banana");
	}
	else if (Rs==40)
	{
		System.out.println("I will buy Orange");
	}
	else if (Rs==50)
	{
		System.out.println(" I will buy Apple");
	}
	else
	{
		System.out.println("I will not buy");
	}
	

}
	
	
}
