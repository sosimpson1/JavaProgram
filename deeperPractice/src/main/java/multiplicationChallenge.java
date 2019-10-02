public class multiplicationChallenge {

    public static void main(String args[]){

        for(int i = 1; i<=10; i++){
            System.out.print("\t");
                System.out.print(i);
        }
        System.out.println();

        System.out.print("\t");
        System.out.print("----------------------------------------");
        for(int row = 1; row<=10; row++){
            for(int i = 1; i<=10; i++){
                System.out.print(i*row);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
