package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Engine {
    private String engine;
    private String type;
    private boolean startedCar;

    public Engine(String engine, String type) {
        this.engine = engine;
        this.type = type;
    }
}
