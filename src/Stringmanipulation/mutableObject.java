package Stringmanipulation;

public class mutableObject
{
	
	public static void simpleString(String s1)
	{
	s1=s1+"hello";	
	}
	
	public static void simplebuffer(StringBuffer buff)
	{
	   buff.append("@world");	
		
	}
	
	public static void simplebuilder(StringBuilder build) 
	{
		build.append("@well");
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		String original="java";//original is not chnage 
		simpleString(original);
		System.out.println("immutable object is :"+original);
		
		//
		StringBuffer buff=new StringBuffer("key");
		simplebuffer(buff);//here values buff gets changed 
		System.out.println("mutable object are "+buff);
		
		StringBuilder build=new StringBuilder("hello");
		simplebuilder(build);//here build values gets changed cz its mutable objects , means it will have impact on the object 
		System.out.println("mutable objects are :"+build);
		
	}
	

}
