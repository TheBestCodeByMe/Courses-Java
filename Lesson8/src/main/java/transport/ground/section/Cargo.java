package transport.ground.section;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import transport.ground.GroundTransport;

@Getter
@Setter
@SuperBuilder
public class Cargo extends GroundTransport {
    private int tonnage;

    @Override
    public void definition() {
        System.out.println("Марка машины - " + super.getBrand() +
                "\nМощность - " + getNewPower() + " кВ" +
                "\nМаксимальная скорость - " + super.getMaxSpeed() + " км/ч" +
                "\nМасса - " + super.getWeight() + " кг" +
                "\nКоличество колёс - " + super.getNumberWheels() +
                "\nРасход топлива - " + super.getFuelrate() + " л/100км"+
                "\nГрузоподъёмность - " + tonnage + " т\n");
    }

    private double getNewPower() {
        double power;
        power = super.getPower() * 0.74;
        return power;
    }

    public void isPossibleLoad(int weight) {
        if (weight > tonnage) {
            System.out.println("Вам нужен грузовик побольше.");
        } else {
            System.out.println("Грузовик загружен.");
        }
    }
}
