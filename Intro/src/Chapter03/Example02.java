package Chapter03;

import java.util.Scanner;

/**
Konwersja miar 
 */

public class Example02 {

	public static void main(String[] args) {
		
		int inch;
		double cm;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ile cali?");
		inch = in.nextInt();
		
		double cmPerInch = 2.54; // przypisanie wartosci mnożnika do zmiennej wraz z okresleniem jej typu
		cm = inch * cmPerInch;   // w przypadku kiedy mnożnik jest stały to powinno sie tak robic
		System.out.print(inch + " cali = ");
		System.out.println(cm + " cm");
		
		int remainder = 76 % 12;//modulo, zwraca reszte z dzielenia . 76= 6*12 + 4
		System.out.println(remainder);

	}

}
