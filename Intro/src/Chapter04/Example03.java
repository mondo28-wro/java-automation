package Chapter04;

/**
 * Parametry i argumenty
 */

public class Example03 {

	public static void printTwice(String s) {
		System.out.println(s);
		System.out.println(s);
	}

	public static void main(String[] args) {
		printTwice("Nie każ mi tego mówić dwa razy!"); // argument Nie każ mi tego mówić dwa razy! zostaje przypisany do
														// parametru s

		String argument = "Nigdy nie mów nigdy";
		printTwice(argument);
	}

}
