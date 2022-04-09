package variable_types;

public class Global_Variable1prac 
{

  static String Hotel_Name="Hotel Star";//global static variable 
  int One_plate_Poha_Rs=20;//global non static variable
  int One_cup_chai_Rs=10;//global non static variable
  int One_Plate_Dosa_Rs=25;
  static int Idli_Rs=20;//global static varible
	

  public static void main(String[] args) 
	{
	  System.out.println("***********************");
	  System.out.println("Name of Hotel "+Hotel_Name);//CALLING GLOBAL STATIC VARIABLE
      System.out.println("***********************");
      System.out.println("List of Breakfast Items");
      
      Global_Variable1prac HS=new Global_Variable1prac();//create obejct for calling non static variable
      System.out.println("Rs of One Plate Poha = "+HS.One_plate_Poha_Rs);//calling Global Non Static Variable
      System.out.println("Rs of One Cup Chai = "+HS.One_cup_chai_Rs);
      System.out.println("Rs of One Plate Dosa = "+HS.One_Plate_Dosa_Rs);
      System.out.println("========================");
      
      System.out.println("List of Thali");
      HS.Menu();//calling non satatic method
      Menu1();//calling static method
      System.out.println("========================");
      
      }
  
  public void Menu()
	{
		int Veg_Thali_Rs=60;//local variable
		System.out.println("Rs of Veg Thali = "+Veg_Thali_Rs);
		
		
		
	}
	
	public static void Menu1()
	{
		int Punjabi_Thali_Rs=70;
	    int Nonveg_Thali_Rs=100;
	    System.out.println("Rs of Punjabi Thali = "+Punjabi_Thali_Rs);
	    System.out.println("Rs of Nonveg Thali = "+Nonveg_Thali_Rs);
	    
	    
	}
	
	
	

}
