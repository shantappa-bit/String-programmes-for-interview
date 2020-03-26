package prgmsRelatedtoString_Master;

public class countupperandLower 
{
	public static void main(String[] args)
	{
		String name="ABCDweek";
		int count_upper=0;
		int count_lower=0;
		
		for(int i=0;i<name.length();i++)
		{
			for(char ch='A';ch<='Z';ch++) 
			{
				if(name.charAt(i)==ch) 
				{
					count_upper++;	
				}
				else
				{
					count_lower++;
				}
			}
			
			
		}
		//System.out.println(count_upper);
		System.out.println(count_lower);
		
		
		String ch1="week";
		char[] abb=ch1.toCharArray();
		for(int i=0;i<abb.length;i++)
		{
			System.out.println((int)abb[i]);
		}
	}

}
