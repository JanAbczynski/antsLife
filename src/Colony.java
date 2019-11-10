import actors.Ant;
import actors.Queen;
import actors.Wasp;

import java.util.ArrayList;
import java.util.Random;

public class Colony {

    private ArrayList<Ant> colony = new ArrayList<>();
    private static int MOVES_TO_MAKE = 100;
    private static int gridSizeX;
    private static int gridSizeY;
    private String antNest[][];
    private static int chanceForWasp = 10;
    private static boolean thereIsWasp = false;


    void addAnt(Ant ant){
        colony.add(ant);

    }

    void prepareNest (){
        gridSizeY = Ant.getGridSizeY();
        gridSizeX = Ant.getGridSizeX();
        antNest = new String [gridSizeX][gridSizeY];
    }

    private void fillUpNest(){

        for (int x = 0; x < gridSizeX; x++){
            for (int y = 0; y < gridSizeY; y++){
                antNest[x][y] = findAnt(x, y);
            }
        }
    }

    private String findAnt(int x, int y){
        for (int i = 0; i < colony.size(); i ++){
            int antPosX = colony.get(i).getPositionX();
            int antPosY = colony.get(i).getPositionY();
            if (antPosX == x && antPosY == y){
                return colony.get(i).getAntSymbol();
            }
        }
        return " ";
    }


    private void generateWasp(){
        Random random = new Random();
        int waspFactor = random.nextInt(100);
        if (waspFactor > chanceForWasp){
            addAnt(new Wasp());

        }
    }



    private void printNest(){
        for (int x = 0; x < gridSizeX; x++){
//            System.out.println(java.util.Arrays.toString(antNest[x]));
            String oneLine = "";

            for (int y = 0; y < gridSizeY; y++){
                oneLine += antNest[x][y];
            }
            System.out.println(oneLine);

            }
        }


    void timeStep(){

        clearDisplay();

//        for (int i =0; i < MOVES_TO_MAKE; i++){
        while (true){
            fillUpNest();
            printNest();
//            thereIsWasp = false;

            System.out.println("");
            for (int j=0; j < colony.size(); j++){
                Ant oneAnt = colony.get(j);

                oneAnt.checkSpecialAction();
                if(!(oneAnt instanceof Queen)){
                    oneAnt.moveAnt(thereIsWasp);
                }


            }
            checkIsWaspInNest();

            if(!thereIsWasp){
                generateWasp();
            }
        }
    }

    private void checkIsWaspInNest(){

        thereIsWasp = false;
        for (int j=0; j < colony.size(); j++){
            Ant oneAnt = colony.get(j);
            if(oneAnt instanceof Wasp){
                thereIsWasp = true;
            }

        }
    }

    private void clearDisplay(){

    }
}



