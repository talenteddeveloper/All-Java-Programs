package allPrograms;

public class LargestNumber1 {
	public static void main(String[] args) {
		
		int a = 220, b = 456, c = 630;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is the largest");
			}else
			{
				System.out.println("C is the largest");
			}
		}else
		{
			 if(b>c)
			 {
				 System.out.println("B is the largest");
			 }else
			 {
				 System.out.println("C is the largest");
			 }
		}
	}
}
