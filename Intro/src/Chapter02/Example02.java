package Chapter02;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

/**
 Operatory arytmetyczne
 */

public class Example02 {

	public static void main(String[] args) {
		// proste obliczenia
		
		int hour = 11;
		int minute = 59;
		System.out.print("Liczba minut która upłynęła od północy: ");
		System.out.println(hour * 60 + minute);  // mnozenie zmiennej typu int przez liczbę i dodawanie innej zmiennej typu int
		
		System.out.print("Ułamek godziny, który upłynął, to ");
		System.out.println(minute / 60);  // wynik minute / 60 da ZERO poniewaz wartosci sa zaokrąglane
		
		//aby otrzymac wynik rzeczywisty nalezy zmienic typ zmiennej
		
		double minute2 = 59.0;
		System.out.print("Ułamek godziny, który upłynął, to ");
		System.out.println(minute2 / 60);  // w ten sposob uzyskamy wynik z cyframi po przecinku
		
		//niektore programy automatycznie konwertuja przypisane wartosci
		
		double y = 1 / 3;
		System.out.println(y);   // w tym przypadku wynikiem bedzie 0 poniewaz nastepuje zamiana z double na int wiec wynik jest liczba calkowita i zaokregleniem
		
		double x = 1.0 / 3.0;  // podajac wartosci zmiennych nalezy podac je w poprawnym formacie
		System.out.println(x); // w tym przypadku wynik bedzie prawidlowy czyli 0.3333333333333333
		
		// pobieranie aktualnego czasu
		
		Calendar now = Calendar.getInstance();
		int hour3 = now.get(Calendar.HOUR_OF_DAY);
		int minutes3 = now.get(Calendar.MINUTE);
		 
        // Get the current hour and minute as parameters
        System.out.println(now.get(Calendar.HOUR_OF_DAY)
                           + ":"
                           + now.get(Calendar.MINUTE));
        // Printing the current hour and minute using now
        
        System.out.println(hour3 + ":" + minutes3);
        
        //inny sposob na pobranie daty i czasu
        
        Date current_Date = new Date();
        //"Date" class
        //"current_Date" is Date object
 
        System.out.println(current_Date);
        // print the time and date
        
        
     // get current System Date
        LocalTime localTime = LocalTime.now();
        System.out.println("Current System Time is = " + localTime);
 
 
        // 1. get hour
        int hour4 = localTime.getHour();
        System.out.println("\nHour is = " + hour4);
 
 
        // 2. get minute
        int minute4 = localTime.getMinute();
        System.out.println("Minute is = " + minute4);
 
 
        // 3. get second
        int second = localTime.getSecond();
        System.out.println("Second is = " + second);
 
 
        // 4. get nano
        int nano = localTime.getNano();
        System.out.println("Nano is = " + nano);
        
        
        
				

	}

}
