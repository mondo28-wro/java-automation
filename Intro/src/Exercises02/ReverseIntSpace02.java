package Exercises02;

/**
 * . Write a program to extract each digit from an int, in the reverse order. 
For example, if the int is 15423, the output shall be "3 2 4 5 1", with a space separating the digits.

 */

public class ReverseIntSpace02 {

	public static void main(String[] args) {
		{
			// Declaring the number
			int number = 15423;

			// Converting the integer input to string data
			String string_number = Integer.toString(number);
			
			//Reversing string
			for (int i = string_number.length() - 1; i >= 0; i--) {
				System.out.print(string_number.charAt(i) + " ");
			}

		}
	}
}
