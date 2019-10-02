import java.util.Scanner;

public class dashModified3 {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int howMany=in.nextInt();
        for(int row=0; row<howMany; row++) {
            for (int i=1; i<howMany -row +1; i++){
                System.out.print('-');

            }
            System.out.println('/');
        }
    }
}

