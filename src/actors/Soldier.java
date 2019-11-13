package actors;

public class Soldier extends Ant {

    // todo don't use plain Strings here. Maybe a constant?
    private String lastDirection = "N";

    public Soldier(int XSize, int YSize) {
        super(XSize, YSize);
        // todo don't use plain Strings here. Maybe a constant?
        setAntSymbol("S");
    }


    // todo if Soldier class doesn't require a distinct action, then this method is not needed
    @Override
    public void checkSpecialAction() {

    }


    @Override
    public void selectDirection() {
        //todo don't use plain Strings here. Maybe some structure that behaves like a constant?
        if (moveDirection == null) {
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
