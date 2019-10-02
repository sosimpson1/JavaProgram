import java.util.Random;
import java.util.Scanner;

public class correctNumber {

    public static void main(String []args){
        Scanner keyboard = new Scanner(System.in);
        int answer = keyboard.nextInt();

        if(answer == 12){
            System.out.println("thats correct");
        }else{
            System.out.println("Sorry thats wrong");
        }
    }
}
