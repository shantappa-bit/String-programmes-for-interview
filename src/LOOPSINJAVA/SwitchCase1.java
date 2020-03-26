package LOOPSINJAVA;

public class SwitchCase1 
{
	public static void main(String[] args) 
	{
		//int a=10; its allowed 
		//double a=12.12; not allowed
		short a=12;//its allowed 
		byte b=2;//byte is also allowed over here 
		//long l=233; not allowed 
		//float f=12.13f; not allowed 
		//char ch='a'; its allowed 
	//	boolean b4=true;//not allowed 
		//String value="hello";//allowed here 
	//	Integer i1=10; its also allowed  here implicitly conv from 10 to corresponding wrapper class 
		
		
		
		switch(10)
		{
		    case 10:
			System.out.println("the value is 1");
			break;	
			
		    default :
				System.out.println("im default statement only ..");
				
		
		}
		
	}

}
