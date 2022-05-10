package allPrograms;

public class VowelConsonant1 {

	public static void main(String[] args) {
		char c= 'p';
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c +" is vowel");
			break;
		default:
			System.out.println(c + " is consonant");
		}
	}

}
