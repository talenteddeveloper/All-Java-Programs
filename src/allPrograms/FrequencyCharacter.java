package allPrograms;

public class FrequencyCharacter {

	public static void main(String[] args) {
		String input="This is a mango";
		char ch='o';
		int count=0;
		for(int i=0; i<input.length();i++) {
			//System.out.println(input.charAt(i));
			if(ch == input.charAt(i)) {
				//System.out.println("match found: "+i);
				count++;// count = count +1;
			}
		}
		System.out.println(ch +" character total frequency : "+count);
	}

}
