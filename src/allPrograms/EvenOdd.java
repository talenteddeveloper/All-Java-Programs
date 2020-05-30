package allPrograms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = scanner.nextInt();
		if( num % 2 == 0)
		{
			System.out.println("Number is even :"+num);
		}else
		{
			System.out.println("Number is odd :"+num);
		}
	}

}
