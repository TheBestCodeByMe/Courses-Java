public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(car.new Engine("engine", "type"), car.new GasTank(60, 100));
        Car.GasTank gas = car.new GasTank();
        car.startCar();
        car.turnOffCar();
        car.viewDistance();
        car.viewType();
        car.viewFuel();
        //сar1.viewType();
        //engine.setType("type1");
        //engine.viewType();
        //gas.viewFuel();
        Car.GasTank.setFuel(90);
        car.viewFuel();
        //Car.Engine.viewType();
        //Car.GasTank.viewFuel();
        //Car.Engine.setType("type1");
        //Car.Engine.viewType();
        Car.GasTank.setFuel(90);
    }
}
