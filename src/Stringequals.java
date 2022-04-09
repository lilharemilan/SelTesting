
public class Stringequals {

	public static void main(String[] args) 
	{
		String m="Vishal";
		String m1="Vishal";
		String m2="Milan";
		
		String m3=new String("Vishal Kakde");
		String m4=new String("Milan");
		String m5=new String("Vishal Kakde");
		
		
		System.out.println(m==m1);//==compare memory location
		System.out.println(m==m2);
		System.out.println(m2.equals(m4));//=compare content 
		System.out.println(m1.equals(m3));
		System.out.println(m3==m5);

	}

}
