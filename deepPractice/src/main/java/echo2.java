import java.util.Scanner;

public class echo2 {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int number;
        char reply;
        do {
            System.out.println("Type a number: ");
            number = in.nextInt();
            System.out.println(number);
            System.out.println("do u want to continue? (y/n)");
            reply = in.findWithinHorizon(".",0).charAt(0);
        }while (reply!='n');
        System.out.println( "stop");
    }
}
