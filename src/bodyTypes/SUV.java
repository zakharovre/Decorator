package bodyTypes;


public class SUV extends CarWithOptions {

    public SUV() {
        setDescription("SUV");
    }

    @Override
    public int cost() {
        return 40000;
    }
}

