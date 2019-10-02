

    import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class betterShowOneRoom {
        public static void main(String args[]) throws FileNotFoundException {

            Scanner diskScanner = new Scanner(new File("Occupancy"));
            Scanner keyBoard = new Scanner(System.in);
            int whichRoom;

            System.out.println("Which room? ");
            whichRoom = keyBoard.nextInt();
            for (int roomNum = 0; roomNum < whichRoom && diskScanner.hasNext(); roomNum++) {
                diskScanner.nextInt();

            }
            if (diskScanner.hasNext()) {
                System.out.print("Room ");
                System.out.print(whichRoom);
                System.out.print(" has ");
                System.out.print(diskScanner.nextInt());
                System.out.print("guest(s). ");
            }
            keyBoard.close();
            diskScanner.close();

        }
    }


