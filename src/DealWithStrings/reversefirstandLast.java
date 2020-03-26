package DealWithStrings;

public class reversefirstandLast 
{
	public static void main(String[] args) 
	{
		// 0 1 2 3 4 5 6 7 
     String name="Selenium";
     char[]abb=new char[name.length()];
     
     for(int i=0;i<name.length();i++) 
     {
    	 if(name.charAt(i)=='S' || name.charAt(i)=='m')
    	 {
    		 abb[i]= name.charAt(i); 
    		 
    	 }
    	 else
    	 {
    		 for(int j=name.length()-1;j>=0;j--)
    		 {
    			abb[i]=name.charAt(j); 
    		 }
    	 }
     }
     
     for(int i=0;i<abb.length;i++)
     {
    	 System.out.print(abb[i]);
     }
     
     
	}

}
