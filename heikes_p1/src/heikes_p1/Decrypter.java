package heikes_p1;

import java.util.ArrayList;

public class Decrypter 
{
	public static void decrypt(String numIn)
	{
		ArrayList<Integer> digits = new ArrayList<Integer>();
		for (int i = 0; i < numIn.length(); i++)
		{
			digits.add(Character.getNumericValue(numIn.charAt(i)));
		}
		
		reOrder(digits);
		
		// 0 + 7 % 10 = 7
		// 3 + 7 % 10 = 0
		// 9 + 7 % 10 = 6
		
		// Decrypt digits
		for (int i = 0; i < digits.size(); i++) 
		{
			digits.set(i, (digits.get(i) - 7 + 10) % 10);
		}
		
		printList(digits);
		
	}
	
	private static void reOrder(ArrayList<Integer> digits)
	{
		int hold;
		int i = 0;
		while (i < digits.size() - 2) 
		{
			hold = digits.get(i);
			digits.set(i, digits.get(i + 2));
			digits.set(i + 2, hold);
			
			// 0 and 1 are good
			// 2 and 3 are bad
			// 4 and 5 are good...
			if (i % 2 == 0)
			{
				i++;
			}
			else
			{
				i += 3;
			}
			
		}
	}
	
	private static void printList(ArrayList<Integer> digits)
	{
		for (Integer num : digits) 
		{
			System.out.print(num);
		}
		System.out.println();
	}

}
