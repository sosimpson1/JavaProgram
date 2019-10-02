import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisplayHotelData {

    public static void main(String args[])throws FileNotFoundException {
        Scanner diskScanner = new Scanner(new File("hotelData.txt"));

        for (int floor = 1; floor <= 9; floor++){
        System.out.println("Floor");
        System.out.println(floor);
        System.out.println(": ");
              for(int room = 1; room <= 20; room++){
                  System.out.print(diskScanner.nextInt());
                  System.out.println(' ');
              }
            System.out.println();

    }



       diskScanner.close();
    }
}
