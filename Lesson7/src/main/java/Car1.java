public class Car1 {
    private boolean carStarted;
    private int distance;
    private String mark;
    private int year;
    private final Engine engine;
    private GasTank gasTank;

    public Car1(Engine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
    }

    public class Engine{
        private String engine1;
        private String type;
        Engine(String engine1, String type){
            this.engine1 = engine1;
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public class GasTank{
        private int fuel;
        private int totalVolumeFuel;

        public GasTank(int fuel, int totalVolumeFuel) {
            this.fuel = fuel;
            this.totalVolumeFuel = totalVolumeFuel;
        }

        public GasTank() {

        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            if ((this.fuel + fuel) < totalVolumeFuel) {
                this.fuel = fuel;
            } else {
                System.out.println("\nОбъём бензопака меньше, чем вы хотите в него залить.\nОбъём равен " + totalVolumeFuel + " литров.\n");
            }
        }
    }

    private void on() {
        System.out.println("\nДвигатель включён.\n");
        carStarted = true;
    }

    private void off() {
        System.out.println("\nДвигатель выключён.\n");
        carStarted = false;
    }

    public void viewType() {
        System.out.println("\nТип двигателя " + engine.getType() + "\n");
    }

    public void viewFuel() {
        System.out.println("\nОсталось " +  gasTank.getFuel() + " литров топлива.\n");
    }

    public void startCar() {
        if (gasTank.getFuel() != 0) {
            on();
            System.out.println("\nМашина заведена.\n");
            gasTank.setFuel(gasTank.getFuel()-10);
        } else {
            System.out.println("\nМашина не может ехать, бак пустой.\n");
        }
    }

    private void carGoes() {
        if (carStarted) {
            System.out.println("\nМашина поехала.\n");
        }
    }

    public void turnOffCar() {
        off();
        System.out.println("\nМашина заглушена.\n");
        distance += 100;
    }

    public void viewDistance() {
        System.out.println("\nМашина проехала " + distance + " км.\n");
    }

    public boolean isCarStarted() {
        return carStarted;
    }

    public void setCarStarted(boolean carStarted) {
        this.carStarted = carStarted;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }
}
