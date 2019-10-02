import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class RandomInFile {

    public static void main(String args[])throws FileNotFoundException {

       // Scanner diskScanner = new Scanner(new File("myData.txt"));
        PrintStream diskWriter = new PrintStream(new File("please.txt"));


        int numbers=0;
        Random myRandom = new Random();
        numbers = myRandom.nextInt(10)+1;
        diskWriter.println(numbers);
        System.out.println(numbers);


        numbers = myRandom.nextInt(10)+1;
        diskWriter.println(numbers);
        System.out.println(numbers);
        //numbers = myRandom.nextInt(10)+1;
        //diskWriter.println(numbers);
        //System.out.println(diskScanner.next());

        //numbers = myRandom.nextInt(10)+1;
        //diskWriter.println(numbers);
       // System.out.println(diskScanner.next());

        //numbers = myRandom.nextInt(10)+1;
        //diskWriter.println(numbers);
       // System.out.println(diskScanner.next());

        //numbers = myRandom.nextInt(10)+1;
        //diskWriter.println(numbers);
        //System.out.println(diskScanner.next());

       // numbers = myRandom.nextInt(10)+1;
        //diskWriter.println(numbers);
        //System.out.println(diskScanner.next());

       // numbers = myRandom.nextInt(10)+1;
       // diskWriter.println(numbers);
       // System.out.println(diskScanner.next());

    }
}
