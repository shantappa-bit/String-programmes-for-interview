package Stringmanipulation;

public class COuntVowels
{
	public static void main(String[] args) 
	{
		String root="java mava mava";
		//String[] conv = root.split(" ");
		int count = root.length();
		int count1=0;
		
		for(int i=0;i<count;i++)
		{
			char store = root.charAt(i);
			if(store=='a' || store=='e' || store=='i' || store=='o' || store=='u') 
			{
			count1++;	
			}
			
			
			
		}
		System.out.println("Number of vowels are :"+count1);
		
		
		
	}

}
