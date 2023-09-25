package Exercises;

/**
 * 12.(HW) Write a Java program to reverse words in a given string
The given string is: Reverse words in a given string
The new string after reversed the words: string given a in words Reverse
 */

public class ReverseString {

	public static void main(String[] args) {


		String str = "Reverse words in a given string";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();

	}

}
