import java.util.Scanner;

public class SnitSoft {

    public static void main(String [] args){
        Scanner in  = new Scanner(System.in);
       double amount;
       double shipping;
       amount = in.nextDouble();
       shipping = in.nextDouble();
       // the amount is a variable//
       amount = amount + shipping;

       System.out.print("your bill will be: ");
        System.out.print(amount*2);
        System.out.print(" to your credit card");
        in.close();
    }
}
