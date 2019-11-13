package actors;

import java.util.Random;

public abstract class Ant {
    // todo read the lint hints
    protected int positionX;
    protected int positionY;
    protected int testField;
    protected String moveDirection;
    // todo gridSizeX and gridSIzeY variables are unnecessary
    protected int gridSizeX;
    protected int gridSizeY;
    // fixme initialization of gridCenterX and gridCenterY shouldn't be here.
    //  If it's here, the values are 0 (because gridSizeX and Y are 0 during declaration)
    protected int gridCenterX = gridSizeX / 2;
    protected int gridCenterY = gridSizeY / 2;
    // nit why is this variable here? Shouldn't it be in the Nest class?
    static boolean queensGoodMood = false;
    protected int stepDistance = 1;
    protected String antSymbol;


    public Ant(int XSize, int YSize) {

        this.gridSizeX = XSize;
        this.gridSizeY = YSize;

        Random random = new Random();
        // todo gridSizeX is unnecessary here. Just use XSize and YSize
        setPositionX(random.nextInt(gridSizeX));
        setPositionY(random.nextInt(gridSizeY));
    }

    // fixme setter methods should have some validation.
    //  e.g. should the antSymbol be allowed to be empty? or null?
    public void setAntSymbol(String antSymbol) {
        this.antSymbol = antSymbol;
    }

    public String getAntSymbol() {
        return antSymbol;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }


    // fixme setter methods should have some validation.
    //  e.g. should the position be allowed to be bigger than the size of the grid?
    //  or smaller than 0?
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }


//    public abstract void moveAnt();

    public void moveAnt(boolean thereIsWasp) {
        selectDirection();
        selectStepDistance(thereIsWasp);
        changePosition();


//        System.out.println(getClass().getSimpleName());
    }

    public void selectDirection() {
//        System.out.println("org");
        moveDirection = "E";
    }

    public void selectStepDistance(boolean thereIsWasp) {
        stepDistance = 1;
    }

    // todo don't use Strings as Direction. Use a different data structure.
    //  Do you know of any, that behave a bit like constants?
    public void changePosition() {
        switch (moveDirection) {
            case "N":
//                System.out.println("n");
                positionY += stepDistance;
                break;
            case "S":
//                System.out.println("s");
                positionY -= stepDistance;
                break;
            case "E":
//                System.out.println("e");
                positionX -= stepDistance;
                break;
            case "W":
//                System.out.println("w");
                positionX += stepDistance;
                break;
        }
    }


    public abstract void checkSpecialAction();


}
