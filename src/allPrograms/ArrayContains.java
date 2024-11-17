package allPrograms;

public class ArrayContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {1,2,3,4,5,6};
		int findNumber=4;
		boolean numberFound= false;
		for(int num: numbers) {
			//System.out.println(num);
			if(num == findNumber) {
				//System.out.println("Number present "+num);
				numberFound= true;
				break;
			}
		}
		if(numberFound) {
			System.out.println("Number present "+findNumber);
		}else {
			System.out.println("Number not present "+findNumber);
		}
	}

}
