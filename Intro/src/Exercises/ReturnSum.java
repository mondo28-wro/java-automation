package Exercises;

import java.util.Scanner;

/**
 * Write a program with method sum(int n) which receives one parameter and
 * return sum of all previous natural numbers (till zero) using recursion
 */

public class ReturnSum {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		System.out.println("Provide initial number and press Enter");
		int n = in.nextInt();
		System.out.println(sum(n));
	}

	public static int sum(int n) {
		if (n <= 1)
			return n;
		// System.out.println(n);
		return n + sum(n - 1);
	}

}
