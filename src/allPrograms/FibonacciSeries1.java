package allPrograms;

public class FibonacciSeries1 {

	public static void main(String[] args) {
		int totalTerm =6;
		int a =0;
		int b= 1;
		
		int count =1;
		while(count <= totalTerm ) {
			//System.out.print(a +" ,");
			int sum = a+b;
			System.out.println("sum : "+sum);
			a= b;
			System.out.println("a : "+a);
			b= sum;
			System.out.println("b : "+b);
			count++;
		}
	}

}
