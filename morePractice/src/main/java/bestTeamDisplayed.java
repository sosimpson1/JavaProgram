import java.util.Scanner;

public class bestTeamDisplayed{

    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int hankees, socks;

        System.out.println("Hankees and socks scores? ");
        hankees = keyboard.nextInt();
        socks = keyboard.nextInt();
        System.out.println();

        if (hankees > socks){
            System.out.println("Hankees : ");
            System.out.println(hankees);
            System.out.println("Socks : ");
            System.out.println(socks);
        }else{
            System.out.println("Socks : ");
            System.out.println(socks);
            System.out.println("Hankees : ");
            System.out.println(hankees);
        }
        keyboard.close();
    }
}
