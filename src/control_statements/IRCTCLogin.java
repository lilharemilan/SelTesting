package control_statements;

public class IRCTCLogin 
    {
//username 
//password	
// captcha 
	public static void main(String[] args) 
	{
	String Username="Velocity";
	String Password="V123";
	int Captcha=1234;

	if (Username=="Velocity")
	{
	System.out.println("Enter Password");	
	
	if (Password=="V123")
	{
	System.out.println("enter captcha");
	
	if (Captcha==1234)
	{
		System.out.println("Login Success");
	}
	else
	{
	System.out.println("Incorrect captcha");	
	}
	}
	else
	{
		System.out.println("Incorrect password");
	}
	}
	else
	{
		System.out.println(" Incorrect username");
	}
	
	
	}

}
