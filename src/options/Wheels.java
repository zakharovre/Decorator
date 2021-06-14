package options;

import bodyTypes.CarWithOptions;

public class Wheels extends Option{
    CarWithOptions carWithOptions;

    public Wheels(CarWithOptions carWithOptions){
        this.carWithOptions = carWithOptions;
    }

    @Override
    public int cost() {
        return 1000 + carWithOptions.cost();
    }

    @Override
    public String getDescription() {
        return carWithOptions.getDescription()+ ", 4 wheels";
    }
}
