import java.util.Scanner;

public class trafficSignal {

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);


        System.out.println(("What colour is the traffic light? (G/Y/R) "));
        char reply1 = in.findWithinHorizon(".",0).charAt(0);
        System.out.println("Is a police officer directing you not to proceed?(G/Y/R) ");
        char reply2 = in.findWithinHorizon(".",0).charAt(0);
        System.out.println("Is it safe to proceed?(G/Y/R) ");
        char reply3 = in.findWithinHorizon(".",0).charAt(0);



        if (reply1=='G'|| reply2=='g'|| reply3=='G'){
            System.out.println("Go through the green light");

        }if(reply1=='Y'|| reply2=='R'||reply3=='R'){
            System.out.println("STOP IMMEDIATELY ");
            System.out.println();

        }else {
            System.out.println("Display Nothing");
        }
    }
}
