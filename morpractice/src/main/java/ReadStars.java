import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadStars {

    public static void main(String args[])throws FileNotFoundException {
        Scanner diskScanner = new Scanner(new File("enter.txt"));
        char symbol;

        while (diskScanner.hasNext()) {
            symbol = diskScanner.findWithinHorizon(".", 0).charAt(0);

            while (symbol == '*') {
                System.out.print(symbol);
                symbol = diskScanner.findWithinHorizon(".", 0).charAt(0);
            }
            System.out.println();
        }
        diskScanner.close();
    }


    }

