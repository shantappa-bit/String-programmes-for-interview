package prgmsRelatedtoString_Master;

public class ODdevencountString
{
	public static void main(String[] args)
	{
		String name="HOGA BEDA HUDUGI NANNA BITTU";
		String[] array = name.split(" ");
		int count_odd=0;
		int count_even=0;
		
		for(int i=array.length-1;i>=0;i--)
		{
			String local=array[i];	
			if(i%2==0)
			{
				
				
					count_even++;	
				
			}
			else
			{
				count_odd++;	
			}
			
			
		}
		System.out.println("Number of even are :"+count_even+" Odd are :"+count_odd);
	}

}
