package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TankFuel {
    private int fuel;
    private int totalVolumeFuel;

    public TankFuel(int fuel, int totalVolumeFuel) {
        this.fuel = fuel;
        this.totalVolumeFuel = totalVolumeFuel;
    }

    public void setFuel(int fuel) {
        if ((this.fuel + fuel) < totalVolumeFuel) {
            this.fuel = fuel;
        } else {
            System.out.println("\nОбъём бензопака меньше, чем вы хотите в него залить.\nОбъём равен " + totalVolumeFuel + " литров.\n");
        }
    }
}
