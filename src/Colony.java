import actors.Ant;
import actors.Queen;
import actors.Wasp;

import java.util.ArrayList;
import java.util.Random;

// fixme read all the LINT issues and fix them
public class Colony {
    //fixme don't declare a concrete type. This should be:
    // private List<Ant> colony = new ArrayList<>();
    private ArrayList<Ant> colony = new ArrayList<>();
    private int gridSizeX;
    private int gridSizeY;
    //nit This should be String[][] antNest instead
    private String antNest[][];
    private static int chanceForWasp = 10;
    private static boolean thereIsWasp = false;


    void addAnt(Ant ant) {
        colony.add(ant);
    }

    void prepareNest() {
        antNest = new String[gridSizeX][gridSizeY];
    }

    private void fillUpNest() {
        // for loop inside a for loop inside a for loop -> is it really necessary?
        for (int x = 0; x < gridSizeX; x++) {
            for (int y = 0; y < gridSizeY; y++) {
                antNest[x][y] = findAnt(x, y);
            }
        }
    }

    private String findAnt(int x, int y) {
        // fixme if you change it to a foreach loop, it would simplify your code
        for (int i = 0; i < colony.size(); i++) {
            int antPosX = colony.get(i).getPositionX();
            int antPosY = colony.get(i).getPositionY();
            if (antPosX == x && antPosY == y) {
                return colony.get(i).getAntSymbol();
            }
        }
        return " ";
    }


    private void generateWasp() {
        Random random = new Random();
        //nit magic number
        //nit waspFactor is not necessary to be assigned to a variable
        int waspFactor = random.nextInt(100);
        if (waspFactor > chanceForWasp) {
            addAnt(new Wasp(gridSizeX, gridSizeY));

        }
    }

    private void printNest() {
        for (int x = 0; x < gridSizeX; x++) {
//            System.out.println(java.util.Arrays.toString(antNest[x]));
            String oneLine = "";
            // fixme String concat in a loop - this is a very bad practice.
            // StringBuffer or StringBuilder should be used instead
            for (int y = 0; y < gridSizeY; y++) {
                oneLine += antNest[x][y];
            }
            System.out.println(oneLine);

        }
    }

    void timeStep() {

        clearDisplay();

//        for (int i =0; i < MOVES_TO_MAKE; i++){
        //FIXME ARE YOU KIDDING ME??? "while (true)"???
        while (true) {
            fillUpNest();
            printNest();
//            thereIsWasp = false;

            System.out.println("");
            // fixme a foreach loop would simplify this code
            for (int j = 0; j < colony.size(); j++) {
                Ant oneAnt = colony.get(j);

                oneAnt.checkSpecialAction();
                if (!(oneAnt instanceof Queen)) {
                    oneAnt.moveAnt(thereIsWasp);
                }


            }
            checkIsWaspInNest();

            if (!thereIsWasp) {
//                generateWasp();
            }
        }
    }

    private void checkIsWaspInNest() {

        thereIsWasp = false;
        // fixme a foreach loop would simplify this code
        for (int j = 0; j < colony.size(); j++) {
            Ant oneAnt = colony.get(j);
            // todo read the lint hints.
            if (oneAnt instanceof Wasp) {
                thereIsWasp = true;
            }

        }
    }

    private void clearDisplay() {

    }
}



