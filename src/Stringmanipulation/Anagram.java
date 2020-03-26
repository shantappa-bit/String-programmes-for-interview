package Stringmanipulation;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
		String abb="vapa";
		String arr="papa";
		int count1=abb.length();
		int count2=arr.length();
		boolean flag=false;
		
		
		
		for(int i=0;i<4;i++) 
		{
			if(abb.charAt(i)==arr.charAt(i)) 
			{
				
			flag=true;	
			}
			
		}
		
		if(flag)
		{
			System.out.println("Its a anagram..");
		}
		else
		{
			System.out.println("its not a anagram..");
		}
		
		
		
		
		
	}

}
