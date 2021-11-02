package car;

public class Car implements ICar {
    private boolean carStarted;
    private int distance;
    private String mark;
    private int year;
    private final Engine engine;
    private GasTank gasTank;

    public Car(Engine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
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
        System.out.println("\nОсталось " + gasTank.getFuel() + " литров топлива.\n");
    }

    public void startCar() {
        if (gasTank.getFuel() != 0) {
            on();
            System.out.println("\nМашина заведена.\n");
            gasTank.setFuel(gasTank.getFuel() - 10);
        } else {
            System.out.println("\nМашина не может ехать, бак пустой.\n");
        }
    }

    public void carGoes() {
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
}
