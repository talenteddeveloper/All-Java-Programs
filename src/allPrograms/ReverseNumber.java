package allPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		int num =1234;
		int result=0;
		
		while(num !=0) {
			int rem = num % 10;
			result = result *10 + rem;
			System.out.println("result: "+result);
			num = num/10;
		}
		System.out.println("Final result: "+result);
	}

}
