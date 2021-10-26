package transport.air.section;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import transport.air.AirTransport;

@Getter
@Setter
@SuperBuilder
public class Military extends AirTransport {
    private boolean ejections;
    private int numberRocket;

    @Override
    public void definition() {
        System.out.println("Марка самолёта - " + super.getBrand() +
                "\nМощность - " + getNewPower() + " кВ" +
                "\nМаксимальная скорость - " + super.getMaxSpeed() + " км/ч" +
                "\nМасса - " + super.getWeight() + " кг" +
                "\nРазмах крыльев - " + super.getWingspan() + " м" +
                "\nМинимальная длина взлётно-посадочной полосы для взлёта - " + super.getMinRunwayLen() + " м" +
                "\nКоличество ракет на борту - " + numberRocket +
                "\nНаличие системы катапультирования - " + getEject() + "\n");
    }

    private double getNewPower() {
        double power;
        power = super.getPower() * 0.74;
        return power;
    }

    private String getEject() {
        if (ejections) {
            return "есть";
        } else {
            return "нет";
        }
    }

    public void isHaveEjection() {
        if (ejections) {
            System.out.println("Катапультирование прошло успешно.");
        } else {
            System.out.println("У вас нет такой системы.");
        }
    }

    public void shot() {
        if (numberRocket == 0) {
            System.out.println("Боеприпасы отсутствуют.");
        } else {
            System.out.println("Ракета пошла...");
            numberRocket--;
        }
    }
}
