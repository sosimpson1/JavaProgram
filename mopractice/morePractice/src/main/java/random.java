import java.util.Random;
import java.util.Scanner;

public class random {

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Random myRandom = new Random();
        int number;


        number = myRandom.nextInt(15)+1;
        if(number==in.nextInt()){
            System.out.println("you win");


        }else{
            System.out.println("you loose");

        }
        System.out.print(number);
    }
}
