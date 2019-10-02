import java.util.Scanner;

public class converting {

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int meters;
        int centimeters;
        int millimeters;
        String letters = "mc";


        letters = in.nextLine();
        meters = in.nextInt();
        if(letters.equals("c")){
            centimeters = meters + 100;
            System.out.println(centimeters);

        }else if(letters.equals("m")){
            millimeters = meters + 1000;
            System.out.println(millimeters);

        }else {
            System.out.println("print nothing");
        }
    }
}
