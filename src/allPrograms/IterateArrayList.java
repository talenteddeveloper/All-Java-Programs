package allPrograms;

import java.util.ArrayList;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		System.out.println("fruits: "+fruits);
		System.out.println("Using for loop");
		for( int i=0;i<fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		System.out.println("Using for each loop");
		for(String fruit :fruits) {
			System.out.println(fruit);
		}
		System.out.println("Using ListIterator");
		ListIterator<String> iterate = fruits.listIterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
	}

}
