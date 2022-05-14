package allPrograms;

public class LargestInArray {

	public static void main(String[] args) {
		double[] input = {100, -6,500,54,899,66};
		double largest = input[0]; //100
		
		for( double num: input) {
			//System.out.println(num);
			if( largest < num ) {
				System.out.println("current largest :"+largest);
				largest= num;
				System.out.println("now largest :"+num);
			}
		}
		System.out.println("largest :"+largest);
	}

}
