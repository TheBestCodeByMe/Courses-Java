package first.service;


import first.model.Car;
import first.model.Engine;
import first.model.TankFuel;
import first.my_exception.MyException;

import java.util.Random;

public class CarServiceImpl implements CarService {
    private TankFuel tankFuel;
    private final Car car;
    private Engine engine;
    private final EngineServiceImpl engineService;
    //private final EngineService engineService;
    private final TankFuelImpl fuelTankService;
    Random random = new Random();

    public CarServiceImpl(Car car) {
        this.car = car;
        this.engineService = new EngineServiceImpl(car.getEngine());
        this.fuelTankService = new TankFuelImpl(car.getTankFuel());
    }

    public void startCar() throws MyException {
        int number = random.nextInt();
        if (number % 2 != 0) {
            tankFuel = car.getTankFuel();
            if (fuelTankService.isEmpty()) {
                engineService.start();
                System.out.println("\nМашина " + car.getBrand() + " заведена.\n");
                tankFuel.setFuel(tankFuel.getFuel() - 10);
            } else {
                System.out.println("\nМашина не может ехать, бак пустой.\n");
            }
        } else {
            throw new MyException("Было сгенерировано чётное число: " + number + ". ");
        }
    }

    public void carGoes() {
        // это и есть проверка на работу двигателя
        if (engine.isStartedCar()) {
            System.out.println("\nМашина поехала.\n");
        }
    }

    public void turnOffCar() {
        engineService.stop();
        System.out.println("\nМашина заглушена.\n");
        car.setDistance(car.getDistance() + 100);
    }

    public void viewDistance() {
        System.out.println("\nМашина проехала " + car.getDistance() + " км.\n");
    }

    public void viewFuel() {
        fuelTankService.viewFuel();
    }
}
