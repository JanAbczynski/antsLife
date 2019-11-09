import actors.Ant;
import actors.Queen;

import java.util.ArrayList;

public class Colony {

    private ArrayList<Ant> colony = new ArrayList<>();
    private static int MOVES_TO_MAKE = 100;


    public void addAnt(Ant ant){
        colony.add(ant);
    }


    public void timeStep(){

        for (int i =0; i < MOVES_TO_MAKE; i++){

            for (int j=0; j < colony.size(); j++){

                Ant oneAnt = colony.get(j);

                if(!(oneAnt instanceof Queen)){
                    oneAnt.moveAnt();
                }
            }


        }

        
    }
}



