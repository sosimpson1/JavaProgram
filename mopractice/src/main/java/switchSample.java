import java.util.Scanner;

public class switchSample {

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        java.lang.String letterGrade;


        int sum;
        char symbol=' ';
        letterGrade = in.next();

        switch (letterGrade){
            case "A":
                int firstNumber=in.nextInt();
                int secondNumber=in.nextInt();
                sum = firstNumber + secondNumber;
                System.out.println(sum);
                break;
            case "B":
                System.out.println("promotion");
                break;
            case "C":
                System.out.println("interpretation");
                break;
        }

    }
}
