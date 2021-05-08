package allPrograms;

public class SumNaturalNumber {

	public static void main(String[] args) {

		int number = 20;
		int sum = 0;
		
		//using for loop- 1st way
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
			System.out.println("i  ;" + i);
			System.out.println("Sum : " + sum);
		}
		System.out.println("Total Sum : " + sum);
		//using while - 2nd way : please set sum=0 else it will take old sum values
		int i = 1;
		while (i <= number) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}

}
