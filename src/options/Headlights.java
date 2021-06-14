package options;

import bodyTypes.CarWithOptions;

public class Headlights extends Option{
    CarWithOptions carWithOptions;

    public Headlights (CarWithOptions carWithOptions){
        this.carWithOptions = carWithOptions;
    }

    @Override
    public int cost() {
        return 500 + carWithOptions.cost();
    }

    @Override
    public String getDescription() {
        return carWithOptions.getDescription()+ ", headlights";
    }
}
