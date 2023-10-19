package Exercises02;

/**
 * 4.1 Tribonacci numbers are a sequence of numbers T(n) similar to Fibonacci
 * numbers, except that a number is formed by adding the three previous numbers,
 * i.e., T(n)=T(n-1)+T(n-2)+T(n-3), T(1)=T(2)=1, and T(3)=2. Write a program
 * called Tribonacci to produce the first twenty Tribonacci numbers. 1 1 2 4 7
 * 13 24 44 81 149 274 504 927 1705 3136 5768 10609 19513 35890 66012
 * 
 */

public class Tribonacci {

	public static void main(String[] args) {
		int n = 20, n1 = 1, n2 = 1, n3 = 2;
		System.out.println("The first " + n + " Tribonacci numbers are:");

		for (int i = 1; i <= n; ++i) {
			System.out.print(n1 + " ");

			// compute the next term
			int n4 = n1 + n2 + n3;
			n1 = n2;
			n2 = n3;
			n3 = n4;
		}
	}
}
