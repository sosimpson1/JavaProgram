import java.io.File;
import java.util.Scanner;

public class iHopeYouKnowWhatYouDoing {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        char reply;
        do {
            System.out.print("Reply with Y or N...");
            System.out.print("  Delete the importantData file? ");
            reply = in.findWithinHorizon(".", 0).charAt(0);
        }while (reply != 'Y'&& reply != 'N');

        if(reply=='Y'){
            new File("importantData.txt").delete();
            System.out.println("  Deleted!");
        }else{
            System.out.println(" No harm in asking");
        }
        in.close();
    }
}
