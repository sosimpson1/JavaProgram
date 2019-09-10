import java.util.Scanner;

public class ParkingTip {


    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int tip = 2;
       int parkingAmount = scanner.nextInt();

       parkingAmount = parkingAmount + tip;
       System.out.print(" total amount for parking :  ");
        System.out.print(" plus tip ");
        System.out.print(parkingAmount);

       scanner.close();

    }
}
