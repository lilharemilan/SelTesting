package control_statements;

public class Else_if_3 {
	// if your weight is <20 then you are weak
	// if your weight is >30to <40 then you are helthy
	// if your weight is >40 to <60 then you are well healthy
	//if your weighht is >60 then you are fit
	
	
	public static void main(String[] args) 
	{
	float weight=56.72f;
	if (weight<30)
	{
		System.out.println(" You are Weak");
	}
	else if (weight >30 & weight<40)
	{  
	System.out.println(" You are Healthy");	
	}
	else if (weight >40 & weight <60)
	{
		System.out.println("You are well Healthy ");
	}
	else if (weight>60)
	{
		System.out.println(" you are Fit");
	}
	else
	{
		System.out.println(" You are Underweight");
	}
	}

}
