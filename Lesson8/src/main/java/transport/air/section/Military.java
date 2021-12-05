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
        super.definition();
        System.out.println(
                "\nКоличество ракет на борту - " + numberRocket +
                "\nНаличие системы катапультирования - " + getEject() + "\n");
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
            ejections = false;
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
