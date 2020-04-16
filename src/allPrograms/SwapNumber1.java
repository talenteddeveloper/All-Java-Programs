package allPrograms;

public class SwapNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=20;
		int second =30;
		System.out.println("Before swap");
		System.out.println("First value :"+first);
		System.out.println("Second value :"+second);
		
		first = first - second;
		second  = first + second;
		first  = second - first;
		System.out.println("After swap");
		System.out.println("First value :"+first);
		System.out.println("Second value :"+second);
	}

}
