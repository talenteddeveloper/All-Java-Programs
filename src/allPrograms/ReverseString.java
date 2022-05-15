package allPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String input="abcd";
		String output= "";
		for( int i=input.length() -1; i>=0; i--) {
			System.out.println(input.charAt(i));
			System.out.println("--"+i);
			output = output +input.charAt(i);
		}
		System.out.println("Reverse: "+output);
	}

}
