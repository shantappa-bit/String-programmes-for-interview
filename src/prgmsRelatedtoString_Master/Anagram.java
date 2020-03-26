package prgmsRelatedtoString_Master;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
		String s1 = "veze";
		String s2 = "veek";

		char[] s3 = s1.toCharArray();
		Arrays.sort(s3);
		char[] s4 = s2.toCharArray();
		Arrays.sort(s4);

		boolean flag = false;
		
		
		boolean boo = Arrays.equals(s3, s4);
		

		if (boo) 
		{
			System.out.println("its an anagram...");
		} else {
			System.out.println("its not a anagram..");
		}
		
		
		//-------------------
//		for (int i = 0; i < s1.length(); i++) 
//		{
//
//			if (s3[i] == s4[i]) 
//			{
//
//				flag = true;
//				break;
//
//			}
//			
//
//		}

	}

}
