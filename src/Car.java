import bodyTypes.CarWithOptions;
import bodyTypes.Coupe;
import bodyTypes.SUV;
import options.Doors;
import options.Headlights;
import options.Wheels;

public class Car {
    public static void main(String[] args) {
        CarWithOptions car = new SUV();
        System.out.println(car.getDescription() + " costs " + car.cost()+ "$");

        CarWithOptions car2 = new Wheels(new Doors(new Headlights( new Coupe())));
        System.out.println(car2.getDescription() + " costs " + car2.cost()+ "$");

    }
}
