package allPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number =153;
		int result=0;
		int temp= number; //153
		int remainder =0;
		while( temp !=0) {
			remainder = temp%10;
			System.out.println("remainder:"+remainder);
			result = (int) (result + Math.pow(remainder, 3));
			System.out.println("result:"+result);
			temp = temp/10;
			System.out.println("temp:"+temp);
		}
		if(result == number) {
			System.out.println(number+" is Armstrong");
		}else {
			System.out.println(number+" is not Armstrong");
		}
	}
}
