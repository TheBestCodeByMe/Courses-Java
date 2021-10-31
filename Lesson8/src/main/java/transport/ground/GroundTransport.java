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
        System.out.println("Марка машины - " + super.getBrand() +
                "\nМощность - " + getNewPower() + " кВ" +
                "\nМаксимальная скорость - " + super.getMaxSpeed() + " км/ч" +
                "\nМасса - " + super.getWeight() + " кг" +
                "\nКоличество колёс - " + getNumberWheels() +
                "\nРасход топлива - " + getFuelrate() + " л/100км"
             );
    }
}
