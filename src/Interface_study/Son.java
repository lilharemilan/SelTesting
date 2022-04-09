package Interface_study;

public class Son implements Father,Mother{

	public static void main(String[] args) 
	{
	Son s=new Son();
	s.money();
	s.rules();
	s.love();
	s.Honesty();
	Father.nature();//calling complete static method from interface
	Mother.nature();//calling complete static method from interface

	}

	
	@Override
	public void love() {
		//to call specific default method from super interface follow syntax
		//interfacename.super.methodname
		Father.super.love();//calling default love method from Father
		Mother.super.love();//calling super love method from Mother
		
		
	}

	@Override
	public void money() {
		
		
		System.out.println("Father's Money completed in son's class");
	}

	@Override
	public void rules() {
		
		System.out.println("Father's Rules completed in sons class");
		
	}

	@Override
	public void look() 
	{
	
	System.out.println(" Fathers Look cmpleted in sons class");
	}


	@Override
	public void Honesty() {
		System.out.println("Mother's Honesty");
		
	}


	

	

	

}
