package Chapter05;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		
		Example02 scannerInput = new Example02();
		Example02.scanDouble();
	
	}
	
	public static void scanDouble() {
		Scanner in = new Scanner(System.in);
		System.out.print("Wprowadz liczbę: ");
		double x = in.nextDouble();
		printLogarithm(x);
	}

	private static void printLogarithm(double x) {

		if (x <= 0.0) {
			System.err.println("Błąd: x musi być dodatnie.");
			return;
		}
		double result = Math.log(x);
		System.out.println("Logarytm x wynosi " + result);
	}

}
