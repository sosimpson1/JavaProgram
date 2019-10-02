import java.util.Scanner;

public class areWeThereyet {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String answer;


        System.out.println("Are we there yet(Y/N)");
        answer = in.next();
        while (answer.equals("N")) {
            System.out.println("Are we there yet(Y/N)");
            answer = in.next();
            System.out.println(answer);
            answer=in.next();



        }
        System.out.println();
        in.close();
    }
}