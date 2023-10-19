package Exercises02;

/**
 * Write a program called ComputePI to compute the value of π, using the following series expansion. 
Use the maximum denominator (maxDenominator) as the terminating condition. Try maxDenominator of 1000, 10000, 100000,
HINT: pi=4*(1-1/3+1/5-1/7+1/9-1/11+1/13-1/15+...)
3.1 Math.PI (=3.141592653589793). Add a statement to compare the values obtained and the Math.PI, in percents of Math.PI, i.e., (piComputed / Math.PI) * 100

 */

public class ComputePi {

	public static void main(String[] args) {
		// Compute PI value for i = 1000, 
		double mathPi = Math.PI;
		double sum = 0;
		double value = 1000.0;
		for (double d = 1; d <= (2 * value - 1); d += 2) {
			sum += 1 / d;
			d += 2;
			sum -= 1 / d; 
		}
		double pi = 4 * sum;

		// Display result
		System.out.println("PI value for i = 1000: " + pi);
		System.out.println("Value compared to Math.PI: pi/MathPi = " + (pi / mathPi) * 100);
		System.out.println();
		
		
		
		// Compute PI value for i = 10000,
		sum = 0;
		value = 10000.0;
		for (double d = 1; d <= (2 * value - 1); d += 2) {
			sum += 1 / d;
			d += 2;
			sum -= 1 / d; 
		}
		pi = 4 * sum;

		// Display result
		System.out.println("PI value for i = 10000: " + pi);
		System.out.println("Value compared to Math.PI: pi/MathPi = " + (pi / mathPi) * 100);
		System.out.println();

		// Compute PI value for i = 100000,
		sum = 0;
		value = 1000000.0;
		for (double d = 1; d <= (2 * value - 1); d += 2) {
			sum += 1 / d;
			d += 2;
			sum -= 1 / d; 
		}
		pi = 4 * sum;

		// Display result
		System.out.println("PI value for i = 1000000: " + pi);
		System.out.println("Value compared to Math.PI: pi/MathPi = " + (pi / mathPi) * 100);
		System.out.println();
		
		
	}

}
