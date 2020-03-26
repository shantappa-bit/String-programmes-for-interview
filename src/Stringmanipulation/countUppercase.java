package Stringmanipulation;

public class countUppercase 
{
public static void main(String[] args) 
{
	String arr="JAVa MAven";
	int count = arr.length();
	int count123=0;
	
	for(int i=0;i<count;i++)
	{
		char conv = arr.charAt(i);
		if(conv>='A' && conv<='Z') 
		{
			count123++;	
		}
	}
	System.out.println(count123);
	
}	

}
