package allPrograms;

import java.util.ArrayList;

public class IterateArrayListUsingLambda {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		System.out.println("fruits: " + fruits);
		fruits.forEach((e) -> {
			System.out.println(e);
		});

	}

}
