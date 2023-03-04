package javautil;

public class StringToIntAndViceVersa {
	public static void main(String[] args) {
		String input="avd";
		
		System.out.println("---way 1---");
		int a1= Integer.valueOf(input);
		System.out.println("a1:"+a1);
		String a2= String.valueOf(a1);
		System.out.println("a2:"+a2);
		
		System.out.println("---way 2---");
		int b1= Integer.parseInt(input);
		System.out.println("b1:"+b1);
		String b2 = Integer.toString(b1);
		System.out.println("b2:"+b2);
		
		System.out.println("---way 3---");
		int c1 = new Integer(input);
		System.out.println("c1:"+c1);
		String c2 = String.format("%d", c1);
		System.out.println("c2:"+c2);
	}
}
