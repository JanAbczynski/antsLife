package actors;

import java.util.Random;

public class Drone extends Ant {

    public Drone(){
    }

//    @Override
//    public void moveAnt (){
//        System.out.println("Drone");
//    }


@Override
    public void selectDirection (){
        if (positionX > 0){
            moveDirection = "E";
        } else if (positionX < 0){
            moveDirection = "W";
        }else if (positionY < 0){
            moveDirection = "N";
        }else{
            moveDirection = "S";
        }
}

}
