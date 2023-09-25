package Chapter03;

/**
Formatowanie danych
 */

public class Example03 {

	public static void main(String[] args) {
		 
		//uzycie printf pozwala na formatowanie danych ktore są wyświetlane
		
		System.out.printf("Trzy czwarte = %.6f\n", 4.0 / 3.0);  //uzycie 6f wyswietla wynik do 6 miejsc po przecinku, 3 do trzech itd
		
		
		double cmPerInch = 2.54;
		int inch = 100;
		double cm = inch * cmPerInch;
		
		System.out.printf("%d cali = %f cm\n", inch, cm);  //%d to dziesięczna wartość całkowita , %f to wartosc zmiennoprzecinkowa
															// dodany zostal znacznik nowej linii \n poniewaz printf nie tworzy nowej linii
		
		
		//rzutowanie typów - konwersja typu zmiennej
		
		double pi = 3.131459;
		int x = (int) pi; // konwersja nastepuja poprzed podanie typu zmiennej w nawiasie
		System.out.println(x);  // wynikiem jest 3 poniewaz zostalo zaokrąglone do wartosci calkowitej
		
		double pi1 = 3.131459;
		double x1 = (int) pi * 20.0;
		System.out.println(x1); // wynik to 60 a nie 62 poniewaz wartosci pi jest konwertowana/zaokraglana na 3 przed wykonaniem mnozenia
		
		inch = (int) (cm / cmPerInch); // nawiast na dzieleniu cm / cmPerinch sprawia, ze najpierw odbywa sie dzielenie a dopiero potem zakrąglenie otrzymanego wyniku
		System.out.printf("%f cm = %d cali\n", cm, inch);
				
	}

}
