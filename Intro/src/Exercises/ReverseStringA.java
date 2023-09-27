package Exercises;

/**
Write a Java program to reverse a string using recursion
The given string is: The quick brown fox jumps
The string in reverse order is:
spmuj xof nworb kciuq ehT

 */

public class ReverseStringA {

	public static void main(String[] args) {


		String str = "The quick brown fox jumps";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();

	}

}
