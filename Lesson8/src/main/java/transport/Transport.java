package transport;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import transport.ground.GroundTransport;

@Getter
@Setter
@SuperBuilder
public class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String brand;

    public void definition(){
        System.out.print("Марка - " + getBrand() +
                "\nМощность - " + getNewPower() + " кВ" +
                "\nМаксимальная скорость - " + getMaxSpeed() + " км/ч" +
                "\nМасса - " + getWeight() + " кг");
    }

    protected double getNewPower() {
        double power;
        power = getPower() * 0.74;
        return power;
    }
}
