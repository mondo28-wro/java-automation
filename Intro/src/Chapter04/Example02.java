package Chapter04;

/**
 * Dodawanie nowych metod i przepływy
 */

public class Example02 {

	public static void newLine() {
		System.out.println();
	}

	public static void threeLine() {
		newLine();
		newLine();
		newLine();
	}

	public static void main(String[] args) {

		System.out.println("Pierwsza linia.");
		newLine(); // metoda newLIne zostaja zdefiniowana wyzej, tutaj jest wywoływana i powoduje
					// ze pojawia sie pusty wiersz lub kilka jesli powielimy wpis
		System.out.println("Druga linia.");
		threeLine();
		System.out.println("Trzy wiersze przerwy.");
		
		
		//przepływ jest taki ze zaczyna się tam gdzie jest main
		//wykonywane jest println a nastepnie program idzie do metody newLine itd
	}

}
