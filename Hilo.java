import java.util.Scanner;

import static java.lang.Math.random;

public class Hilo {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 100 + 1);
        int guess = 0;
        while (guess != number) {
            System.out.println("guess a number between 1 and 100:");
        guess = scanner.nextInt();
        if(guess < number)
            System.out.println(guess +" is too low. try again.");
             else if(guess > number)
            System.out.println(guess +" is too high. try again.");
             else
            System.out.println(guess +" is correct. you win!");

    }
}
}




























