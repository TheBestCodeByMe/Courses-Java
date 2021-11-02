import car.Car;
import car.Engine;
import car.GasTank;

public class Main {
    public static void main(String[] args) {
        //Car car = new Car();
        Engine engine = new Engine("двигатель", "его тип");
        GasTank gasTank = new GasTank(56, 80);
        Car car1 = new Car(engine, gasTank);

        car1.startCar();
        car1.turnOffCar();
        car1.viewDistance();

        gasTank.setFuel(5);
        car1.viewFuel();

        gasTank.setFuel(100);

        car1.viewType();
    }
}
