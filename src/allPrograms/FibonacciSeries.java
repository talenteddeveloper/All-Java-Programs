package allPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int totalTerm =15;
		int a= 0;
		int b=1;
		for( int i=1 ; i<= totalTerm ; i++) {
			//System.out.println(i);
			System.out.print(a + " , ");
			int sum = a+b;
			//System.out.println("sum :"+sum);
			a= b;
			//System.out.println("a : "+a);
			b=sum;
			//System.out.println("b : "+b);
		}
	}

}
