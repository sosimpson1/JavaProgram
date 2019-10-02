import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class DiskOrientedProgram {

    public static void main(String args[]) throws FileNotFoundException{

        Scanner diskScanner = new Scanner(new File("newData"));

        PrintStream diskWriter= new PrintStream("returnData");
        double total;
        int quantity = diskScanner.nextInt();
        double unitPrice = diskScanner.nextDouble();


        total = quantity * unitPrice;
        diskWriter.println(total);


        diskScanner.close();
        diskWriter.close();
    }
}
