public class handsUp {

    enum Game{
        rock, paper, scissors


    }
    public static void main(String args[]){

        for(Game leftHeel : Game.values()){
            for(Game rightHeel : Game.values() ){
                System.out.println(leftHeel);
                System.out.println(" ");
                System.out.println(rightHeel);
            }
        }
    }
}

