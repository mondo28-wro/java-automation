package Chapter03;

/**
Przechwytywanie i wyswietlanie tego co poda uzytkownik
 */

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		
		
		
		String line; // zmienna #1 do przechowywania tego co wpisze uzytkownik
		String line2; // zmienna #2 do przechowywania tego co wpisze uzytkownik
		Scanner in = new Scanner(System.in); // utworzenie obiektu klasy Scanner sluzacego do pobierania tego co wpisze uzytkownik
		
		System.out.println("Napisz coś: ");
		line = in.nextLine();
		System.out.println("Napisałeś: " + line);
		
		System.out.println("Napisz coś jeszcze: ");
		line2 = in.nextLine();
		System.out.println("Napisałeś również: " + line2);
		
		System.out.println("Słowa które napisałeś to:\n " + line + " oraz " + line2);

	}

}
