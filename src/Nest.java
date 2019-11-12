import actors.*;

public class Nest {

    Colony colony = new Colony();
    protected static int gridSizeXX = 50;
    protected static int gridSizeYY = 50;

    public Nest(){

    }

    public void simulateAntsLife(int numberOfQueens, int numberOfSoldier, int numberOfWorkers, int numberOfDrones){

        createColony(numberOfQueens, numberOfSoldier, numberOfWorkers, numberOfDrones, gridSizeXX, gridSizeYY);
        colony.timeStep();
        prepareNest();

    }




    public void createColony(int numberOfQueens, int numberOfSoldier, int numberOfWorkers, int numberOfDrones, int gridSizeX, int gridSizeY){


        for (int i = 0; i < numberOfQueens; i++){
            colony.addAnt(new Queen(gridSizeX, gridSizeY, 0,0));
        }
//        for (int i = 0; i < numberOfWorkers; i++){
//            colony.addAnt(new Worker(gridSizeX, gridSizeY));
//        }
//        for (int i = 0; i < numberOfSoldier; i++){
//            colony.addAnt(new Soldier(gridSizeX, gridSizeY));
//        }
//        for (int i = 0; i < numberOfDrones; i++){
//            colony.addAnt(new Drone(gridSizeX, gridSizeY));
//        }
    }

    public void prepareNest(){

    }
}
