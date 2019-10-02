import java.util.Random;

public class specialOffer {

    public static void main(String [] args){
        Random myRandom = new Random();
        int randomNumber;
        randomNumber = myRandom.nextInt(10)+ 1;


        if(randomNumber == 5){
            System.out.println("Hurray u have a won a lottery");
        }
        System.out.println(randomNumber);
    }
}
