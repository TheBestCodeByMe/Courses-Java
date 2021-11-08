public class Main {
    public static void main(String[] args) {
        Car1.GasTank gasTank = new Car1.GasTank(60, 100);
        Car1 car1 = new Car1(new Car1.Engine("engine1", "type1"), gasTank);

        car1.startCar();
        car1.turnOffCar();
        car1.viewDistance();
        car1.viewType();
        car1.viewFuel();
        gasTank.setFuel(60);
        car1.viewFuel();
    }
}
