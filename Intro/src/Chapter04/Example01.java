package Chapter04;

/**
 * Metody matematyczne
 */

public class Example01 {

	public static void main(String[] args) {
		
		// java ma w sobie klasę Math, która słuzy do wykonywania typowych operacji matematycznych
		double root = Math.sqrt(17.0);
		double angle = 1.5;
		double height = Math.sin(angle);
		
		
		System.out.println(root);
		System.out.println(height);
		
		double degrees = 90;
		double angle1 = degrees / 180.0 * Math.PI;
		
		System.out.println(angle1);
		
		double radians = Math.toRadians(180.0);
		double degrees1 = Math.toDegrees(Math.PI);
		
		System.out.println(radians);
		System.out.println(degrees1);
		
		
		// long miesci wieksze liczby niz int
		long x = Math.round(Math.PI * 20);  // Math.round sluzy do zaokrąglania do najblizszej liczby całkowitej, 
		
		System.out.println(x);
		
		double xz = Math.pow(2.0, 10.0);  // math.pow podnosi pierwsza liczbę do potęgi wskazanej przez drugą liczbę
		
		System.out.println(xz);

	}

}
