import java.io.FileNotFoundException;
import java.io.PrintStream;


public class writeData {

    public static void main(String args[])throws FileNotFoundException {

        PrintStream diskWriter = new PrintStream("cookedData.txt");

        diskWriter.println(99.5);


        diskWriter.close();
    }
}
