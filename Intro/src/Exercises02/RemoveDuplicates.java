package Exercises02;
/**
 * 5.Write a Java program to print after removing duplicates from a given string
The given string is: w3resource
After removing duplicates characters the new string is: w3resouce
 */

import java.util.Arrays;

public class RemoveDuplicates {

	static String removeDuplicate(char str[], int n) {
		// Used as index in the modified string
		int index = 0;

		// Traverse through all characters
		for (int i = 0; i < n; i++) {

			// Check if str[i] is present before it
			int j;
			for (j = 0; j < i; j++) {
				if (str[i] == str[j]) {
					break;
				}
			}

			// If not present, then add it to
			// result.
			if (j == i) {
				str[index++] = str[i];
			}
		}
		return String.valueOf(Arrays.copyOf(str, index));
	}

	public static void main(String[] args) {
		char str[] = "w3resource".toCharArray();
		int n = str.length;
		System.out.println(removeDuplicate(str, n));
	}

}
