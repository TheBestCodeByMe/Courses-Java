package transport;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String brand;

    public void definition(){

    }
}
