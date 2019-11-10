package actors;

public class Wasp extends Ant{

    public Wasp(){
        setAntSymbol("X");
        stepDistance = 0;
    }

    @Override
    public void checkSpecialAction() {

    }

    @Override
    public void selectStepDistance(boolean thereIsWasp){
        stepDistance = 0;

    }
}
