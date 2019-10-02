import java.util.Scanner;

public class timesTable1 {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        for (int i=1; i<number; i++){
            System.out.print("\t");
            System.out.print(i*2);
        }
        System.out.print("\t");
    }
}
