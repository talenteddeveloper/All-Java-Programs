package allPrograms;

public class PrintAlphabet {

	public static void main(String[] args) {
		char c;
		for(c='A'; c<='Z'; ++c) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("----");
		for(c='a'; c<='z'; ++c) {
			System.out.print(c + " ");
		}
	}

}
