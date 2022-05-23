package allPrograms;

public class StringPalindrome1 {
	public static void main(String[] args) {
		String input="radar";
		StringBuilder stb = new StringBuilder(input);
		String output = stb.reverse().toString();
		System.out.println("output: "+output);
		if(input.equals(output)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		
		}
	}
}
