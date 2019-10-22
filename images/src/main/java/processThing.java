import java.util.Scanner;

public class processThing {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Thing thing1 = new Thing();
        thing1.value1 = scanner.nextInt();
        thing1.value2 = scanner.nextInt();


        System.out.print("This thing has values of ");
        System.out.print(thing1.value1);
        System.out.print(" And ");
        System.out.print(thing1.value2);
    }
}
