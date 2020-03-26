package prgmsRelatedtoString_Master;

public class rEVERSEFULLStatement {

	public static void main(String[] args) 
	{
		String name="HOGA BEDA HUDUGI NANNA BITTU";
		String[] space=name.split(" ");
		String replace="";
		for(int i=space.length-1;i>=0;i--) 
		{
			replace=replace+space[i]+" ";
			
		}
		System.out.print(replace);
		

	}

}
