import java.util.Random;
import java.util.Scanner;

public class caseSwitch {

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Random myRandom = new Random();
        int number;
        System.out.println("Type your question my child: ");
        in.nextLine();
        number = myRandom.nextInt(10)+1;

        switch (number){
                case 1:
                    System.out.println("yes isnt it: ");

            case 2:
            System.out.println("no isnt it: ");

                    case 3:
                        System.out.println("tired isnt it: ");

                            case 4:
                                System.out.println("yes slapped it: ");

                                    case 5:
                                        System.out.println("coughs isnt it: ");
                                        break;
                                            case 6:
                                                System.out.println("banded isnt it: ");

                                                    case 7:
                                                        System.out.println("train isnt it: ");

                                                            case 8:
                                                                System.out.println("great isnt it: ");

                                                                    case 9:
                                                                        System.out.println("pain isnt it: ");

                                                                            case 10:
                                                                                System.out.println("tame isnt it: ");

                                                                                    default:
                                                                                        System.out.println("yep you gat a problem: ");


        }
        System.out.println("good bye: ");
        in.close();
    }
}
