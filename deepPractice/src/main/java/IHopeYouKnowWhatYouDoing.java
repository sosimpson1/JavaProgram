import java.io.File;
import java.util.Scanner;

public class IHopeYouKnowWhatYouDoing {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        char reply;

        do{
            System.out.println("reply with Y or N...");
            System.out.println("Delete the important file");
            reply = in.findWithinHorizon(".",0).charAt(0);

        }while (reply == 'Y' && reply == 'N');
        if(reply=='Y'){
            new File(" importantData.txt").delete();
            System.out.println("Deleted!");

        }else{
            System.out.println(" No harm in asking");
        }

        }
    }

