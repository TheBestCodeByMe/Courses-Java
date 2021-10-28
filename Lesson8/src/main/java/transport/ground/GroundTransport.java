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
}
