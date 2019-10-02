import java.util.Scanner;

public class manystars {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int howmany;
         int count;

         System.out.println("How many stars? ");
         howmany=in.nextInt();
         count = 0;
         while(count < howmany){
             System.out.print("*");
             count++;
         }
        }
}
