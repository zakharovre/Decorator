package options;

import bodyTypes.CarWithOptions;

public class Doors extends Option{
    CarWithOptions carWithOptions;

    public Doors(CarWithOptions carWithOptions){
        this.carWithOptions = carWithOptions;
    }

    @Override
    public int cost() {
        return 2000 + carWithOptions.cost();
    }

    @Override
    public String getDescription() {
        return carWithOptions.getDescription()+ ", 4 doors";
    }
}
