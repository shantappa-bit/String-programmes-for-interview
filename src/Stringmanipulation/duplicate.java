package Stringmanipulation;

public class duplicate
{
	public static void main(String[] args)
	{
		String name="HOGA BEDA HUDUGI NANNA BITTU";
		String[]array=name.split(" ");
		for(int i=array.length-1;i>=0;i--) 
		{
			String abb=array[i];
			if(i%2==1) 
			{
				for(int j=abb.length()-1;j>=0;j--) 
				{
					System.out.print(abb.charAt(j));
				}
				System.out.print(" ");
				
			}
			else
			{
				System.out.print(array[i]+" ");
			}
			
		}
		
	}

}
