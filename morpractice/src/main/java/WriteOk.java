import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;



    class WriteOk {
        public static void main(String args[])throws FileNotFoundException {

            PrintStream diskWriter = new PrintStream(new File("approval.txt"));

            diskWriter.print('0');
            diskWriter.println('K');
            diskWriter.close();
        }
    }

