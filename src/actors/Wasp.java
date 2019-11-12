package actors;

public class Wasp extends Ant{

    public Wasp(int XSize, int YSize){
        super(XSize, YSize);
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
