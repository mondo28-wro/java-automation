package Chapter05;

/** 
 * Operatory logiczne
 */

public class Example01 {

	public static void main(String[] args) {

		String fruit1 = "Jabłko";
		String fruit2 = "Pomarańcza";
		String fruit3 = "pomarańcza"; 
		
		System.out.println(fruit1.equals(fruit2));  //porównanie 2 stringów, odpowiedzią jest false/true
		System.out.println(fruit2.equalsIgnoreCase(fruit3));  //porównanie 2 stringów, odpowiedzią jest false/true
		
		
	}

}
