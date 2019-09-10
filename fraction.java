import java.util.Scanner;

public class fraction {

    static void plusMinus(int[] arr){

        }
        public static void main(String [] args){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int arr = in.nextInt();
            int i;
            int po = 0; int ne=0; int ze = 0;
            for (i=0; i<n; i++){
                  if (arr < 0)
                      ne++;
                  else if (arr > 0)
                      po++;
                         else
                              ze++;
            }
            System.out.println(po / (double)n);
            System.out.println(ne / (double)n);
            System.out.println(ze / (double)n);
        }

    }

