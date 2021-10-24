public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(car.new Engine("engine", "type"), car.new GasTank(60, 100));
        Car.Engine engine = car.new Engine();
        Car.GasTank gas = car.new GasTank();
        car.startCar();
        car.turnOffCar();
        car.viewDistance();
        engine.viewType();
        engine.setType("type1");
        engine.viewType();
        gas.viewFuel();
        gas.setFuel(90);
        //Car.Engine.viewType();
        //Car.GasTank.viewFuel();
        //Car.Engine.setType("type1");
        //Car.Engine.viewType();
        //Car.GasTank.setFuel(90);
    }
}
