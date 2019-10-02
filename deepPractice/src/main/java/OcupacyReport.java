import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OcupacyReport {

    public static void main(String args [])throws FileNotFoundException {
      Scanner diskScanner = new Scanner(new File("Occupancy"));

        System.out.print("Room\tGuests");


        for(int roomNum=0; roomNum<10; roomNum++){
            System.out.print(roomNum);
            System.out.print("\t");
            System.out.println(diskScanner.nextInt());
        }
        diskScanner.close();
    }

}
