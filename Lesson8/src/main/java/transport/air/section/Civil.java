package transport.air.section;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import transport.air.AirTransport;

@Getter
@Setter
@SuperBuilder
public class Civil extends AirTransport {
    private int numberPassenger;
    private boolean businessClass;

    @Override
    public void definition() {
        System.out.println("Марка самолёта - " + super.getBrand() +
                "\nМощность - " + getNewPower() + " кВ" +
                "\nМаксимальная скорость - " + super.getMaxSpeed() + " км/ч" +
                "\nМасса - " + super.getWeight() + " кг" +
                "\nРазмах крыльев - " + super.getWingspan() + " м" +
                "\nМинимальная длина взлётно-посадочной полосы для взлёта - " + super.getMinRunwayLen() + " м" +
                "\nКоличество пассажиров - " + numberPassenger +
                "\nНаличие бизнес класса - " + getBusinessCl() + "\n");
    }

    private double getNewPower() {
        double power;
        power = super.getPower() * 0.74;
        return power;
    }

    private String getBusinessCl() {
        if (businessClass) {
            return "есть";
        } else {
            return "нет";
        }
    }

    public void isPossibleLoad(int number) {
        if (number > numberPassenger) {
            System.out.println("Пассажиров слишком много.");
        } else {
            System.out.println("Пассажиры вместились.");
        }
    }
}
