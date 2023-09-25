package Exercises;

/**
 * Write a program to produce the "sum of the squares" of all the numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 + ... + 100*100.
 */

public class Program4 {
	
	public static void main(String[] args) {

		int lowerbound = 1;
		int upperbound = 100;
		int startNumber = lowerbound;
		int endNumber = upperbound;
		int sum = 0;
		
		 for (int i = lowerbound; i <= upperbound; i++) {
	            sum += i*i;
	            System.out.println(i*i);
	            lowerbound++;
	        }
		
		System.out.println("The sum of squares of all numbers between " + startNumber + " and " + endNumber + " is " + sum);
		

	}
	
	

}
