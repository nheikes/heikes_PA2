package heikes_p1;

import java.util.ArrayList;

/*
	Pseudocode...
	
	Separate a number into its digits
	Swap the first and third digits, and the second and fourth digits
	Decrypt each number according to (x minus 7 plus ten) mod ten
	Return the number
	
	As an added challenge, I've made it so that this function will work with numbers larger than four digits.
	The encryption for each digit is still the same, and the swapping follows the same pattern
	(1 swap 3, 2 swap 4, 5 swap 7, 6 swap 8, etc)
	The function still works for the original assignment and follows the PA1 Rubric
	
*/

public class Decrypter 
{
	public static String decrypt(String numIn)
	{
		ArrayList<Integer> digits = new ArrayList<Integer>();
		
		// Load the number from numIn into digits
		for (int i = 0; i < numIn.length(); i++)
		{
			digits.add(Character.getNumericValue(numIn.charAt(i)));
		}
		
		// Reorder digits
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
		
		// Decrypt digits
		for (i = 0; i < digits.size(); i++) 
		{
			digits.set(i, (digits.get(i) - 7 + 10) % 10);
		}
		
		// Return digits (reuse numIn so that we don't have to declare another string)
		numIn = "";
		for (Integer num : digits) 
		{
			numIn += num;
		}
		return numIn;
		
	}

}
