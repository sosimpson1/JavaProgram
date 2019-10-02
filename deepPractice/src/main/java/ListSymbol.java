public class ListSymbol {


        enum Symbol{
            cherry, lemon, kumquat, rutabaga
        }
        public static void main(String args[]){
            for(Symbol rightReel : Symbol.values()){
                System.out.println(rightReel);
            }
        }
    }

