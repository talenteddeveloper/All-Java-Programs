package javautil;

public class ConvertIntToString {

	public static void main(String[] args) {
		
	int a=10;
	String b = Integer.toString(a);
	System.out.println("Using Integer.toString : "+b);
	
	String c= String.valueOf(a);
	System.out.println("Using String.valueOf :"+c);
	
	String d = String.format("%d", a);
	System.out.println("Using String.format: "+d);
	}

}
