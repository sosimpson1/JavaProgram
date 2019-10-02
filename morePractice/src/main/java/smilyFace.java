import java.util.Random;
import java.util.Scanner;

public class smilyFace {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String answer;
        System.out.println("Do u want to see a smiley face? ");

            answer = keyboard.nextLine();
            if (answer.equals("y")) {
                System.out.println("smiley faces");
            } else {
                System.out.println("Sad");
            }

        }
    }


