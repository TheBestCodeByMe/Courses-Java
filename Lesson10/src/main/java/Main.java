import model.Car;
import model.Engine;
import model.TankFuel;
import service.CarServiceImpl;
import service.TankFuelImpl;

public class Main {
    public static void main(String[] args) {
        TankFuel tankFuel = new TankFuel(90, 900);
        Car car = new Car(new Engine("engine", "type"), tankFuel);

        CarServiceImpl carService = new CarServiceImpl(car);
        TankFuelImpl tankFuelService = new TankFuelImpl(car);

        carService.startCar();
        carService.turnOffCar();

        carService.viewDistance();
        tankFuelService.viewFuel();
        tankFuel.setFuel(90000);
        tankFuelService.viewFuel();
    }
}
