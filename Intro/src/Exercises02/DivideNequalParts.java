package Exercises02;

/**
 * Write a Java program to divide a string in n equal parts The given string is:
 * abcdefghijklmnopqrstuvwxy
 * 
 */

public class DivideNequalParts {

	// Method to divide a string into n equal parts
	static void divide(String str, int n) {

		int sub_size;
		// Check whether the string can be divided into n equal parts
		if (str.length() % n != 0) {
			System.out.println("Invalid Input");
			System.out.println("String size is not divisible by n");
			System.out.println("Try Again");
			return;
		}

		// Calculate the number of parts to find the division points
		sub_size = str.length() / n;

		for (int i = 0; i < str.length(); i++) {
			if (i % sub_size == 0)
				System.out.println();
			System.out.print(str.charAt(i)); // Why there can't be else at the beginning of line?
		}
	}

	// Driver Code
	public static void main(String[] args) {

		String str = "abcdefghijklmnopqrstuvwxy";
		int size = str.length(); // check length of string
		System.out.println("The entered string is: " + str + " with length of " + size);
		int n = 5;
		System.out.println("On dividing the entered string into " + n + " equal parts, we have ");
		// Print n equal parts of the string
		divide(str, n);

	}

}
