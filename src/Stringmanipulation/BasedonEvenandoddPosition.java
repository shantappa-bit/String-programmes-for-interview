package Stringmanipulation;

public class BasedonEvenandoddPosition 
{
	public static void main(String[] args) 
	{
		            // 0   1    2     3     4
	//	String stmt="HOGA BEDA HUDUGI NANNA BITTU";
		String stmt="LIFE IS BEAUTIFUL";
		String[] stmt1 = stmt.split(" ");
	//String small=" ";
		for(int i=stmt1.length-1;i>=0;i--)
		{
			String abcd=stmt1[i];
			
			
			if(i%2==1) 
			{
				for(int j=abcd.length()-1;j>=0;j--)
				{
					System.out.print(abcd.charAt(j));
					
					
				}
				System.out.print(" ");
				
				
				
			}
			else
			{
				System.out.print(stmt1[i]+" ");
			}
			
			
			
			
			
			
			
			
		}
		
	}

}
