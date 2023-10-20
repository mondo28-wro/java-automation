package Exercises02;
/**
 * . Write a program to extract each digit from an int, in the reverse order. 
For example, if the int is 15423, the output shall be "3 2 4 5 1", with a space separating the digits.

 */


public class ReverseIntSpace {

	public static void main(String[] args) {
		{
			 
	        // Declaring the number
	        int number = 15423;
	 
	        // Printing the last digit of the number
	        while (number > 0) {
	 
	            // Finding the remainder (Last Digit)
	            int remainder = number % 10;
	 
	            // Printing the remainder/current last digit
	            System.out.print(remainder + " ");
	 
	            // Removing the last digit/current last digit
	            number = number / 10;
	        }
	    }
	}
}