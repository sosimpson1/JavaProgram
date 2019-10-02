import java.util.Scanner;

public class LivingLarge {

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int numbers;

        numbers = in.nextInt();
        while(numbers != 100 && numbers < 100){
            System.out.println(numbers);
            numbers = in.nextInt();

        }
        System.out.println();
        in.close();
    }
}
