import java.util.Scanner;

public class doIHearEcho {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int number = 0;

        char reply;

        do {
            System.out.println("Enter a number? ");
            number = in.nextInt();
            System.out.println(number);


            System.out.println("Continue typing numbers? Y/N");
            reply= in.findWithinHorizon(".", 0).charAt(0);
            System.out.println();

        } while (reply != 'N');

        System.out.println("Done");



    }
    }


