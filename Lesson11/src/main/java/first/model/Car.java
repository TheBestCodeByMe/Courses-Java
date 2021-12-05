package first.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String model;
    private final Engine engine;
    private TankFuel tankFuel;
    private int distance;
    private String brand;
    private int speed;
    private int price;

    // вместо конструктора без параметров
    // потому что двигатель файнал
    public Car(Engine engine) {
        this.engine = engine;
    }

    public Car(Engine engine, TankFuel tankFuel, String brand, int speed, int price) {
        this.engine = engine;
        this.tankFuel = tankFuel;
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public enum Type {
        HB("хэчбек");

        String name;

        Type(String name) {
            this.name = name;
        }
    }
}
