package bodyTypes;

public class Coupe extends CarWithOptions {

    public Coupe() {
        setDescription("Coupe");
    }

    @Override
    public int cost() {
        return 30000;
    }
}
