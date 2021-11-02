public class Main {
    public static void main(String[] args) {
        Car1 car;// = new Car1();
        Car1.GasTank gasTank = car.new GasTank(60, 100);
        Car1 car1 = new Car1(car.new Engine("engine", "type"), gasTank);
        Car1.GasTank gas = car.new GasTank();
        car.startCar();
        car.turnOffCar();
        car.viewDistance();
        car.viewType();
        car.viewFuel();
        //сar1.viewType();
        //engine.setType("type1");
        //engine.viewType();
        //gas.viewFuel();
        gasTank.setFuel(90);
        car.viewFuel();
        //Car.Engine.viewType();
        //Car.GasTank.viewFuel();
        //Car.Engine.setType("type1");
        //Car.Engine.viewType();
        gasTank.setFuel(90);

    }
}
