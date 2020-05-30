package allPrograms;

import java.util.Scanner;

public class EvenOdd1 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your number");
			int num = scanner.nextInt();
			
			String result = (num % 2 == 0) ? "Even" : "Odd" ;
			System.out.println("Number is :"+result);
	}

}
