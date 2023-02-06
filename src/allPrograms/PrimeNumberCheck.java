package allPrograms;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		int num =27;
		boolean isPrime = true;
		for( int i=2; i<= num/2;i++) {
			System.out.println(i);
			if(num % i== 0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num+" is prime");
		}else {
			System.out.println(num+" is not prime");
		}
	}

}
