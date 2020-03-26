package Stringmanipulation;

public class StringMethods 
{
	public static void main(String[] args) 
	{
		String s1="hello";
		//conv this to upper case 
		String upper = s1.toUpperCase();
		//System.out.println(upper);
		String s2="HELLwer";
		//conv to lower case 
		String lower = s2.toLowerCase();
		
		//startsWith  it will check does sting starts with specified  string or not 
		boolean real = s2.startsWith("H");
		//System.out.println(real);
		String s3="helloworld";
		//it will check does string ends with e or not 
		//if yes it will retuen true or else it ll return false
		//System.out.println(s3.endsWith("e"));
		
		//System.out.println(s3.contains("w"));
		//it will check whether the char present in the specifd index or not 
		
		System.out.println(s1.startsWith("o", 4));
		
	}

}
