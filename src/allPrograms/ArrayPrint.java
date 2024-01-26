package allPrograms;

import java.util.Arrays;

public class ArrayPrint {

	public static void main(String[] args) {
		int[] array= {1,2,3,4};
		for(int i=0;i<array.length;i++) {
			//System.out.println("i: "+i);
			//System.out.println(array[i]);
		}
		
		for(int element: array) {
			//System.out.println(element);
		}
		System.out.println(Arrays.toString(array));
	}

}
