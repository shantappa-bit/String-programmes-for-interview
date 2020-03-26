package Stringmanipulation;

public class stringalltheway
{
	
	public static void string(String s1)
	{
		s1=s1+"mava";
		
	}
	
	public static void stringBuffer(StringBuffer s3)
	{
		
	s3.append("foreveryone");	
		
	}
	
	public static void stringBuilder(StringBuilder s1)
	{
		s1.append("hello");
	}
	

	public static void main(String[] args) 
	{
		String s1="java";
		string(s1);
		System.out.println(s1);
		
		StringBuffer buff=new StringBuffer("geeks");
		stringBuffer(buff);
		System.out.println(buff);
		
		
		StringBuilder build=new StringBuilder("special");
		stringBuilder(build);
		
		System.out.println(build);
		    
		
		
		
		
		
		
		
	}

}
