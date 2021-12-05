package transport.air;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import transport.Transport;

@Getter
@Setter
@SuperBuilder
public class AirTransport extends Transport {
    private int wingspan;
    private int minRunwayLen;

    @Override
    public void definition() {
        super.definition();
        System.out.println(
                "\nРазмах крыльев - " + getWingspan() + " м" +
                "\nМинимальная длина взлётно-посадочной полосы для взлёта - " + getMinRunwayLen() + " м");
    }
}
