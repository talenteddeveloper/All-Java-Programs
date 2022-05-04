package allPrograms;

public class Factorial {

    public static void main(String[] args) {
        int num =4;
        int output=1;
        for( int i=1 ; i<= num; i++) {
            //System.out.println(i);
            output = output * i ;
            System.out.println("current value: "+output);
        }
        
        System.out.println("output :"+output);
    }

}