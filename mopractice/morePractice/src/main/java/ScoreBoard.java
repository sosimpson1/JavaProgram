import java.util.Scanner;

public class ScoreBoard {

    enum WhoWins{home, visitors, neither}

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int hankees, socks;
        WhoWins who;

        System.out.println("Hankees and Socks scores? ");
        hankees = in.nextInt();
        socks = in.nextInt();
        System.out.println( );

        if (hankees > socks){
            who = WhoWins.home;
         System.out.println(" The Hankees win: -) ");
            System.out.println("we killed them at home ");
        }else if(socks > hankees){
            who=WhoWins.visitors;
            System.out.println("the socks win");

        }else{
            who=WhoWins.neither;
            System.out.println("Stalemate");
        }
        System.out.println();
        System.out.println("Todays game is brought to u by? ");
        System.out.println();

        if(who==WhoWins.home){
            System.out.println("we beat them silly ");
        }
        if(who==WhoWins.visitors){
            System.out.println("They cheated? ");
        }if(who==WhoWins.neither){
            System.out.println("we shared the point? ");
        }
       in.close();
    }
}
