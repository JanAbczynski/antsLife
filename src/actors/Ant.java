package actors;

import java.util.Random;

public abstract class Ant {
    protected int positionX;
    protected int positionY;
    protected int testField;
    protected String moveDirection;
    private static int gridSizeX = 100;
    private static int gridSizeY = 100;

    public Ant(){
        testField = 3;

        Random random = new Random();
        setPositionX(random.nextInt(gridSizeX) - gridSizeX / 2);
        setPositionY(random.nextInt(gridSizeY) - gridSizeY / 2);
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
        System.out.println("org");
        moveDirection = "E";
    }

    public void selectStepDistance(){
    }

    public void changePosition(){
        switch (moveDirection){
            case "N":
                System.out.println("n");
                positionY ++;
                break;
            case "S":
                System.out.println("s");
                positionY --;
                break;
            case "E":
                System.out.println("e");
                positionX --;
                break;
            case "W":
                System.out.println("w");
                positionX ++;
                break;
        }
    }




}
