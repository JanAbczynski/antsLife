import actors.Drone;
import actors.Queen;
import actors.Soldier;
import actors.Worker;

public class Main {

    private static int NUMBER_OF_QUEENS = 1;
    private static int NUMBER_OF_SOLDIERS = 0;
    private static int NUMBER_OF_WORKERS = 0;
    private static int NUMBER_OF_DRONES = 1;


    public static void main(String[] args) {

        Colony colony = new Colony();
        CreateColony(colony);
        colony.prepareNest();
        colony.timeStep();



    }


    public static void CreateColony(Colony colony){



        for (int i = 0; i < NUMBER_OF_QUEENS; i++){
            colony.addAnt(new Queen(0,0));
        }
        for (int i = 0; i < NUMBER_OF_WORKERS; i++){
            colony.addAnt(new Worker());
        }
        for (int i = 0; i < NUMBER_OF_SOLDIERS; i++){
            colony.addAnt(new Soldier());
        }
        for (int i = 0; i < NUMBER_OF_DRONES; i++){
            colony.addAnt(new Drone());
        }


//        System.out.println("");


    }
}
