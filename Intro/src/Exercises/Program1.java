package Exercises;

/**
 * Write a program to produce the sum of 1, 2, 3, ..., to 100. Store 1 and 100
 * in variables lowerbound and upperbound, so that we can change their values
 * easily. Also compute and display the average. The output shall look like: The
 * sum of 1 to 100 is 5050 
 * The average is 50.5
 */

public class Program1 {
	
	public static void main(String[] args) {

		int lowerbound = 1;
		int upperbound = 100;
		double startNumber = lowerbound;
		double endNumber = upperbound;
		int sum = 0;
		for (int i = lowerbound; i <= upperbound; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of " + lowerbound + " and " + upperbound + " is " + sum);
		
		double avg = (startNumber + endNumber) / 2;
		System.out.println("The average is " +avg);

	}
	
	
	

}
