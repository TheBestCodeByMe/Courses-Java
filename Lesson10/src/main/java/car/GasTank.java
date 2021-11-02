package car;


import lombok.Getter;

@Getter
public class GasTank {
    private int fuel;
    private int totalVolumeFuel;

    public GasTank(int fuel, int totalVolumeFuel) {
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
