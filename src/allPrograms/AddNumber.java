package allPrograms;

import java.util.Scanner;

public class AddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter first number :");
		int number1 = reader.nextInt();
		
		System.out.println("Enter second number :");
		int number2 = reader.nextInt();
		
		int total = number1 + number2;
		System.out.println("Total value :"+total);
	}

}
