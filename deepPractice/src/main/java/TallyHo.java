import java.util.Scanner;

public class TallyHo {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int number;
        int sum=0;

        do{
            number=in.nextInt();
           // System.out.println(number);
            sum+=number;

        }while(number!=0);
        System.out.println(sum);
    }
}

