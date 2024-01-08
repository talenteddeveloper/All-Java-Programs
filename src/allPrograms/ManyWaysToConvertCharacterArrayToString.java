package allPrograms;

public class ManyWaysToConvertCharacterArrayToString {

	public static void main(String[] args) {
		char[] charArray = {'H','E','L','L','O'};
		
		String str1 = new String(charArray);
		System.out.println(str1);
		
		String str2= String.valueOf(charArray);
		System.out.println(str2);
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(charArray);
		System.out.println(stringBuilder.toString());
		
	}

}
