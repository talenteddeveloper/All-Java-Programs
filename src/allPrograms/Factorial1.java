package allPrograms;

public class Factorial1 {

	public static void main(String[] args) {
		int num =4;
		int i=1;
		int output =1;
		while (i <= num) {
			//System.out.println(i);
			output = output *i;
			System.out.println("current value: "+ output);
			i++;
		}
		
		System.out.println("output: "+output);

	}

}