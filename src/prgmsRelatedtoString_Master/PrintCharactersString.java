package prgmsRelatedtoString_Master;

public class PrintCharactersString
{
	public static void main(String[] args)
	{
		String name="HUDUGI NANNA BITTU HOGABEDA NUN";
		String[] array=name.split(" ");
		for(int i=0;i<array.length;i++)
		{
			String rev=array[i];
			if(i==0 || i==3)
			{
				for(int j=rev.length()-1;j>=0;j--)
				{
					System.out.print(rev.charAt(j));
				}
				System.out.print(rev.length());
				System.out.print(" ");
				
			}
			else
			{
				System.out.print(array[i]+array.length+" ");
			}
		}
		
	}

}
