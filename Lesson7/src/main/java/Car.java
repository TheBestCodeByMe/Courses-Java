public class Car {
    private static boolean carStarted;
    private static int distance;
    private String mark;
    private int year;

    public Car(Engine engine, GasTank gasTank) {
        System.out.println("\nМашина создана\n");
    }

    public Car() {
    }

    public class Engine {
        private static String engine;
        private static String type;

        public Engine(String engine, String type) {
            Engine.engine = engine;
            Engine.type = type;
        }

        public Engine() {

        }

        private void on() {
            System.out.println("\nДвигатель включён.\n");
            Car.carStarted = true;
        }

        private void off() {
            System.out.println("\nДвигатель выключён.\n");
            Car.carStarted = false;
        }

        public void viewType() {
            System.out.println("\nТип двигателя " + type + "\n");
        }

        public static String getType() {
            return type;
        }

        public void setType(String type) {
            Engine.type = type;
        }
    }

    public class GasTank {
        private static int fuel;
        private static int totalVolumeFuel;

        public GasTank(int fuel, int totalVolumeFuel) {
            GasTank.fuel = fuel;
            GasTank.totalVolumeFuel = totalVolumeFuel;
        }

        public GasTank() {

        }

        public void viewFuel() {
            System.out.println("\nОсталось " + fuel + " литров топлива.\n");
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            if ((GasTank.fuel + fuel) < totalVolumeFuel) {
                GasTank.fuel = fuel;
            } else {
                System.out.println("\nОбъём бензопака меньше, чем вы хотите в него залить.\nОбъём равен " + totalVolumeFuel + " литров.\n");
            }
        }
    }

    public void startCar() {
        GasTank gasTank = new GasTank();
        Engine engine = new Engine();
        if (gasTank.getFuel() != 0) {
            engine.on();
            System.out.println("\nМашина заведена.\n");
            GasTank.fuel -= 10;
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
        Engine engine = new Engine();
        engine.off();
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
        Car.carStarted = carStarted;
    }

    public static int getDistance() {
        return distance;
    }

    public static void setDistance(int distance) {
        Car.distance = distance;
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
}
