package allPrograms;

import java.util.Scanner;

public class PrimeNumberBetweenTwoInterval {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter start number: ");
		int start= scanner.nextInt();
		
		System.out.println("Enter end number: ");
		int end= scanner.nextInt();
		for(int i=start; i<=end; i++) {
			//System.out.println(i);//3
			boolean isPrime=true;
			for(int j=2; j<=i/2;j++) {
				if(i%j==0) {
					//System.out.println("Not prime"+i);
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i+" ");
			}
		}
	}

}
