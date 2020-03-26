package prgmsRelatedtoString_Master;

public class REVERSEONLYSPECIFCWORDS 
{
	public static void main(String[] args) 
	{
		String name="HOGA BEDA HUDUGI NANNA BITTU";
		String[]  array=name.split(" ");
	//	String rev1="";
		for(int i=array.length-1;i>=0;i--)
		{
			String rev=array[i];
			
			if(i%2==1)
			{
				for(int j=rev.length()-1;j>=0;j--)
				{
					System.out.print(rev.charAt(j));
				}
				System.out.print(" ");
				
			}
			else
			{
				System.out.print(array[i]);
				
			}
			System.out.print(" ");
			
			
			
		}
		
		
		
		
	}

}
