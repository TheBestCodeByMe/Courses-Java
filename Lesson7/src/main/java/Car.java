public class Car {
    private boolean carStarted;
    private int distance;
    private String mark;
    private int year;

    public Car(Engine engine, GasTank gasTank) {
        System.out.println("\nМашина создана\n");
    }

    public Car() {
    }

    public class Engine {
        // Здесь переменные статические, поскольку двигатель не меняется, они всегда будут такими
        private static String engine;
        private static String type;
        private static int id = 0;

        public Engine(String engine, String type) {
            if (id == 0) {
                Engine.engine = engine;
                Engine.type = type;
                id++;
            } else {
                System.out.println("Двигатель уже создан.");
            }
        }

        public static String getType() {
            return type;
        }
/*
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
        */
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
        System.out.println("\nТип двигателя " + Car.Engine.getType() + "\n");
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

        public static int getFuel() {
            return fuel;
        } //можно хотя бы здесь статический?))))) Или тоже убрать?
        // Запуталась, как вызвать потом внизу нестатический метод
        // Почему-то не даёт вызвать их

        public static void setFuel(int fuel) {
            if ((GasTank.fuel + fuel) < totalVolumeFuel) {
                GasTank.fuel = fuel;
            } else {
                System.out.println("\nОбъём бензопака меньше, чем вы хотите в него залить.\nОбъём равен " + totalVolumeFuel + " литров.\n");
            }
        }
    }

    public void viewFuel() {
        System.out.println("\nОсталось " + Car.GasTank.getFuel() + " литров топлива.\n");
    }

    public void startCar() {
        if (Car.GasTank.getFuel() != 0) {
            on();
            System.out.println("\nМашина заведена.\n");
            Car.GasTank.setFuel(Car.GasTank.getFuel()-10);
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
}
