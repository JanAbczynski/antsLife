package actors;

public class Soldier extends Ant {

    private String lastDirection = "N";

    @Override
    public void checkSpecialAction(){

    }


    @Override
    public void selectDirection () {
        if(moveDirection == null){
            moveDirection = "N";
        }
        if (moveDirection.equals("N")) {
            moveDirection = "E";
        } else if (moveDirection.equals("S")) {
            moveDirection = "W";
        } else if (moveDirection.equals("W")) {
            moveDirection = "N";
        } else {
            moveDirection = "S";
        }
    }


}
