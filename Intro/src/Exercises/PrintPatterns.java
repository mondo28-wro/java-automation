package Exercises;

/**
 .Write program that prompts user for the size (a non-negative integer in int) and prints pattern as shown:
     1
   2 1
 3 2 1
 */

import java.util.Scanner;

public class PrintPatterns {

	public static void main(String[] args) {

		PrintPatterns PrintPatterns = new PrintPatterns();

		Scanner in = new Scanner(System.in);
		System.out.println("Provide pattern size and press Enter");
		int size = in.nextInt();
		PrintPatterns.printPatternA(size);

	}

	private void printPatternA(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = size; j >= 1; j--) {
				System.out.print((j <= i ? j : " ") + " ");
			}
			System.out.println();
		}
	}
}
