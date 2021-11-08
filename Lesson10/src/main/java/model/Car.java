package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String model;
    private final Engine engine;
    private TankFuel tankFuel;
    private int distance;

    public Car(Engine engine, TankFuel tankFuel) {
        this.engine = engine;
        this.tankFuel = tankFuel;
    }

    public enum Type {
        HB("хэчбек");

        String name;

        Type(String name) {
            this.name = name;
        }
    }
}
