import java.util.Scanner;

public class tallyu2 {

    public static void main(String args[]){
        double a;
        double sum = 0.0;
        System.out.println("Enter a Number, - to stop");
        Scanner in = new Scanner(System.in);
        do {
            a = in.nextDouble();
            if(a<0) break;
            sum = sum + a;
        } while(true);
        System.out.println("sum = " +sum);
    }
}
