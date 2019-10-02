import java.util.Scanner;

public class numberKind {

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int number;


        number =in.nextInt();
        if (number==10){
            System.out.println("Positive Number? ");
        }else if(number ==-10){
            System.out.println("Negative Number? ");
        }else {
            System.out.println("0");
        }

    }
}
