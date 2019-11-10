package actors;

import java.util.Random;

public class Worker extends Ant {

    public Worker(){
        setAntSymbol("W");
    }

    @Override
    public void checkSpecialAction(){

    }


    @Override
    public void selectDirection () {
        Random random = new Random();
        int chosenDirection = random.nextInt(4) + 1;
        System.out.println(chosenDirection);

        switch (chosenDirection){
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
        stepDistance = 1;
        if (thereIsWasp) {
            stepDistance = 0;
        }

    }

}
