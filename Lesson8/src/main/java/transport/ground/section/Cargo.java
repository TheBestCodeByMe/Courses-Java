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
        super.definition();
        System.out.println("\nГрузоподъёмность - " + tonnage + " т\n");
    }

    public void isPossibleLoad(int weight) {
        if (weight > tonnage) {
            System.out.println("Вам нужен грузовик побольше.");
        } else {
            System.out.println("Грузовик загружен.");
        }
    }
}
