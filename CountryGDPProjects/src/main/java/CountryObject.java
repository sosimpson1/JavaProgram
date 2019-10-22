import java.util.Scanner;

public class CountryObject {

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        Country country1 = new Country();
        System.out.println(" country1Dept");
        country1.dept1 = keyboard.nextDouble();
        System.out.println(" country1GDP");
        country1.gdp1 = keyboard.nextDouble();

        double country1deptToGdp = (country1.dept1/country1.gdp1)*100;
        System.out.println(country1deptToGdp);
        if(country1deptToGdp >= 50){
            System.out.println(" its is acceptable GDP");
        }else {
            System.out.println(" it is not acceptab;e");
        }

        Country country2 = new Country();
        System.out.println(" country2Dept");
        country2.dept2 = keyboard.nextDouble();
        System.out.println(" country2GDP");
        country2.gdp2 = keyboard.nextDouble();

        double country2deptToGdp = (country2.dept2/country2.gdp2)*100;
        System.out.println(country2deptToGdp);

        if(country1deptToGdp >= 50){
            System.out.println(" its is acceptable GDP");
        }else {
            System.out.println(" it is not acceptab;e");
    }

        Country country3 = new Country();
        System.out.println(" country1Dept");
        country3.dept3 = keyboard.nextDouble();
        System.out.println(" country1Dept");
        country3.gdp3 = keyboard.nextDouble();

        double country3deptToGdp = (country3.dept3/country3.gdp3)*100;
        System.out.println(country3deptToGdp);

        if(country1deptToGdp >= 50){
            System.out.println(" its is acceptable GDP");
        }else {
            System.out.println(" it is not acceptab;e");
        }
}
}



