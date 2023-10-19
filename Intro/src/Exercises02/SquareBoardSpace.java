package Exercises02;
/**
 * /**
 * 6. Write a program that take n from user for the size (a non-negative integer in int); and prints the following square pattern.

Enter the size: 5
# # # # #
 # # # # #
# # # # #
 # # # # #
# # # # #
 */

import java.util.Scanner;

public class SquareBoardSpace {

public static void main(String[] args) {
		
		SquareBoardSpace SquareBoards = new SquareBoardSpace();

		Scanner in = new Scanner(System.in);
		System.out.print("Input number: ");
		int x = in.nextInt();
		SquareBoards.printSquareBoardSpace(x);

	}
	

	void printSquareBoardSpace(int n) {
		for (int i = 0; i < n; i++)
			if (i % 2 == 0){
			for (int j = 0; j < n; j++) {
				System.out.print("# ");
			}
			System.out.println("");
		} else
		{
			for (int j = 0; j < n; j++) {
				System.out.print(" #");
			}
			System.out.println("");
		}

	}

}
