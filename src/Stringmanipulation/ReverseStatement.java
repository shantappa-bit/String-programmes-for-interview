package Stringmanipulation;

public class ReverseStatement 
{
	public static void main(String[] args) 
	{
		String stmt="HOGA BEDA HUDUGI NANNA BITTU";
		String[] conv = stmt.split("");
		System.out.println(conv.length);
		String replaced=" ";
		for(int i=conv.length-1;i>=0;i--) 
		{
			System.out.print(conv[i]);
		}
		
		
	}

}
