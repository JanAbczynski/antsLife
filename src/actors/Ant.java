package actors;

import java.util.Random;

public abstract class Ant {
    protected int positionX;
    protected int positionY;
    protected int testField;
    protected String moveDirection;
    protected int gridSizeX;
    protected int gridSizeY;
    protected int gridCenterX = gridSizeX / 2;
    protected int gridCenterY = gridSizeY / 2;
    static boolean queensGoodMood = false;
    protected int stepDistance = 1;
    protected String antSymbol;


    public Ant(int XSize, int YSize){

        this.gridSizeX = XSize;
        this.gridSizeY = YSize;

        Random random = new Random();
        setPositionX(random.nextInt(gridSizeX));
        setPositionY(random.nextInt(gridSizeY));
    }

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




    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }


//    public abstract void moveAnt();

    public void moveAnt(boolean thereIsWasp){
        selectDirection();
        selectStepDistance(thereIsWasp);
        changePosition();



//        System.out.println(getClass().getSimpleName());
    }

    public void selectDirection(){
//        System.out.println("org");
        moveDirection = "E";
    }

    public void selectStepDistance(boolean thereIsWasp){
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
