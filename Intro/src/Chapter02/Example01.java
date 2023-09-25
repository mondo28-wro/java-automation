package Chapter02;

import java.util.Date;

/**
 Zmienne przypisywanie i wyswietlanie
 */
public class Example01 {

	public static void main(String[] args) {
		// definiowanie zmiennych i przypisanie im wartości
		int a = 5;
		int b = 6;	
		
		System.out.println(a);
		a = 7;                 //zmiana wartosci zmiennej a
		System.out.println(a); //wyswietlenie w konsoli zmiennej a
		
		String firstLine = "Witaj znów!";
		
		System.out.println(firstLine);  // wyswietlenie w konsoli zmiennej fistLine
		
		int hour = 11;
		int minute = 59;
		System.out.print("Aktualny czas to ");
		System.out.print(hour);
		System.out.print(":");
		System.out.print(minute);
		System.out.println(".");  // czasem jest tak ze nie podanie komendy println spowoduje niewyswietlenie zadnego tekstu
		
		
		
				
			

	}
	
}
