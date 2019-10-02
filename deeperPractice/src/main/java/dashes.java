import java.util.Scanner;

public class dashes {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int i;
        int count = in.nextInt();
        for (i = 1; i <= count; i++) {
            System.out.print("-");
        }
        System.out.println();
            for (i = 1; count > i; i++) {
                System.out.print("-");


            }
            System.out.println();
        }
    }