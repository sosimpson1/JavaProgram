import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class computerTake {

    public static void main(String args[])throws FileNotFoundException {
        Scanner diskScanner = new Scanner(new File("rawData.txt"));
        int food = diskScanner.nextByte();
        double cow = diskScanner.nextDouble();
        String mouse = diskScanner.nextLine();
        char train = diskScanner.findWithinHorizon(".",0).charAt(0);

        diskScanner.close();


    }
}
