package actors;

import java.util.Random;

public class Drone extends Ant {

    private int pauseMove = 0;
    private boolean onDate = false;
    private boolean runAction = true;
    private int nextMoveSteps = 1;


    public Drone(int XSize, int YSize){
        super(XSize, YSize);
        setAntSymbol("D");
    }

//    @Override
//    public void moveAnt (){
//        System.out.println("Drone");
//    }

    @Override
    public void checkSpecialAction(){

        dateWithQueen();
    }

    private void dateWithQueen(){
        if ((positionX < gridCenterX + 3 && positionX > gridCenterX - 3)
                && (positionY < gridCenterY + 3 && positionY > gridCenterY - 3)
                && runAction){

//            action
            if (queensGoodMood){
                pauseMove = 10;
                onDate = true;
                runAction = false;
                System.out.println("action start. Say: HALLELUJAH");

//                kicked
            } else {
                onDate = false;
                nextMoveSteps = 100;
                System.out.println("kicked. Say: D'OH");
            }

//            action in progress
        } else if (!runAction && pauseMove > 0){
            System.out.println("action in progress");
            pauseMove --;

//            after action
        } else if (!runAction && pauseMove == 0){
            System.out.println("after action");
            runAction = true;
            onDate = false;
            Random random = new Random();
            nextMoveSteps = random.nextInt(100);

        }



    }

    @Override
    public void selectStepDistance(boolean thereIsWasp){
        stepDistance = nextMoveSteps;
        nextMoveSteps = 1;
        if (thereIsWasp){
            stepDistance = 0;
        }

    }

@Override
    public void selectDirection (){
        if (positionX > gridCenterX){
            moveDirection = "E";
        } else if (positionX < gridCenterX){
            moveDirection = "W";
        }else if (positionY < gridCenterY){
            moveDirection = "N";
        }else{
            moveDirection = "S";
        }
}

}
