package variable_types;

public class Demo {

	public static void main(String[] args) {
		
		//non static variable-->Object
		//static variable-->class-name
		//calling global variable from another class
		
		
		Global_Variable gv1= new Global_Variable();//Create object of another class
		System.out.println(gv1.a);//calling global non static variable from another class
		System.out.println(Global_Variable.b);//calling global static variable from another class
				

	}

}
