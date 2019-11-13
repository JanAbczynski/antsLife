public class Main {

    private static int NUMBER_OF_QUEENS = 1;
    private static int NUMBER_OF_SOLDIERS = 0;
    private static int NUMBER_OF_WORKERS = 0;
    private static int NUMBER_OF_DRONES = 1;

    // todo before commiting changes, run a quick code reformat (default: ctrl + alt + l)
    //  and import cleanup (default: ctrl + alt + o)

    public static void main(String[] args) {

        Nest nest = new Nest();
        nest.simulateAntsLife(NUMBER_OF_QUEENS, NUMBER_OF_SOLDIERS, NUMBER_OF_WORKERS, NUMBER_OF_DRONES);

    }
}
