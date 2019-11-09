package actors;

public class Soldier extends Ant {

    private String lastDirection = "N";


    @Override
    public void selectDirection () {
        if (lastDirection.equals("N")) {
            lastDirection = "E";
            moveDirection = "E";
        } else if (lastDirection.equals("S")) {
            lastDirection = "W";
            moveDirection = "W";
        } else if (lastDirection.equals("W")) {
            lastDirection = "N";
            moveDirection = "N";
        } else {
            moveDirection = "S";
        }
    }


}
