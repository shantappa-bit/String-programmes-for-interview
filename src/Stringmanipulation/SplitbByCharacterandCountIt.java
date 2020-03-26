package Stringmanipulation;

public class SplitbByCharacterandCountIt {
	public static void main(String[] args) {

		// 0 1 2 3 4
		String stmt = "HOGA BEDA HUDUGI NANNA BITTU";
		String[] space = stmt.split(" ");
		//System.out.println("Number of words are in the statement is b4 splitting  :" + stmt.length());
		//System.out.println("Number of words in the statement are after splitting is :" + space.length);

		for (int i = 0; i < space.length; i++) 
		{
			String god = space[i];
			if (i % 2 == 1)
			{

				for (int j = god.length() - 1; j >= 0; j--) 
				{
					System.out.print(god.charAt(j));
				}
				System.out.print(god.length()+" ");

			}
			else 
			{
				System.out.print(space[i]+space.length + " ");
			}

		}

	}

}
