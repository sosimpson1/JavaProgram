
import java.util.Scanner;

public class numberOfDaysInMonth {

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int month;
        int numberOfDays;
        boolean isLeapYear;
        System.out.println("which month? ");
        month = in.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                   numberOfDays = 30;
                   break;
            case 2:
                System.out.println("Leap year(true/false)?");
                isLeapYear = in.nextBoolean();
                if(isLeapYear){
                    numberOfDays = 29;

                }else {
                    numberOfDays = 28;
                }
               System.out.println(numberOfDays);
                System.out.println(" days");

                in.close();


        }

    }


}
