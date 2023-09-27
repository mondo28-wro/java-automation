package Exercises;

/**
 * 3.Write a java program to print current date and time in the specified format
Current Date and Time :                                                                                       
June 19, 2017                                                                                                 
3:13 pm

 */

import java.util.Calendar;

public class CurrentDateTime {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		System.out.println("Current Date and Time :");
		System.out.format("%tb %te, %tY%n", c, c, c);
		System.out.format("%tl:%tM %tp", c, c, c);
		
	}

}
