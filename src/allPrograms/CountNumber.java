package allPrograms;

public class CountNumber {

	public static void main(String[] args) {
		int num = 875678;
		int count =0;
		
		while( num != 0) {
			num = num / 10;
			count++;
			System.out.println("num :"+num);
			System.out.println("count :"+count);
			
		}
		System.out.println("digit :"+ count);
	}

}
