import java.util.Random;

public class gameOfDie {

    public static void main(String [] args){
        Random myRandom = new Random();
        int die1 = 0;
        int die2 = 0;
           while (die1 + die2 !=7 && die1 + die2 !=11){
               die1 = myRandom.nextInt(6) + 1;
               die2 = myRandom.nextInt(6) + 1;
               System.out.println(die1);
               System.out.println("");
               System.out.println(die2);

           }
        System.out.println("Rolled");
        System.out.println(die1+die2);
    }
}
