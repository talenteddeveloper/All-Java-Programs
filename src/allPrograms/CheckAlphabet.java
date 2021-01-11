package allPrograms;

public class CheckAlphabet {

	public static void main(String[] args) {
		char c='J';
		
		/*First way*/
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			System.out.println(c + " is an alphabet");
		} else {
			System.out.println(c + " is not an alphabet");
		}
		
		
		/*Second way*/
		if(Character.isAlphabetic(c))
		{
			System.out.println(c +" is an alphabet");
		}else {
			System.out.println(c +" is not an alphabet");
		}
	}

}
