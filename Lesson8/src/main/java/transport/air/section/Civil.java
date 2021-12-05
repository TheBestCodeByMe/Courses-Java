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
        super.definition();
        System.out.println(
                "\nКоличество пассажиров - " + numberPassenger +
                "\nНаличие бизнес класса - " + getBusinessCl() + "\n");
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
