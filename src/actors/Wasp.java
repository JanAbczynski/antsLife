package actors;

public class Wasp extends Ant{

    public Wasp(){
        setAntSymbol("X");
    }

    @Override
    public void checkSpecialAction() {

    }

    @Override
    public void selectStepDistance(){
        stepDistance = 0;

    }
}
