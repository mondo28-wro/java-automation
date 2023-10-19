package Exercises02;
/**
 * Write a program to extract each digit from an int, in the reverse order. 
For example, if the int is 15423, the output shall be "3 2 4 5 1", with a space separating the digits.

 */

public class ReverseInt {

	static int reverse(int n) {
		// reversed number
		int rev = 0;
		// remainder
		int rem;

		while (n > 0) {
			rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}

		return rev;
	}

	// Driver Function
	public static void main(String[] args) {
		int n = 4526;

		System.out.print("Reversed Number is " + reverse(n));

	}

}
