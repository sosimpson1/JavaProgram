import java.util.Scanner;

public class movieTicket {

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);


        int price = 10;

        System.out.println("How many dimensions? (2/3) ");
        char reply = in.findWithinHorizon(".",0).charAt(0);
        if(reply =='3'){
            price +=  3;
            System.out.print("the price is:");
            System.out.print(price);

        }if(reply=='2'){
            System.out.println(price);
        }else{
            System.out.println();
        }
    }
}
