package Chapter02;

/**
 Operacje na łańcuchach znakowych
 */

public class Example3 {

	public static void main(String[] args) {
		// kolejnosc ma wplyw na wynik
		
		System.out.println((1 + 2 + "Witaj")); // da wynik 3Witaj poniewaz kompilator najpierw doda liczby i potem 'doklei' je do wyrazu
		System.out.println(("Witaj" + 1 + 2)); // da wynik Witaj12 poniewaz w tej sytuacji do wyrazu są 'doklejane' liczby

	}

}
