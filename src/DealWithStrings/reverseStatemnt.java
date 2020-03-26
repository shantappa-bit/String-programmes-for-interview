package DealWithStrings;

public class reverseStatemnt {
	public static void main(String[] args) {
		String name = "Selenium";
		char[] array = name.toCharArray();
		// expected is Suinelem
		int count = name.length();
		System.out.print(array[0]);
		for (int i = array.length - 1; i >= 0; i--) 
		{
			if (array[i] != 0) {

				System.out.print(array[i]);

			}

		}
		

	}
}
