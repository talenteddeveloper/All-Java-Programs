package allPrograms;

public class SumNaturalNumberUsingRecursion {

	public static void main(String[] args) {
		int number= 20;
		int total = addNum(number);
		System.out.println("total: "+total);
	}
	public static int addNum(int num) {
		if(num !=0) {
			System.out.println(num);
			return num + addNum(num-1);// 20 + addNum(20-1) + addNum(20-1)
		}else {
			return num;
		}
		 
	}

}
