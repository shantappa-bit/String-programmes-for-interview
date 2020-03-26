package prgmsRelatedtoString_Master;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		//approach number 1
		String name="JAVA";
		int count=name.length();
		String empty="";
		for(int i=count-1;i>=0;i--)
		{
			empty=empty+name.charAt(i);
			
		}
		System.out.print("1nd approach "+empty);
		
		//approach 2
		
		String name1="JAVA";
		int count1=name1.length();
		char[]abb=name1.toCharArray();
		String empty1="";
		for(int i=abb.length-1;i>=0;i--)
		{
			empty1=empty1+abb[i];
		}
		System.out.println();
		System.out.print("2nd approach "+empty1);
		
		//approach 3
		String name3="JAVA";
		StringBuffer buff=new StringBuffer(name3);
		StringBuffer reversed=buff.reverse();
		System.out.println();
		System.out.print("Third apparocah is :"+reversed);
		
		//approach 4 is 
		String name4="JAVA";
		StringBuilder build=new StringBuilder(name4);
		StringBuilder reve = build.reverse();
		System.out.println();
		System.out.println("fourth approach is :"+reve);
		
		//fifth apparoch is 
		String name5="JAVA";
		StringBuilder build2=new StringBuilder();
		 build2.append(name5);
		 StringBuilder reversed2 = build2.reverse();
		System.out.println();
		System.out.print("fifth apparoch is "+reversed2);
		
		
		

	}

}
