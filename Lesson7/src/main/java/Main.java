public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Car.Engine("engine", "type"), new Car.GasTank(60, 100));
        car.startCar();
        car.turnOffCar();
        car.viewDistance();
        Car.Engine.viewType();
        Car.GasTank.viewFuel();
        Car.Engine.setType("type1");
        Car.Engine.viewType();
        Car.GasTank.setFuel(90);
    }
}
