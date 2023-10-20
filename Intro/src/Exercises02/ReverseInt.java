package Exercises02;
/**
 * Write a program to extract each digit from an int, in the reverse order. 
For example, if the int is 4526, the output shall be 6254

 */

public class ReverseInt {

	static int reverse(int n) {
		int rev = 0;
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
