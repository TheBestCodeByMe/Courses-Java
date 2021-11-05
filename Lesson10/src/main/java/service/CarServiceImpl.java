package service;

import model.Car;
import model.Engine;
import model.TankFuel;

public class CarServiceImpl implements CarService {
    TankFuel tankFuel;
    Car car;
    Engine engine;
    EngineServiceImpl engineService;

    public CarServiceImpl(Car car) {
        this.car = car;
    }

    public void startCar() {
        tankFuel = car.getTankFuel();
        engine = car.getEngine();
        engineService = new EngineServiceImpl(car);
        if (tankFuel.getFuel() != 0) {
            engineService.start();
            System.out.println("\nМашина заведена.\n");
            tankFuel.setFuel(tankFuel.getFuel() - 10);
        } else {
            System.out.println("\nМашина не может ехать, бак пустой.\n");
        }
    }

    public void carGoes() {
        if (car.getStartedCar()) {
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
}
