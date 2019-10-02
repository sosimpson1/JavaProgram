import java.util.Scanner;

public class smaller {

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();
        boolean firstSmallerr = firstNumber<secondNumber ;
        if(firstSmallerr== true){
            System.out.println("The first is smaller? ");
        }


    }
}
