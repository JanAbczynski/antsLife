package actors;

import java.util.Random;

public class Worker extends Ant {

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

}
