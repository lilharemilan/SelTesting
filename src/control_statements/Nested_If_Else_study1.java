package control_statements;

public class Nested_If_Else_study1 {
	
//if your account type is correct, then please enter account no if your account number is correct then you enter the otp 
//if your otp is correct then you withdrawn your money	
//if your otp is incorrect then please check your otp else incorrect account number and type	
	

	public static void main(String[] args)
	
	{
	String AccountType="Saving";
	int AccountNo=123456789;
	int OTP=223344;
	
	if (AccountType=="Saving")
	{
		System.out.println("Account Type is correct,Please enter Account No");
	
	if (AccountNo==123456789)
	{ 
		System.out.println("Account Number is correct,Please enter OTP");
	
    if (OTP==223344)
    {
    	System.out.println("Correct OTP, Withdrawn successfully!");
    }
		
    else 
    { 
    	System.out.println("Please check your OTP");
   
    }
	}
    else
    {
    	System.out.println("Please check your Account Number");
    }
	}
	else 
	{
	System.out.println("Incorrect Account Type");
	}
	
	 }

}
