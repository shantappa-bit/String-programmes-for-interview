package DealWithStrings;

public class SubStringCOncept
{
	
	public static void main(String[] args)
	
	{
		String name = "selenium";

        String comp = name.substring(1, name.length() - 1);

		String base = "";
		for (int i = comp.length() - 1; i >= 0; i--) 
		{
			base = base + comp.charAt(i);

		}
		System.out.print(name.charAt(0) + base + name.charAt(name.length() - 1));

	}

}












/*
 * String name="selenium"; //it will fetch the character from second index (2)
 * String store=name.substring(2); // System.out.println(store); //one more way
 * is String comp = name.substring(1, name.length()-1);
 * //System.out.println(comp); String base=""; for(int
 * i=comp.length()-1;i>=0;i--) { base=base+comp.charAt(i);
 * 
 * } System.out.print(name.charAt(0)+base+name.charAt(name.length()-1));
 */
