package allPrograms;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Java Calculator Program");
		System.out.println("Enter two number");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		//System.out.println(num1 + " : " + num2);

		System.out.println("Select operation:");
		System.out.println("1. Addition (+)");
		System.out.println("2. Subtraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Division (/)");
		
		int operation = scanner.nextInt();
		double result=0;
		switch(operation) {
		//1
		case 1:
			result = num1+num2;
			break;
		case 2:
			result = num1-num2;
			break;
		case 3:
			result = num1*num2;
			break;
		case 4:
			if(num2 != 0) {
				result = num1/num2;
			}else {
				System.err.println("Error- Cannot divide by 0");
				return;
			}
			break;
		default:
			System.out.println("Error- Invalid Operation");
			return;
		}
		System.out.println("Result: "+result);
	}

}
