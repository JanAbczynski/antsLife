package actors;

import java.util.Random;

public class Queen extends Ant {
//    boolean queensGoodMood = false;
    static int chanceForGoogMod = 30;

    public Queen(int posX, int posY) {
        positionX = gridCenterX;
        positionY = gridCenterY;
        setAntSymbol("Q");
    }

    @Override
    public void checkSpecialAction(){

        changeMood();

    }

    private void changeMood(){
        Random random = new Random();
        if(random.nextInt(100) > chanceForGoogMod){
            queensGoodMood = true;
        } else {
            queensGoodMood = false;
        }
    }

}
