package polymorphism;

public class Overloadingstudyprac {

	public static void main(String[] args) 
	    {
		Overloadingstudyprac SBI=new Overloadingstudyprac();
		SBI.SBI_Project();
		SBI.SBI_Project(55935.650f," Milan lilhare");
		SBI.SBI_Project(30000.950f,"Milan2525",5000.250f);
		}
	
	public void SBI_Project()//method with zero parameter
	{
		String Account_Type="Saving";
		int Acc_No=123456789;
		System.out.println("Account Type is "+Account_Type);
		System.out.println("Acc No. is "+Acc_No);
    }
	
	public void SBI_Project(float Acc_Balance,String Acc_Holder_Name)
	{
		System.out.println("Acc Balance is "+Acc_Balance);
		System.out.println("Acc Holder Name is "+Acc_Holder_Name);
	}
	public void SBI_Project(float Salary,String Holder_ID,float Deposit_Money)
	{
		System.out.println("Salary is "+Salary);
		System.out.println("Holder Id is "+Holder_ID);
		System.out.println("Deposit Money is "+Deposit_Money);
	}
	
	
	
	
	
	
	
	
	
	

}
