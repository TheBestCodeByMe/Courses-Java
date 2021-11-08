import model.Car;
import model.Engine;
import model.TankFuel;
import service.CarService;
import service.CarServiceImpl;

public class Main {
    public static void main(String[] args) {
        TankFuel tankFuel = new TankFuel(600, 900);
        Car car = new Car(new Engine("engine", "type"), new TankFuel(600, 900));

        CarService carService = new CarServiceImpl(car);

        carService.startCar();
        carService.turnOffCar();

        carService.viewDistance();
        carService.viewFuel();
        carService.viewFuel();
        tankFuel.setFuel(90000);
        carService.viewFuel();
    }
}
