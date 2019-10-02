import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class forwardBackward {

    public static void main(String args [])throws FileNotFoundException {

        Scanner diskScanner = new Scanner(new File("Occupancy"));

        int guestIn[];

        guestIn= new int[10];
        for(int roomNum=0; roomNum < 10; roomNum++){
            guestIn[roomNum]= diskScanner.nextInt();
        }
        for(int roomNum = 9; roomNum >= 0; roomNum--){
            if (guestIn[roomNum]==0) {
                System.out.print("Room");
                System.out.print(roomNum);
                System.out.print("is vacant");

            }
        }
        diskScanner.close();
    }
}
