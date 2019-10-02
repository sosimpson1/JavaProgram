import java.util.Scanner;

public class samplep {

    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        double unitPrice;
        double total;
        int quantity;

        unitPrice = in.nextDouble();
        quantity = in.nextInt();

        total = unitPrice * quantity;
        System.out.println(total);
    }
}
