public class Country1 {

        double dept, gdp;

        double hasAcceptableRatio(){
            double debtToGdpRatio;
              debtToGdpRatio = (dept/gdp)*100;
              if(debtToGdpRatio>=50){
                  System.out.println(true);
              }else {
                  System.out.println(false);


              }
            return debtToGdpRatio;
        }
    }


