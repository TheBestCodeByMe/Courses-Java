package transport.ground;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import transport.Transport;

@Getter
@Setter
@SuperBuilder
public class GroundTransport extends Transport {
    private int numberWheels;
    private int fuelrate;

    // А если так? Можно? Или всё же лучше всё в самый главный метод пытаться занести?
    @Override
    public void definition() {
        super.definition();
        System.out.println(
                "\nКоличество колёс - " + getNumberWheels() +
                "\nРасход топлива - " + getFuelrate() + " л/100км"
             );
    }
}
