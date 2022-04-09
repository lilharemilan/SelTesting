package variable_types;

       public class PracEx1 {
       static int a=40;//static global variable

	   public static void main(String[] args) 
	   {
		//calling static global variable from same class
		   System.out.println("value of a is "+a);
        //calling static global variable from another class
		   System.out.println("value of p is "+PracEx2.p);
	}

}
