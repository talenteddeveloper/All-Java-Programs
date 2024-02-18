package allPrograms;

public class CalculateAvgUsingArray {

	public static void main(String[] args) {
		double[] input= {34.5,34,12,-2,55.7};
		double sum=0.0;
		for(double num: input) {
			//System.out.println(num);
			sum += num; //sum=sum+num
		}
		System.out.println(sum);
		double avg= sum/input.length;
		System.out.println("Avg: "+avg);
	}

}
