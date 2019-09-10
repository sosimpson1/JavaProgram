import java.util.List;
import java.util.Scanner;

import static java.lang.Math.abs;

public class differences {



    public static void main(String [] args){
        int n ;
        int i ;
        int j = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[][] arr = new int[n][j];
            int d1 = 0;
            int d2 = 0;

         for (i = 0; i<n; i++) {
             d1 = arr [i][i];
             for (j = 0; j<n; j++) {
                 d2 += d2 + in.nextInt();
                 d2 += arr[j][n - 1 - j];

             }
        }
         int diff = Math.abs(d1-d2);
        System.out.println( diff);
    }
}
