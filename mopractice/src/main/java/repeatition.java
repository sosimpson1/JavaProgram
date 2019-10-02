import java.util.Scanner;

public class repeatition {

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        char symbol ;
        symbol = in.findWithinHorizon(".",0).charAt(0);
        while (symbol != '@'){
            System.out.println(symbol);
            symbol = in.findWithinHorizon(".",0).charAt(0);

        }
        System.out.println();
            in.close();
        }
}
