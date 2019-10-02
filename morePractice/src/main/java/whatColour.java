import java.util.Scanner;

public class whatColour {
         enum Color{green,yellow,red};
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        Color signal = null;


        System.out.println("what colour is the traffic light?(G/Y/R)");
        char reply = in.findWithinHorizon(".",0).charAt(0);
        if(reply=='G'){
            signal = Color.green;
            System.out.println("the colour is green: keep moving");
        }if(reply=='Y'){
            signal = Color.yellow;
            System.out.println("the colour is yellow : get ready to stop");

        }if (reply=='R'){
            signal = Color.red;
            System.out.println("the colour is red: SO Stop");

        }
        System.out.println();
        if(signal== Color.green){
            System.out.println("its green u can go");
        }
        if(signal==Color.yellow){
            System.out.println("the colour is Yellow: SO get ready to stopStop");
        }
        if(signal==Color.red){
            System.out.println("the colour is Red: Stop Immediately");

        }
    }
}
