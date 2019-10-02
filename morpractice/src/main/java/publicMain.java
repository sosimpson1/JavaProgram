import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class publicMain {

    public static void main(String args[])throws FileNotFoundException {
        Scanner diskScanner = new Scanner(new File("input.txt"));

        while(diskScanner.hasNext()){
            char symbol = diskScanner.findWithinHorizon(".",0).charAt(0);
            System.out.println(Character.toUpperCase(symbol));
        }
        diskScanner.close();
    }
}
