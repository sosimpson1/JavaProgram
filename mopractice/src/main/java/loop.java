import java.util.Random;

public class loop {

    public static void main(String [] args){
        Random myRandom = new Random();
        int card=0;
        int total=0;

        System.out.println("Card    Total");

        while(total <21 ) {
            card = myRandom.nextInt(10)+ 1;

            total += card;
            System.out.println("card\ttotal");
            System.out.println(card);
            System.out.println("\t");
            System.out.println(total);

        }
        if(total == 21){

            System.out.println("you win :-");

        }else{
            System.out.println("you loose");
        }
    }
}
