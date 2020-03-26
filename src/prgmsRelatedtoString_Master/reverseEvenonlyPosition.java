package prgmsRelatedtoString_Master;

public class reverseEvenonlyPosition 
{
	public static void main(String[] args) 
	{              // 0 1 2 3 4 
		String name="HUDUGI HOGU BEDA NANNA BITTU";
		String[] removed=name.split(" ");
		for(int i=removed.length-1;i>=0;i--)
		{
			String data = removed[i];
			
			if(i%2==0) 
			{
				for(int j=data.length()-1;j>=0;j--)
				{
				System.out.print(data.charAt(j));	
				}
				
			}
			else
			{
				System.out.print(" "+removed[i]+" ");
			}
			
		}
		
	}

}
