package actors;

import java.util.Random;

public abstract class Ant {
    protected int positionX;
    protected int positionY;
    protected int testField;
    protected String moveDirection;
    private static int gridSizeX = 40;
    private static int gridSizeY = 40;
    protected static int gridCenterX = gridSizeX / 2;
    protected static int gridCenterY = gridSizeY / 2;
    static boolean queensGoodMood = false;
    protected int stepDistance = 1;
    protected String antSymbol;

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

    public static int getGridSizeX() {
        return gridSizeX;
    }

    public static int getGridSizeY() {
        return gridSizeY;
    }

    public Ant(){
        testField = 3;

        Random random = new Random();
        setPositionX(random.nextInt(gridSizeX));
        setPositionY(random.nextInt(gridSizeY));
//        setPositionX(random.nextInt(gridSizeX) - gridSizeX / 2);
//        setPositionY(random.nextInt(gridSizeY) - gridSizeY / 2);
    }


    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }


//    public abstract void moveAnt();

    public void moveAnt(){
        selectDirection();
        selectStepDistance();
        changePosition();



//        System.out.println(getClass().getSimpleName());
    }

    public void selectDirection(){
//        System.out.println("org");
        moveDirection = "E";
    }

    public void selectStepDistance(){
        stepDistance = 1;
    }

    public void changePosition(){
        switch (moveDirection){
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
