public class ListCombinations {

    enum Symbol {
        cherry, chocolate, lemon, kumquat, rutabaga

    }
        public static void main(String args[]){

            for(Symbol leftReel : Symbol.values()){
                for(Symbol midReel : Symbol.values()){
                    for(Symbol rightReel : Symbol.values()){
                        System.out.println(leftReel);
                        System.out.println();
                        System.out.println(midReel);
                        System.out.println();
                        System.out.println(rightReel);
                    }
                }
            }
    }
}
