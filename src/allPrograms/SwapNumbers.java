package allPrograms;

public class SwapNumbers {

	public static void main(String[] args) {
		int first=20;
		int second =30;
		System.out.println("Before swap");
		System.out.println("First value :"+first);
		System.out.println("Second value :"+second);
		
		int temp = first;
		first = second;
		second = temp;
		System.out.println("After swap");
		System.out.println("First value :"+first);
		System.out.println("Second value :"+second);
		
		
	}

}
