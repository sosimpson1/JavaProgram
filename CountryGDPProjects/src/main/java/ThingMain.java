import java.util.Scanner;

public class ThingMain {

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        Thing thing1 = new Thing();
        System.out.println("Thing 1");
        System.out.print("value1? ");
        thing1.value1 = keyboard.nextInt();
        System.out.print("value2? ");
        thing1.value2 = keyboard.nextInt();
        System.out.println();

        System.out.println("Thing 2");
        Thing thing2 = new Thing();
        System.out.print("value1? ");
        thing2.value1 = keyboard.nextInt();
        System.out.print("value2? ");
        thing2.value2 = keyboard.nextInt();
        System.out.println();

        System.out.println("Thing 3");
        Thing thing3 = new Thing();
        System.out.print("value1? ");
        thing3.value1 = keyboard.nextInt();
        System.out.print("value2? ");
        thing3.value2 = keyboard.nextInt();
        System.out.println();

        System.out.print("Thing 1 has values ");
        System.out.print(thing1.value1);
        System.out.print(" and ");
        System.out.print(thing1.value2);
        System.out.println(".");

        System.out.print("Thing 2 has values ");
        System.out.print(thing2.value1);
        System.out.print(" and ");
        System.out.print(thing2.value2);
        System.out.println(".");

        System.out.print("Thing 3 has values ");
        System.out.print(thing3.value1);
        System.out.print(" and ");
        System.out.print(thing3.value2);
        System.out.println(".");


        keyboard.close();
    }
}
