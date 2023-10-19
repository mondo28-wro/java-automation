package Exercises02;

/**
 * Write a program called Fibonacci to print the first 20 Fibonacci numbers
 * F(n), where F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average.
 * Output: The first 20 Fibonacci numbers are: 1 1 2 3 5 8 13 21 34 55 89 144
 * 233 377 610 987 1597 2584 4181 6765 
 * 
 * The average is 885.5
 * 
 * 
 */

public class Fibonacci {

	public static void main(String[] args) {

		int n = 20, n1 = 1, n2 = 1;
		System.out.println("The first " + n + " Fibonacci numbers are:");

		for (int i = 1; i <= n; ++i) {
			System.out.print(n1 + " ");

			// compute the next term
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}
	
	// no average
}
