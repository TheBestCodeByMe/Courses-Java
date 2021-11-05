package service;


import model.Car;
import model.Engine;

public class EngineServiceImpl implements EngineService {
    private Car car;
    private Engine engine;

    public EngineServiceImpl(Car car) {
        this.car = car;
    }

    @Override
    public void start() {
        engine = car.getEngine();
        System.out.println("\nДвигатель включён.\n");
        car.setStartedCar(true);
    }

    @Override
    public void stop() {
        System.out.println("\nДвигатель выключён.\n");
        car.setStartedCar(false);
    }

    public void viewType() {
        System.out.println("\nТип двигателя " + engine.getType() + "\n");
    }
}
