package Section07;

import java.util.ArrayList;

public class L18_ArrayList {

	public static void main(String[] args) {

		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Lizard");
		animals.add("Morse");
		animals.remove(0);
		
		for(int i=0; i<animals.size(); i++) {
			System.out.println(animals.get(i));
		}
}
}