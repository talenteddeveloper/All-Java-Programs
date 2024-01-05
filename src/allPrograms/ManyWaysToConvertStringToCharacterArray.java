package allPrograms;

import java.util.Arrays;
import java.util.Iterator;

public class ManyWaysToConvertStringToCharacterArray {

	public static void main(String[] args) {
		String str="Hello, World!";
		
		System.out.println("---Using charAt---");
		char[] charArray1= new char[str.length()];
		for(int i=0; i<str.length();i++) {
			System.out.println(str.charAt(i));
			charArray1[i]=str.charAt(i);
		}
		System.out.println(charArray1);
		
		System.out.println("---Using toCharArray---");
		char[] charArray2= str.toCharArray();
		System.out.println(charArray2);
		for(int i=0;i<charArray2.length;i++) {
			System.out.println(charArray2[i]);
		}
		
		System.out.println("---Using getChars---");
		char[] charArray3 = new char[str.length()];
		str.getChars(0, str.length(), charArray3, 0);
		System.out.println(charArray3);
		for(int i=0;i<charArray3.length;i++) {
			System.out.println(charArray3[i]);
		}
		
		System.out.println("---Using copyOfRange---");
		char[] charArray4 = Arrays.copyOfRange(str.toCharArray(), 0, str.length());
		System.out.println(charArray4);
		for(int i=0;i<charArray4.length;i++) {
			System.out.println(charArray4[i]);
		}
		
	}

}
