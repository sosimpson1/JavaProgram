import java.util.Scanner;

public class NicePrice {

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int age;
        double price = 0.00;
        char reply;
        boolean isKid,isSenior, hasCoupon, hasNoCoupon;


        System.out.println("how old are u");
        age = in.nextInt();

        reply = in.findWithinHorizon(".", 0).charAt(0);
        isKid = age < 12;
        isSenior = age>= 65;
        hasCoupon = reply == 'y' || reply == 'y';
        hasNoCoupon = reply == 'N' || reply == 'n';

        if (!isKid||!isSenior){
            price = 9.25;
        }
        if(isKid || isSenior){
            price -=2.00;
        }if(hasCoupon){
            price -=2.00;
        }if(!hasCoupon && !hasNoCoupon){
            System.out.println("Huh");
        }
        System.out.println("Please pay $");
        System.out.println(price);
        System.out.println(".");
        System.out.println("enjoy the show! ");

        in.close();
    }
}
