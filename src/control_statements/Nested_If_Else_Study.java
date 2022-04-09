package control_statements;

public class Nested_If_Else_Study {
	
	// If username is correct then please enter password,if your password is correct then "login successful" welcome.
    // If Password is wrong then please check your password,else incorrect username.
			 
			public static void main(String[] args)  
			{
			String Username="Milan";
		    String Password="Milan@2525";
		    
		    if (Username=="Milan") 
		    {
		    	System.out.println(" Username is correct,Please enter password");
		    
		      if (Password=="Milan@2526")
		      {
		    	 System.out.println("Correct password, Login successfully");
		      }
		      else
		     { 
		    	 System.out.println("Please check your password");
		     }
		    }
		     else
		     {
		    	 System.out.println(" Incorrect Username "); 
		     }
	}
			
	}
		
    	
	


