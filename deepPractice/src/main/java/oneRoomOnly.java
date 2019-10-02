import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class oneRoomOnly {

    public static void main(String args [])throws FileNotFoundException {
        Scanner keyBoard = new Scanner(System.in);

        Scanner diskScanner = new Scanner(new File("Occupancy"));


        System.out.print("which room? ");


        int whichRoom;

        whichRoom= keyBoard.nextInt();

        for(int roomNum=0; roomNum< whichRoom; roomNum++){
            diskScanner.nextInt();


        }

        System.out.print("Room ");
        System.out.print(whichRoom);
        System.out.print(" has ");
        System.out.print(diskScanner.nextInt());
        System.out.println("Guest(s). ");

        keyBoard.close();
        diskScanner.close();

    }
}


