package car;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Engine {
    private String engine1;
    private String type;

    public Engine(String engine1, String type) {
        this.engine1 = engine1;
        this.type = type;
    }
}
