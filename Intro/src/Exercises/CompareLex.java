package Exercises;

/**
 * Write a java program to compare two strings lexicographically, ignoring case
 * differences
 * 
 * String 1: This is exercise 1 String 2: This is Exercise 1 "This is exercise
 * 1" is equal to "This is Exercise 1"
 * 
 */

public class CompareLex {

	public static void main(String[] args) {

		String text1 = "This is exercise 1";
		String text2 = "This is Exercise 1";
		
		System.out.println("String 1: " + text1);
        System.out.println("String 2: " + text2 + "\n");

		boolean result = text1.equalsIgnoreCase(text2);

		if (result = true) {
			System.out.println("\"" + text1 + "\"" + " is equal to " + "\"" + text2 + "\"");
		} else if (result = false) {
			System.out.println("\"" + text1 + "\"" + " is not equal to " + "\"" + text2 + "\"");
		}

	}

}
