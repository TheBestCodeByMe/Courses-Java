package service;

import model.Car;
import model.TankFuel;

public class TankFuelImpl implements TankFuelService {
    Car car;
    TankFuel tankFuel;

    public TankFuelImpl(Car car) {
        this.car = car;
    }

    public void viewFuel() {
        tankFuel = car.getTankFuel();
        System.out.println("\nОсталось " + tankFuel.getFuel() + " литров топлива.\n");
    }
}
