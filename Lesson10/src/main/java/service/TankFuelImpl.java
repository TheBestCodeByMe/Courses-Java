package service;

import model.TankFuel;

public class TankFuelImpl implements TankFuelService {
    private final TankFuel tankFuel;

    public TankFuelImpl(TankFuel fuelTank) {
        this.tankFuel = fuelTank;
    }

    public void viewFuel() {
        System.out.println("\nОсталось " + tankFuel.getFuel() + " литров топлива.\n");
    }

    @Override
    public boolean isEmpty() {
        return tankFuel.getFuel() != 0;
    }
}
