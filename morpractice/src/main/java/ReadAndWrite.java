import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ReadAndWrite {

    public static void main(String args[])throws FileNotFoundException {
        Scanner diskScanner = new Scanner(new File("data.txt"));
        PrintStream diskWriter = new PrintStream("cooks.txt");

        diskWriter.println("Hello");

        System.out.println(diskScanner.next());

        diskScanner.close();
        diskWriter.close();

    }
}
