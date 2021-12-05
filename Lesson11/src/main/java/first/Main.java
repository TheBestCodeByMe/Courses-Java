package first;

import first.model.Car;
import first.model.Engine;
import first.model.TankFuel;
import first.my_exception.MyException;
import first.service.CarService;
import first.service.CarServiceImpl;

public class Main {
    public static void main(String[] args) {
        TankFuel tankFuel = new TankFuel(600, 900);
        Car car = new Car(new Engine("engine", "type"), new TankFuel(600, 900), "Audi", 300, 1000000);

        CarService carService = new CarServiceImpl(car);

        try {
            carService.startCar();

            carService.turnOffCar();

            carService.viewDistance();
            carService.viewFuel();
            carService.viewFuel();
            tankFuel.setFuel(90000);
            carService.viewFuel();
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }
    }
}
