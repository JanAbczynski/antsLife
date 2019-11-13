package actors;

import java.util.Random;

public class Queen extends Ant {
    //    boolean queensGoodMood = false;
    static int chanceForGoogMod = 30;

    // fixme unused parameters
    public Queen(int XSize, int YSize, int posX, int posY) {
        super(XSize, YSize);

        positionX = gridCenterX;
        positionY = gridCenterY;
        // todo don't use plain Strings here. Maybe a constant?
        setAntSymbol("Q");
    }

    @Override
    public void checkSpecialAction() {

        changeMood();

    }

    private void changeMood() {
        Random random = new Random();
        // todo this could be simplified
        if (random.nextInt(100) > chanceForGoogMod) {
            queensGoodMood = true;
        } else {
            queensGoodMood = false;
        }
    }

}
