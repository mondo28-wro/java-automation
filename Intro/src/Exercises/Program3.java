package Exercises;

/**
 * Write a program to produce the sum of 1, 2, 3, ..., to 100. Store 1 and 100
 * in variables lowerbound and upperbound, so that we can change their values
 * easily. Also compute and display the average. The output shall look like: The
 * sum of 1 to 100 is 5050 
 * The average is 50.5
 * 
 * use while-do
 */

public class Program3 {
	
	public static void main(String[] args) {

		int lowerbound = 1;
		int upperbound = 100;
		int startNumber = lowerbound;
		int endNumber = upperbound;
		int sum = 0;
			
		do { sum = sum + lowerbound;
		lowerbound++;} while (lowerbound <= upperbound);
		
		System.out.println("The sum of " + startNumber + " and " + endNumber + " is " + sum);
		
		double avg = ((double)startNumber + (double)endNumber)/2;
		System.out.println("The average is " +avg);

	}
	
	

}
