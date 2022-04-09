package Interface_study;

public class Final_KeywordsUse {
	
	int a=10;//global variable
	final int b=40;

	public static void main(String[] args) 
	{
		Final_KeywordsUse f=new Final_KeywordsUse();
		f.add();
		
		
		

	}
	public void add()
	{
		a=a+20;
		System.out.println("Update value of a is "+a);
		//b=b+20; in final variable we cant update value
	}

}
