package allPrograms;

public class StringPalindrome {

	public static void main(String[] args) {
		String input="radar";
		String output="";
		System.out.println("input length: "+input.length());
		for( int i= input.length() -1; i>=0; i--) {
			//System.out.println("i :"+input.charAt(i));
			output = output + input.charAt(i);
		}
		System.out.println("reverse output: "+output);
		if(input.equals(output)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}

}
