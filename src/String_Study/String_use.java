package String_Study;

import javax.swing.Spring;

public class String_use {

	public static void main(String[] args) 
	{
		//String a="pune";
		int a1=10;
		//String_use s=new String_use();
		
		String m="Velocity";//without using new keyword
		String m1="Velocity";
		String n=new String("Velocity");//with using new keyword
		String n1=new String ("Velocity");
		String n2=new String ("Velocity Pune");
		
		System.out.println(m==m1);//use of ==method use-compare memory location
		System.out.println(m==n);
		System.out.println(m.equals(n));//use of equals method  use-compare content 
		System.out.println(n.equals(n1));
		
		System.out.println(m.length());//length method
		System.out.println(n2.length());//if you show only one time 
		
		 int lengthofn2=n2.length();//use this type any use in future
		 System.out.println("length is "+lengthofn2);
		 
		System.out.println(n2.toUpperCase());//uppercase method
		
		String n23=n2.toUpperCase();
		
		System.out.println(n23.toLowerCase());//lowercase method
		
		String a="velocity";
		String b="Velocity";
		
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));//equal ignore case method
		
		System.out.println(a.contains("ve"));//contains method
		System.out.println(a.contains("vt"));
		System.out.println(a.contains("v"));
		
		String ab="";
		String cd=" ";
		String pq="velocity";
		System.out.println(a.isEmpty());//Empty Method
		System.out.println(ab.isEmpty());
		System.out.println(cd.isEmpty());
		
		System.out.println("ab is blank?"+ab.isBlank());//blank method
		System.out.println("cd is blank?"+cd.isBlank());
		System.out.println("length of pq is"+pq.length());//length method
		
		 char output = pq.charAt(5);//char at method
		 System.out.println("char at 5 is "+output);
		// System.out.println(pq.charAt(-1));
		// String ef=null;
		// System.out.println(ef.length());//nooperation take place because string is null
		
		String mn="Velocity";
		System.out.println(mn.startsWith("Vel"));//startswith method
		System.out.println(mn.endsWith("ty"));//end with method
		
		 String substring=mn.substring(4);//substring method
		 System.out.println("substring is "+substring);
		 
		 System.out.println(mn.substring(2,7));//substring start at index2 and end at index7
		 
		 String p="Velocity ";
		 String q="Corporate ";
		 String r="Training ";
		 String s="Center ";
		 
		 System.out.println(p.concat(q).concat(r).concat(s));//concat method use-combining the string
		 
		 String FinalString=p.concat(q).concat(r).concat(s);//concat method
		 System.out.println("combination of all string is-->"+FinalString);
		 
		 System.out.println(FinalString.indexOf('o'));//index of method use-indexing from first-which come first
		System.out.println( FinalString.lastIndexOf('T'));//last index method use-index from last
		 
		System.out.println(FinalString.replace('o', 'i'));//Replace method single char.
		
		String k= "NITIN";
		System.out.println(k.replace("NI","SA"));//Replace collection of char.
		
		String M1="I LOVE MY INIDA";
		String Seperator=" ";
		
		  
		String[] splittedstring =M1.split(Seperator);
		for (int i=0;i<=splittedstring.length-1;i++)
		{
		System.out.println(splittedstring [i]);
		}		
		
		String L1="Good_Morning_All";
		String Sep="_";
		
		 String[] output1 =L1.split(Sep);
		 
		 for (int i=output1.length-1;i>=0;i--)
		 {
			 System.out.println(output1 [i]);
		 }
		
				
				
				
		 
		 
		 
		
		
		
		
		 
		 
		
		
	
		

	}

}
