import java.util.Scanner;

public class poem {

    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        String user = "y";

        System.out.println("Do u want to know how well i love Petoria?");
        user = keyboard.nextLine();

        if(user.equals("y")){
            System.out.println(" i love Petoria i no go lie, Petoria na the only woman i want for my life...");
        }else {
            System.out.println(" i still love her with all my heart");
        }
    }
}
