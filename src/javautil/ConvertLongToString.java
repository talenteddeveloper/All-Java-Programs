package javautil;

public class ConvertLongToString {

	public static void main(String[] args) {
		long primitiveValue = 15L;
		Long objValue = 30L;
		
		String a1 = String.valueOf(primitiveValue);
		String a2 = String.valueOf(objValue);
		System.out.println("Using String.valueOf");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("---");
		
		String b1 = Long.toString(primitiveValue);
		String b2 = Long.toString(objValue);
		System.out.println("Using Long.toString");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("---");
		
		String c1 = "" + primitiveValue;
		String c2 = "" + objValue;
		System.out.println("Using + operator");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("---");
		
		String d1 = String.format("%d", primitiveValue);
		String d2 = String.format("%d", objValue);
		System.out.println("Using String format");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("---");
		
		String e1 = new StringBuilder().append(primitiveValue).toString();
		String e2 = new StringBuilder().append(objValue).toString();
		System.out.println("Using StringBuilder");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("---");
	}

}
