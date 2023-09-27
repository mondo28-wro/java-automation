package Exercises;

import java.util.Scanner;

/**
 * 6. Write a program that take n from user for the size (a non-negative integer in int); and prints the following square pattern.

Enter the size: 5
# # # # #
# # # # #
# # # # #
# # # # #
# # # # #
 */

public class SquareBoard {

	public static void main(String[] args) {
		
		SquareBoard SquareBoards = new SquareBoard();

		Scanner in = new Scanner(System.in);
		System.out.print("Input number: ");
		int x = in.nextInt();
		SquareBoards.printSquareBoard(x);

	}
	

	private void printSquareBoard(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("# ");
			}
			System.out.println("");
		}

	}
}
