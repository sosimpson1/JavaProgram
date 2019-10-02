import java.util.Scanner;

public class TallyUp {

    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        int symbol = 0;
        symbol = in.nextInt();
        while ( symbol > 0||symbol ==0) {
            System.out.println(symbol);
            symbol += in.nextInt();

        }
            System.out.println();
        }
    }

