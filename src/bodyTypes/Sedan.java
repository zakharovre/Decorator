package bodyTypes;

public class Sedan extends CarWithOptions {

    public Sedan(){
        setDescription("Sedan");
    }

    @Override
    public int cost() {
        return 20000;
    }
}
