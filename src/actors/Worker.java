package actors;

import java.util.Random;

public class Worker extends Ant {

    public Worker(int XSize, int YSize) {
        super(XSize, YSize);
        // todo constant?
        setAntSymbol("W");
    }

    // fixme empty method body
    @Override
    public void checkSpecialAction() {

    }


    @Override
    public void selectDirection() {
        Random random = new Random();
        int chosenDirection = random.nextInt(4) + 1;
        System.out.println(chosenDirection);
        //todo don't use plain Strings here. Maybe some structure that behaves like a constant?
        switch (chosenDirection) {
            case 1:
                moveDirection = "N";
                break;
            case 2:
                moveDirection = "S";
                break;
            case 3:
                moveDirection = "W";
                break;
            case 4:
                moveDirection = "E";
                break;
        }
    }

    @Override
    public void selectStepDistance(boolean thereIsWasp) {
        // todo this could be simplified: stepDistance = thereIsWasp ? 1 : 0;
        stepDistance = 1;
        if (thereIsWasp) {
            stepDistance = 0;
        }

    }

}
