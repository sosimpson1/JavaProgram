import java.util.Scanner;

public class combination {

    public static void main(String [] args){
        Scanner in  = new Scanner(System.in);
        double price = 0.0;
        int age;

        char reply;

        System.out.println("how old are u");



        age = in.nextInt();
        System.out.println("have a coupon? (Y/N)");
        reply = in.findWithinHorizon(".",0).charAt(0);


        if(age<=12 || age>=65 ){
            price = 5.25;
        }if(age> 12 && age <65){
            price = 9.25;

        }if(reply == 'Y' || reply == 'y'){
            price -=2.00;


        }
        if(reply != 'Y' && reply !='y' && reply !='N' && reply!='n'){
            System.out.println("hug? ");
        }
        System.out.println("$");
        System.out.println(price);
        System.out.println("enjoy the show");
    }
}
